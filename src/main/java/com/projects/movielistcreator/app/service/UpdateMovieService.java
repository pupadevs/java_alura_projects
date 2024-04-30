package com.projects.movielistcreator.app.service;

import com.projects.movielistcreator.domain.entity.Movie;
import com.projects.movielistcreator.domain.MovieRepositoryInterface;
import com.projects.movielistcreator.infrastructure.repository.MovieRepository;

import java.util.Map;

public class UpdateMovieService {
    private static MovieRepositoryInterface movieRepository;

    private static void setMovieRepositoryInterface(MovieRepositoryInterface movieRepositoryInterface) {
        UpdateMovieService.movieRepository = movieRepositoryInterface;
    }

    public static   Movie updateMovie(String uuid, Map<String, String> movie){
        setMovieRepositoryInterface(new MovieRepository());
       // Movie movieData = Movie.fromHashMap(movie);
        Movie movieObject = Movie.fromHashMap(movie);

        if (movieRepository.exist(uuid)){
            return movieRepository.updateMovie(uuid, movieObject);

        }

        return movieObject;
    }
}
