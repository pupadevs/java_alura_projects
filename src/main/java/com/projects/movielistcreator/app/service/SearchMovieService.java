package com.projects.movielistcreator.app.service;

import com.projects.movielistcreator.domain.entity.Movie;
import com.projects.movielistcreator.domain.MovieRepositoryInterface;
import com.projects.movielistcreator.exceptions.PeliculaNotFoundException;
import com.projects.movielistcreator.infrastructure.repository.MovieRepository;

import java.util.Map;

public class SearchMovieService {

    private static MovieRepositoryInterface movieRepository;


    private static void setMovieRepositoryInterface(MovieRepositoryInterface movieRepositoryInterface) {
        SearchMovieService.movieRepository = movieRepositoryInterface;
    }

  public static Movie searchMovie(String uuid) {
        setMovieRepositoryInterface(new MovieRepository());
        return  movieRepository.getMovieById(uuid);
  }

    public static Movie searchMovieByTitle(String title) {
        setMovieRepositoryInterface(new MovieRepository());
        Map<String, Movie> movies = movieRepository.getAllMovies();
        for (Map.Entry<String, Movie> entry : movies.entrySet()) {
            Movie movie = entry.getValue();
            if (movie.getTitle().getNombre().equalsIgnoreCase(title)) {
                return movie; // Devolvemos la película si encontramos una coincidencia
            }
        }
        // Si no se encuentra ninguna película con el título especificado, lanzamos una excepción
        throw new PeliculaNotFoundException();
    }

    public static Movie searchMovieByGenre(String genre) {
        setMovieRepositoryInterface(new MovieRepository());
        Map<String, Movie> movies = movieRepository.getAllMovies();
        for (Map.Entry<String, Movie> entry : movies.entrySet()) {
            Movie movie = entry.getValue();
            if (movie.getTitle().getNombre().equalsIgnoreCase(genre)) {
                return movie; // Devolvemos la película si encontramos una coincidencia
            }
        }
        // Si no se encuentra ninguna película con el título especificado, lanzamos una excepción
        throw new PeliculaNotFoundException();
    }

}
