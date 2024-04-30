package com.projects.movielistcreator.app.service;

import com.projects.movielistcreator.domain.entity.Movie;
import com.projects.movielistcreator.domain.valueObject.Genre;
import com.projects.movielistcreator.domain.valueObject.RunTime;
import com.projects.movielistcreator.domain.valueObject.Title;
import com.projects.movielistcreator.domain.valueObject.Year;
import com.projects.movielistcreator.exceptions.TitleExistException;
import com.projects.movielistcreator.infrastructure.repository.MovieRepository;
import com.projects.movielistcreator.domain.MovieRepositoryInterface;

import java.util.Map;

public class CreateMovie {

    private static MovieRepositoryInterface movieRepositoryInterface;

    public static void setMovieRepositoryInterface(MovieRepositoryInterface movieRepositoryInterface) {
        CreateMovie.movieRepositoryInterface = movieRepositoryInterface;
    }
    public static void crearPelicula(Map<String, String> movieData)  {
        Movie movie = Movie.createPelicula(new Title(movieData.get("title")), new Genre(movieData.get("genre")), new RunTime(movieData.get("runTime")), new Year(movieData.get("year")));
        setMovieRepositoryInterface(new MovieRepository());
        movieRepositoryInterface.createMovie(movie);
        //   movies.add(movie);

    }
    public static void verifyTitle(String title)  {
        setMovieRepositoryInterface(new MovieRepository());
        Map<String, Movie> data = movieRepositoryInterface.getAllMovies();

        for (Map.Entry<String, Movie> entry : data.entrySet()) {
            Movie movie = entry.getValue();
            if (movie.getTitle().ToString().equalsIgnoreCase(title)) {
                throw new TitleExistException();
            }
        }

    }

}
