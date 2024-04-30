package com.projects.movielistcreator.domain;

import com.projects.movielistcreator.domain.entity.Movie;


import java.util.Map;

public interface MovieRepositoryInterface {
    Movie createMovie(Movie movie);
    Movie getMovieById(String id);
    boolean exist(String id);
     Map<String, Movie> getAllMovies();
      void saveToJSon();
    Movie updateMovie(String id, Movie updatedMovie);
    void deleteMovie(String id);
}
