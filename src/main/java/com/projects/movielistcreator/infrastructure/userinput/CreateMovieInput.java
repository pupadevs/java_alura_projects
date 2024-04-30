package com.projects.movielistcreator.infrastructure.userinput;

import com.projects.movielistcreator.exceptions.TitleExistException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static com.projects.movielistcreator.app.service.CreateMovie.verifyTitle;

public class CreateMovieInput {


    public static Map<String, String> movieRequest(Scanner input) throws TitleExistException {
        Map<String, String> movieData = new HashMap<>();

        System.out.println("Bienvenido para crear una película");
        System.out.println("Introduzca el nombre");
        //input.nextLine();
        String title = input.nextLine();
        verifyTitle(title);
        movieData.put("title", title);

        System.out.println("Introduzca la categoría");
        String genre = input.nextLine();
        movieData.put("genre", genre);

        System.out.println("¿Cuál es la duración de la película?");
        String runTime = input.nextLine();
        movieData.put("runTime", runTime);

        System.out.println("Año de estreno");
        String year = input.nextLine();
        movieData.put("year", year);

        return movieData;
    }
}
