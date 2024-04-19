package com.projects.catalogo;

import com.projects.catalogo.menus.MenusCatalogo;
import com.projects.catalogo.entity.Pelicula;


import java.util.ArrayList;


public class CatalogoMain {


    public static ArrayList<Pelicula> peliculas = new ArrayList<>();
    public static void main(String[] args)  {


        try {
            MenusCatalogo.Menus();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }










}





