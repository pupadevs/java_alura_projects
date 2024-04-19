package com.projects.banco.entity;

import com.projects.banco.entity.stringvalueobject.cuenta.CuentaID;
import com.projects.banco.entity.stringvalueobject.cuenta.NumeroCuenta;

public class Cuenta {

    private CuentaID cuentaID;
    private NumeroCuenta numeroCuenta;

    public Cuenta(CuentaID cuentaID, NumeroCuenta numeroCuenta){
        this.cuentaID = cuentaID;
        this.numeroCuenta = numeroCuenta;
    }

    public static Cuenta createCuenta(){
        return new Cuenta(
                new CuentaID(),
                new NumeroCuenta()
        );
    }

    public CuentaID getCuentaID() {
        return cuentaID;
    }

    public NumeroCuenta getNumeroCuenta() {
        return numeroCuenta;
    }
}
