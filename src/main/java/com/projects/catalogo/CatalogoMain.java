package com.projects.catalogo;


import com.projects.catalogo.classes.Pelicula;
import com.projects.catalogo.classes.stringvalueObject.Catalogo.Categoria;
import com.projects.catalogo.classes.stringvalueObject.Catalogo.Duracion;
import com.projects.catalogo.classes.stringvalueObject.Catalogo.Nombre;
import com.projects.catalogo.classes.stringvalueObject.Catalogo.PeliculaID;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;

public class CatalogoMain {

    private static final Scanner input = new Scanner(System.in);
    public static ArrayList<Pelicula> peliculas = new ArrayList<>();
    public static void main(String[] args) {

        int opcion = 0;

        System.out.println("klk");

        do{

            System.out.println("Que quieres hacer??"); //Menu para la aplicacion
            System.out.println("""
                    0.- Salir de la aplicacion.
                    1.- Crear Pelicula.
                    2.- Eliminar Pelicula
                    3.- Buscar Pelicula
                    4.- Ver todas las pelicula
                    """);
            opcion = input.nextInt();
            switch (opcion){
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
                    //  end = true;
                    break;
                case 1: crearPelicula();
                    break;

                case 3: buscarPeliculas();
                    break;
                case 4: verTodasLasPeliculas();
                break;

            }


        }while (opcion !=0);



    }

    private static void crearPelicula() {
        input.nextLine();

        System.out.println("Bienvenido para crear una pelicula");
        System.out.println("Introduzca el nombre");
        String nombre = input.nextLine();
        System.out.println("Introduzca categoria");
        String categoria = input.nextLine();
        System.out.println("Que duracion tiene la pelicula");
        String duracion = input.nextLine();
        Time tiempo = Time.valueOf(duracion);
        Pelicula pelicula = new Pelicula(new PeliculaID(), new Nombre(nombre), new Categoria(categoria), new Duracion(tiempo));
        peliculas.add(pelicula);
    }

    private static void buscarPeliculas(){
        int seleccion = 0;
        do {
            System.out.println("Como desea buscar las peliculas?");
            System.out.println("""
                    1.- Por titulo.
                    2.- Por Categoria.
                    3.- Por ID.
                    4.- Por duracion
                    0.- Salir""");

            seleccion = input.nextInt();
            switch (seleccion){
                case 1:
                    input.nextLine();

                    buscarPeliculasPorNombre();
                  break;
                case 2:
                    input.nextLine();


                    buscarPeliculasPorCategoria();
            }
        }while (seleccion != 0);



    }
    private static void verTodasLasPeliculas(){
        System.out.println("+--------------------------------------+----------------------+----------------------+----------------------+");
        System.out.println("|                 Id                   |        Titulo        |      Categoria       |       Duracion       ");
        System.out.println("+--------------------------------------+----------------------+----------------------+----------------------+");

        for (Pelicula pelicula : peliculas) {
            System.out.printf("| %-10s | %-20s | %-20s | %-20s%n", pelicula.getPeliculaID().getUuid().getId(), pelicula.getNombre().ToString(), pelicula.getCategoria().ToString(),
                    pelicula.getDuracion().ToString());
        }

        System.out.println("+--------------------------------------+----------------------+----------------------+----------------------+");
    }

    private static void buscarPeliculasPorNombre(){
        System.out.println("Introduzca el titulo de la pelicula");
        String titulo = input.nextLine();
        for (Pelicula pelicula: peliculas){
            if(pelicula.getNombre().ToString().equalsIgnoreCase(titulo)){
                System.out.println(pelicula.getPeliculaID().getUuid().getId());
                break;
            }else{
                System.out.println("nada");
            }
        }
    }
    private static void buscarPeliculasPorCategoria(){
        System.out.println("Introduzca la categoria de la pelicula");
        String categoria = input.nextLine();
        for (Pelicula pelicula: peliculas){
            if(pelicula.getCategoria().ToString().equals(categoria)){
                System.out.println("+--------------------------------------+----------------------+----------------------+----------------------+");
                System.out.println("|                 Id                   |        Titulo        |      Categoria       |       Duracion       ");
                System.out.println("+--------------------------------------+----------------------+----------------------+----------------------+");
                System.out.println(pelicula.toString());
            }
        }
    }
}





