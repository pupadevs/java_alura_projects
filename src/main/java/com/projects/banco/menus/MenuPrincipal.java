package com.projects.banco.menus;

import com.projects.Main;
import com.projects.banco.utils.command.CreateCliente;

import java.util.Scanner;

public class MenuPrincipal {

    public static void mainMenu() throws Exception {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        String  msg = """
                Escoga una opcion:
                1- Crear Cliente
                2- Operaciones
                3- Volver
          
                """;

        do{
            System.out.println(msg);
            opcion = input.nextInt();
            switch (opcion){
                case 1:
                    CreateCliente.registarCliete();
                    break;
                case 2:
                    break;
                case 3:   String[] args = new String[0];
                    Main.main(args);
                    break;
            };


        }while (opcion !=3);
    }
}
