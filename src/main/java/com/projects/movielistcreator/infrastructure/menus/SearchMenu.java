package com.projects.movielistcreator.infrastructure.menus;

import com.projects.movielistcreator.app.service.SearchMovieService;
import com.projects.movielistcreator.infrastructure.userinput.SearchMovieByTitleInput;
import com.projects.movielistcreator.infrastructure.userinput.SearchMovieByIdInput;
import com.projects.movielistcreator.utils.Table;
import com.projects.movielistcreator.app.staticfunction.InputIntVerify;
import java.util.Scanner;

public class SearchMenu {

    public static void searchMovie(Scanner input) throws  InterruptedException {
        int seleccion;
        var msg = """
                Como desea buscar las películas?
                1.- Por título.
                2.- Por ID.
                3.- Volver""";

        do {
            //System.out.println(msg);

            seleccion = InputIntVerify.pedirEntero(input, msg);
            switch (seleccion) {
                case 1:
                    input.nextLine();

                    Table.PrintTablero(SearchMovieService.searchMovieByTitle(SearchMovieByTitleInput.searchMovieByTitle(input)));
                    break;
                case 2:
                    input.nextLine();
                    Table.PrintTablero(SearchMovieService.searchMovie(SearchMovieByIdInput.searchMovieById(input)));
                    break;
            }
        } while (seleccion != 3);


    }
}
