package com.projects.banco.entity;

import com.projects.banco.entity.stringvalueobject.cliente.ClienteID;
import com.projects.banco.entity.stringvalueobject.cuenta.CuentaID;
import com.projects.banco.entity.stringvalueobject.cuenta.NumeroCuenta;

public class Cuenta {

    private CuentaID cuentaID;
    private NumeroCuenta numeroCuenta;
    private ClienteID clienteID;

    private double saldo = 4000;

    public Cuenta(CuentaID cuentaID, NumeroCuenta numeroCuenta, ClienteID clienteID){
        this.cuentaID = cuentaID;
        this.numeroCuenta = numeroCuenta;
        this.clienteID = clienteID;
        //this.saldo = 4000;
    }

    public static Cuenta createCuenta(ClienteID clienteID){
        return new Cuenta(
                new CuentaID(),
                new NumeroCuenta(),
                clienteID


        );
    }

    public CuentaID getCuentaID() {
        return cuentaID;
    }


    public void agregarSaldo(double cantidad){
        if(cantidad > 0){
            this.saldo+= cantidad;
        }
    }

    public void retirarsaldo(double cantidad){
        if(cantidad > 0){
            if(this.saldo >= cantidad){
                this.saldo-=cantidad;
            }
        }
    }

    public NumeroCuenta getNumeroCuenta() {
        return numeroCuenta;
    }

}
