package com.projects.banco.entity.stringvalueobject.cuenta;

import com.projects.Helper.Identifier;

public class CuentaID {

    private Identifier cuentaID;

    public CuentaID(String cuentaID){
        if(cuentaID == null){
            this.cuentaID = new Identifier();

        }

    }

    public CuentaID(){
        if (cuentaID == null){
            this.cuentaID =   new Identifier();
        }else this.cuentaID = cuentaID;
    }


    public Identifier ToString() {
        return this.cuentaID;
    }
}
