package com.projects.banco.entity.stringvalueobject.cliente;

import com.projects.Helper.Identifier;
import com.projects.Helper.StringValueObject;

public class ClienteID  {

    private Identifier clienteID;

    public ClienteID(String clienteID){
     if(clienteID == null){
         this.clienteID = new Identifier();

     }

    }

    public ClienteID(){
        if (clienteID == null){
            this.clienteID =   new Identifier();
        }else this.clienteID = clienteID;
    }


    public Identifier ToString() {
        return this.clienteID;
    }
}
