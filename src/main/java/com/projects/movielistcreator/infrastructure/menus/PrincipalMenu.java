package com.projects.movielistcreator.infrastructure.menus;

import com.projects.Main;
import com.projects.movielistcreator.app.service.UpdateMovieService;
import com.projects.movielistcreator.app.staticfunction.InputIntVerify;
import com.projects.movielistcreator.domain.valueObject.StringRequestException;
import com.projects.movielistcreator.exceptions.InvalidApiKeyException;
import com.projects.movielistcreator.exceptions.PeliculaNotFoundException;
import com.projects.movielistcreator.exceptions.TitleExistException;
import com.projects.movielistcreator.infrastructure.userinput.CreateMovieInput;
import com.projects.movielistcreator.utils.command.DeleteMovie;
import com.projects.movielistcreator.app.service.ShowAllMovieService;
import com.projects.movielistcreator.app.service.CreateMovie;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;


public class PrincipalMenu {
    private static final Scanner input = new Scanner(System.in);


    public static void Menus() {
        int opcion;
        String msg = """
                Que quieres hacer??
                7.- Salir de la application.
                1.- Crear Película.
                2.- Eliminar Película
                3.- Buscar Película
                4.- Ver todas las movie
                5.- Editar Películas
                6.- Menu Api's\s
                """;
        try {


            do {
                opcion = InputIntVerify.pedirEntero(input, msg);
                switch (opcion) {


                    case 1:
                        input.nextLine();
                        CreateMovie.crearPelicula(CreateMovieInput.movieRequest(input));

                        break;
                    case 2:
                        DeleteMovie.EliminaPelicula();
                        break;
                    case 3:
                        SearchMenu.searchMovie(input);
                        break;
                    case 4:
                        ShowAllMovieService.allMovies();
                        break;
                    case 5:
                        input.nextLine();
                        UpdateMovieService.updateMovie("ee44ee72-5271-4d2b-8af6-83a8b691e9e3", CreateMovieInput.movieRequest(input));
                        break;
                    case 6:
                        ApiMenu.menuPlataforma(input);

                        break;
                    case 7:
                        String[] args = new String[0];
                        Main.main(args);
                        break;

                }

            } while (opcion != 6);

        } catch (@NotNull StringRequestException | InterruptedException | PeliculaNotFoundException | IllegalArgumentException |
                          InvalidApiKeyException | TitleExistException e) {
            System.err.println("Message:" + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}

