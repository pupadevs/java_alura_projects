package com.projects.movielistcreator;

import com.projects.movielistcreator.infrastructure.menus.PrincipalMenu;

public class CatalogoMain {



    public static void main(String[] args)  {


        try {
            PrincipalMenu.Menus();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }










}





