package com.projects.catalogo.utils.command;


import com.projects.catalogo.classes.Pelicula;
import com.projects.catalogo.exceptions.PeliculaNotFoundException;
import com.projects.catalogo.utils.query.BuscarPelicula;


import static com.projects.catalogo.CatalogoMain.peliculas;

public class EliminarPelicula {
    public static void EliminaPelicula()  {



        try {
           Pelicula pelicula = BuscarPelicula.buscarPeliculasPorTitulo();

            boolean remove = peliculas.remove(pelicula);
            if(remove){
                System.out.println("Pelicula eliminada");
            }

        } catch (PeliculaNotFoundException e) {
            System.out.println(e.getMessage());
        }




    }
}
