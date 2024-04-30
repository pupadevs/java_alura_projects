package com.projects.banco.menus;

import java.util.Scanner;

public class MenuOperacion {

    public static void operacionesCuenta(){
        Scanner input = new Scanner(System.in);
       String msg = """
                Que desea hacer?
                1 - Ingresar Dinero sin cuenta
                2- Acceso a Cuentas
                3- Eliminar cuenta
                4- Crear nueva Cuenta
                5 - Volver
                """;
       int opcion ;
       do{
           System.out.println(msg);
           opcion = input.nextInt();
           switch (opcion){
            //   case 4: CrearNuevaCuenta();
               case 1:
                   break;
               case 2:
                   break;

           };

       }while (opcion != 5);
    }
}
