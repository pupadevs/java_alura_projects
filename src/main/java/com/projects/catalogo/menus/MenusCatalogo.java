package com.projects.catalogo.menus;

import com.projects.Main;
import com.projects.catalogo.exceptions.PeliculaNotFoundException;
import com.projects.catalogo.utils.Tablero;
import com.projects.catalogo.utils.command.CrearPelicula;
import com.projects.catalogo.utils.command.EliminarPelicula;
import com.projects.catalogo.utils.query.BuscarPelicula;
import com.projects.catalogo.utils.query.MostrarPeliculas;

import java.util.InputMismatchException;
import java.util.Scanner;



public class MenusCatalogo {
  private static   Scanner input = new Scanner(System.in);



    public static void Menus() throws Exception {
        int opcion = 0;
        String msg = """
                    Que quieres hacer??
                    5.- Salir de la aplicacion.
                    1.- Crear Pelicula.
                    2.- Eliminar Pelicula
                    3.- Buscar Pelicula
                    4.- Ver todas las pelicula
                    """;

        do{
            System.out.println(msg);

          opcion=  input.nextInt();
            switch (opcion){


                case 1:
                    CrearPelicula.crearPelicula();
                    break;
                case 2: EliminarPelicula.EliminaPelicula();
                break;
                case 3: buscarPeliculas();
                    break;
                case 4: MostrarPeliculas.verTodasLasPeliculas();
                    break;
                case 5:
                    String[] args = new String[0];
                    Main.main(args);

            }

        }while (opcion !=0);

    }



    public static void buscarPeliculas() {
        int seleccion;
        try{
            do {
                System.out.println("""
                    Como desea buscar las peliculas?
                    1.- Por titulo.
                    2.- Por Categoria.
                    3.- Por ID.
                    0.- Volver""");

                seleccion = input.nextInt();
                switch (seleccion){
                    case 1:
                        input.nextLine();

                       Tablero.PrintTablero(BuscarPelicula.buscarPeliculasPorTitulo());
                        break;
                    case 2:
                        input.nextLine();


                       Tablero.PrintTablero( BuscarPelicula.buscarPeliculasPorCategoria());
                        break;
                }
            }while (seleccion != 0);


        }catch (PeliculaNotFoundException peliculaNotFound){
            System.out.println("Message:" + peliculaNotFound.getMessage());
        }



    }


    public static int pedirEntero(Scanner input, String mensaje) {
        int opcion = 0;
        do {
            try {
                System.out.print(mensaje);
                opcion = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero válido.");
                // Limpiar el buffer del scanner
                input.nextLine();
            }
        } while (opcion == 0); // Cambia esta condición según tus necesidades
        return opcion;

    }


    }

