package com.projects.banco.menus;

import com.projects.banco.utils.command.CreateCliente;

import java.util.Scanner;

public class MenuCliente {

    public static void operacionesCliente(){
        Scanner scanner = new Scanner(System.in);
        String opcion;
        do {
            System.out.println("""
                    Menú:
                    1. Crear cliente
                    2. Eliminar cliente
                    3. Ver cliente
                    4. Salir
                    Ingrese la opción:""");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1" -> CreateCliente.registarCliente(scanner);
             //   case "2" -> //eliminarCliente(scanner);
              ////  case "3" ->// verCliente(scanner);
                case "4" -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        } while (!opcion.equals("4"));

        scanner.close();


    }
}
