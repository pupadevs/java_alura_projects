package com.projects.movielistcreator.infrastructure.userinput;

import java.util.Scanner;

public class SearchMovieByTitleInput {

    public static String searchMovieByTitle(Scanner input) {
        String tile;

        System.out.println("Introduzca el title del usuario");
        tile = input.nextLine();

        return tile;

    }
}
