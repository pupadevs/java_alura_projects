package com.projects.movielistcreator.infrastructure.userinput;

import java.util.Scanner;

public class SearchMovieByIdInput {

    public static String searchMovieById(Scanner input){
        String uuuid;

        System.out.println("Introduzca el uuid del usuario");
        uuuid = input.nextLine();

        return uuuid;

    }
}
