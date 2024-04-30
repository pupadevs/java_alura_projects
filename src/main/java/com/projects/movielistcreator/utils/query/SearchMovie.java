package com.projects.movielistcreator.utils.query;

import com.projects.movielistcreator.domain.entity.Movie;
import com.projects.movielistcreator.domain.valueObject.StringRequestException;
import com.projects.movielistcreator.exceptions.PeliculaNotFoundException;


import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import static com.projects.movielistcreator.infrastructure.repository.MovieRepository.movelists;


public class SearchMovie {
    private  static Scanner input = new Scanner(System.in);
    public static Movie searchMovieWithTitle() throws PeliculaNotFoundException, IOException, InterruptedException, StringRequestException {
        System.out.println("Introduzca el titulo de la pelicula");
        String titulo = input.nextLine();

        for (Map.Entry<String, Movie> entry : movelists.entrySet()) {
            Movie movie = entry.getValue();
          if(movie.getTitle().ToString().equalsIgnoreCase(titulo)){
              return movie;
          }
        }
        throw new PeliculaNotFoundException();

    }

    public static Movie searchMovieWithGenre() throws PeliculaNotFoundException {
        System.out.println("Introduzca la categoria de la pelicula");
        String genre = input.nextLine();



        return null;



    }


}
