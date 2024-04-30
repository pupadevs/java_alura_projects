package com.projects.movielistcreator.infrastructure.repository;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.projects.movielistcreator.domain.entity.Movie;
import com.projects.movielistcreator.exceptions.PeliculaNotFoundException;
import com.projects.movielistcreator.domain.MovieRepositoryInterface;

import java.io.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class MovieRepository implements MovieRepositoryInterface {
    private static final String JSON_FILE_PATH = "movies.json";
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static Map<String, Movie> movelists = new HashMap<>();

    public MovieRepository() {
        loadFromJson();
        saveToJSon();
    }

    @Override
    public Movie createMovie(Movie movie) {
        movelists.put(String.valueOf(movie.getPeliculaID().getUuid()), movie);
        saveToJSon();
        return movie;
    }

    @Override
    public Movie getMovieById(String id) {
        if (movelists.get(id) == null) {
          throw new PeliculaNotFoundException();
        }
        return movelists.get(id);

    }

    public boolean exist(String id) {
        if (movelists.get(id) == null) {
            throw new PeliculaNotFoundException();
        }
        return true;

    }

    @Override
    public Map<String, Movie> getAllMovies() {
        return movelists;
    }

    @Override
    public void saveToJSon() {
        /* Escribimos el archivo con FileWriter y enviamos el map de movieList */
        try {
        Writer writer = new FileWriter(JSON_FILE_PATH);
            gson.toJson(movelists, writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Movie updateMovie(String id, Movie updatedMovie) {
        movelists.put(id, updatedMovie);
        saveToJSon();
        return updatedMovie;
    }

    @Override
    public void deleteMovie(String id) {
        movelists.remove(id);
        saveToJSon();
    }



    private void loadFromJson() {
        //Creamos un archivo y si
        File jsonFile = new File(JSON_FILE_PATH);
        if (jsonFile.exists()) {
            try (Reader reader = new FileReader(jsonFile)) {
                Type type = new TypeToken<Map<String, Movie>>() {}.getType();
                movelists = gson.fromJson(reader, type);

            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

}
