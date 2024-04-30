package com.projects.movielistcreator.infrastructure.menus;

import com.projects.movielistcreator.app.staticfunction.InputIntVerify;
import com.projects.movielistcreator.utils.Table;
import com.projects.movielistcreator.infrastructure.api.OmdbSearch;

import java.util.Scanner;

public class ApiMenu {

    public static void menuPlataforma(Scanner scanner)  {
int option;
        String var = """
            Selecciona una API para buscar películas:
            1. OMDB
            2. The Movie Database (TMDB)
            3. Open Movie Database (Open Movie DB)
            4. The Open Movie Database (The Open Movie DB)
            5. Volver...
            """;
do {
    System.out.print("Escribe el número de la opción deseada: ");

     option = InputIntVerify.pedirEntero(scanner, var);

    switch (option) {
        case 1:
            Table.PrintTablero(OmdbSearch.buscarPeliculasPorTitulo(scanner));
            break;
        case 2:
            System.out.println("Seleccionaste The Movie Database (TMDB)");
            break;
        case 3:
            System.out.println("Seleccionaste Open Movie Database (Open Movie DB)");
            break;
        case 4:
            System.out.println("Seleccionaste The Open Movie Database (The Open Movie DB)");
            break;
        case 5:
            System.out.println("Seleccionaste Otras opciones...");
            // Aquí puedes agregar más opciones si lo deseas
            break;
        default:
            System.out.println("Opción no válida");
    }

}while (option != 5);
        // Procesar la opción seleccionada

    }
}
