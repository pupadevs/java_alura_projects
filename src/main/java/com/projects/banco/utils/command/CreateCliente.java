package com.projects.banco.utils.command;

import com.projects.banco.entity.Cliente;
import com.projects.banco.entity.Cuenta;
import com.projects.banco.entity.stringvalueobject.cliente.ClienteID;
import com.projects.banco.entity.stringvalueobject.cliente.Email;
import com.projects.banco.entity.stringvalueobject.cliente.Nombre;
import com.projects.banco.entity.stringvalueobject.cliente.Password;
import com.projects.banco.entity.stringvalueobject.exception.EmailIsnotValidException;

import java.util.Scanner;

public class CreateCliente {

    public static void registarCliente( Scanner input){
       // Scanner input = new Scanner(System.in);
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
            Cuenta cuenta = Cuenta.createCuenta(new ClienteID(String.valueOf(cl.getClienteID().ToString().getId())));
            if(cl.existNumCuenta(cuenta.getNumeroCuenta().ToString())){
                cuenta = Cuenta.createCuenta(new ClienteID(String.valueOf(cl.getClienteID().ToString().getId())));
            }
        cl.agregarCuenta(cuenta);
            System.out.println(cl);


        }catch (EmailIsnotValidException emailIsnotValidException){
            System.out.println(emailIsnotValidException.getMessage());
        }

    }
}
