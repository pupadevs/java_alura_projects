package com.projects.banco;

import com.projects.banco.entity.Cliente;
import com.projects.banco.entity.stringvalueobject.cliente.Email;
import com.projects.banco.entity.stringvalueobject.cliente.Nombre;
import com.projects.banco.entity.stringvalueobject.cliente.Password;
import com.projects.banco.menus.MenuPrincipal;

public class BancoMain {
    public static void main(String[] args) {
        try {
            MenuPrincipal.mainMenu();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
