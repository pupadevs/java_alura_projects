package com.projects.banco.utils.command;

import com.projects.banco.entity.Cliente;
import com.projects.banco.entity.Cuenta;
import com.projects.banco.entity.stringvalueobject.cliente.Email;
import com.projects.banco.entity.stringvalueobject.cliente.Nombre;
import com.projects.banco.entity.stringvalueobject.cliente.Password;
import com.projects.banco.entity.stringvalueobject.exception.EmailIsnotValidException;

import java.util.Scanner;

public class CreateCliente {

    public static void registarCliete(){
        Scanner input = new Scanner(System.in);
        String nombre;
        String email;
        String password;
        try{

            System.out.println("Nombre completo del cliente");
            nombre = input.nextLine();
            System.out.println("Email");
            email = input.nextLine();
            System.out.println("escriba su password");
            password = input.nextLine();
        Cliente  cl =  Cliente.CrearCliente(new Nombre(nombre), new Email(email), new Password(password));
        cl.agregarCuenta(Cuenta.createCuenta());
            System.out.println(cl.toString());


        }catch (EmailIsnotValidException emailIsnotValidException){
            System.out.println(emailIsnotValidException.getMessage());
        }

    }
}
