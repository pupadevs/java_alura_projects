package com.projects.banco.entity.stringvalueobject.cuenta;

import com.projects.Helper.StringValueObject;

import java.util.Random;

public class NumeroCuenta implements StringValueObject {

    private String numCuenta;

    public NumeroCuenta(){
        this.numCuenta = String.valueOf(generarNumeroCuenta());
    }

    @Override
    public String ToString() {
        return this.numCuenta;
    }

    public  String generarNumeroCuenta() {
        Random random = new Random();
        StringBuilder numeroCuenta = new StringBuilder();

        for (int i = 0; i < 12; i++) {
            // Genera un dígito aleatorio entre 0 y 9 y lo agrega al número de cuenta
            int digito = random.nextInt(10);
            numeroCuenta.append(digito);
        }

        return numeroCuenta.toString();
    }

}
