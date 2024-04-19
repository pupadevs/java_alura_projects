package com.projects.banco.menus;

import java.util.Scanner;

public class MenuCuenta {


    public  static void MainMenu(){
        Scanner input = new Scanner(System.in);

        int opcion = 0;
      String  msg = """
                Escoga una opcion:
                1- Ingresar Dinero sin Libreta
                2- Acceso con Cuenta
                3- Acceson email y contrasña
                4-volver
                """;
        do{
            System.out.println(msg);
            opcion = input.nextInt();
            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;

            };


        }while (opcion !=4);
    }
}
