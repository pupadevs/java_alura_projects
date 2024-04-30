package com.projects.movielistcreator.app.service;

import com.projects.movielistcreator.domain.entity.Movie;
import com.projects.movielistcreator.infrastructure.repository.MovieRepository;
import com.projects.movielistcreator.domain.MovieRepositoryInterface;
import com.projects.movielistcreator.utils.Table;

import java.util.Map;

public class ShowAllMovieService {
    private static MovieRepositoryInterface movieRepositoryInterface;
    private static MovieRepository movieRepository;

    private static void setMovieRepositoryInterface(MovieRepositoryInterface movieRepositoryInterface) {
        ShowAllMovieService.movieRepositoryInterface = movieRepositoryInterface;
    }

    public static void allMovies()  {
        setMovieRepositoryInterface(new MovieRepository());
        Map<String, Movie> movies = movieRepositoryInterface.getAllMovies();
        for (Map.Entry<String, Movie> entry : movies.entrySet()) {
            Movie movie = entry.getValue();
            Table.PrintTablero(movie);
        }

    }
}
