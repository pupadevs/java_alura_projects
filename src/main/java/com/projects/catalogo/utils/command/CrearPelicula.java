package com.projects.catalogo.utils.command;

import com.projects.catalogo.classes.Pelicula;
import com.projects.catalogo.classes.stringvalueObject.Catalogo.Categoria;
import com.projects.catalogo.classes.stringvalueObject.Catalogo.Duracion;
import com.projects.catalogo.classes.stringvalueObject.Catalogo.NameRequestException;
import com.projects.catalogo.classes.stringvalueObject.Catalogo.Nombre;
import com.projects.catalogo.exceptions.TitleExistException;

import java.sql.Time;
import java.util.Scanner;


import static com.projects.catalogo.CatalogoMain.peliculas;

public class CrearPelicula {
    static Scanner input = new Scanner(System.in);

    public static void crearPelicula() {

        try{
            System.out.println("Bienvenido para crear una pelicula");
            System.out.println("Introduzca el nombre");
            String nombre = input.nextLine();
            verifyTitle(nombre);
            System.out.println("Introduzca categoria");
            String categoria = input.nextLine();
            System.out.println("Que duracion tiene la pelicula");
            String duracion = input.nextLine();
            Time tiempo = Time.valueOf(duracion);
            Pelicula pelicula =  Pelicula.createPelicula( new Nombre(nombre), new Categoria(categoria), new Duracion(tiempo));
            peliculas.add(pelicula);

        }catch (NameRequestException | TitleExistException exception){
            System.out.println(exception.getMessage());
        }

    }
    private static void verifyTitle(String title) throws TitleExistException {
        for (Pelicula pelicula: peliculas){
            if (pelicula.getNombre().ToString().equalsIgnoreCase(title)){
                throw  new TitleExistException();
            }
        }

    }

}