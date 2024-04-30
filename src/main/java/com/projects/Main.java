package com.projects;

import com.projects.banco.BancoMain;
import com.projects.movielistcreator.CatalogoMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la aplicación a iniciar:");
        System.out.println("1. Catálogo de películas");
        System.out.println("2. Banco");
        System.out.print("Ingrese su elección: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 0:
                System.out.println("ADIOS");
                System.out.println("         *(0 0)* ");
                System.out.println("  ---oOO-- (_) ----oOO---");
                System.out.println("|_________________________|");
                System.out.println("|          By             |");
                System.out.println("|          Pupa!          |");
                System.out.println("|_________________________|");
                System.out.println("   -------------------");
                System.out.println("        |__|__|");
                System.out.println("         || || ");
                System.out.println("         ooO Ooo ");
            case 1:
                CatalogoMain.main(args);
                break;
            case 2:
                BancoMain.main(args);
                break;
            default:
                System.out.println("Opción no válida. Saliendo del programa.");
        }


        scanner.close();
    }
}
