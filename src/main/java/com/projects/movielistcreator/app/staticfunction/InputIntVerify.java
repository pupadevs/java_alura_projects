package com.projects.movielistcreator.app.staticfunction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputIntVerify {
    public static int pedirEntero(Scanner input, String mensaje) {
        int option = 0;
        do {
            try {
                System.out.println(mensaje);
                option = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero válido.");
                // Limpiar el buffer del scanner
                input.nextLine();
            }
        } while (option == 0); // Cambia esta condición según tus necesidades
        return option;
    }
}
