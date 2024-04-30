package com.projects.movielistcreator.infrastructure.api;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.projects.movielistcreator.app.service.CreateMovie;
import com.projects.movielistcreator.domain.entity.Movie;
import com.projects.movielistcreator.domain.entity.MovieOmdb;
import com.projects.movielistcreator.exceptions.InvalidApiKeyException;
import com.projects.movielistcreator.exceptions.PeliculaNotFoundException;
import com.projects.movielistcreator.exceptions.TitleExistException;
import com.projects.movielistcreator.infrastructure.repository.MovieRepository;
import com.projects.movielistcreator.domain.MovieRepositoryInterface;
import com.projects.movielistcreator.domain.valueObject.*;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class OmdbSearch {

    private static MovieRepositoryInterface movieRepositoryInterface;

    private static void setMovieRepositoryInterface(MovieRepositoryInterface movieRepositoryInterface) {
        OmdbSearch.movieRepositoryInterface = movieRepositoryInterface;
    }

    public static Movie buscarPeliculasPorTitulo(Scanner input) throws StringRequestException, TitleExistException {
        input.nextLine();
        System.out.println("Introduzca el apikey");
        String apiKey = input.nextLine();
        System.out.println("Introduzca el título de la película");
        String titulo = input.nextLine();
        //Creamos Objeto Json
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        HttpResponse<String> response = makeRequest(titulo, apiKey);

        MovieOmdb movieOmdb = gson.fromJson(response.body(), MovieOmdb.class);


        Movie movie = Movie.createPelicula(new Title(movieOmdb.title()), new Genre(movieOmdb.genre()), new RunTime(movieOmdb.runtime())
                , new Year(movieOmdb.year()));


        return addMovieArray(movie, input);
    }

    private static HttpResponse<String> makeRequest(String movieTitle, String apiKey){
        // Crear un cliente HTTP
        HttpClient client = HttpClient.newHttpClient();
        // String apiKey = "40838df5";
        // Construir la URL con los parámetros proporcionados
        var baseUrl = "http://www.omdbapi.com/";
        //  String queryParams = String.format("?apikey=%s&t=%s", apiKey.replace(" ", ""), movieTitle.replace(" ", "%20"));
        String queryParams = String.format("?apikey=%s&t=%s",
                URLEncoder.encode(apiKey, StandardCharsets.UTF_8),
                URLEncoder.encode(movieTitle, StandardCharsets.UTF_8));
        String url = baseUrl + queryParams;

        // Construir la solicitud HTTP GET
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        // Enviar la solicitud y recibir la respuesta
        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }



        client.close();
        /* Lanzo exception */
        if (response.statusCode() == 401) {
            throw new InvalidApiKeyException();
        }
        if (response.body().contains("\"Movie not found!")) {
            throw new PeliculaNotFoundException();
        }

        return response;
    }

    private static Movie addMovieArray(Movie movie, @NotNull Scanner input) throws TitleExistException {
        String option;
        Movie data =null;
        do {
            System.out.println("Quiere agregar la película a la base de datos. Responda S o N");
            option = input.nextLine();
            if (option.equalsIgnoreCase("S")) {
            
                CreateMovie.verifyTitle(movie.getTitle().getNombre());
              
                setMovieRepositoryInterface( new MovieRepository());
                data= movieRepositoryInterface.createMovie(movie);
                
                System.out.println("Película agregada con exito");
            }
        } while (!option.equalsIgnoreCase("S") && !option.equalsIgnoreCase("N"));
return data = movie;
    }
}
