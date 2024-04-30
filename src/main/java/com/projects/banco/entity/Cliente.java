package com.projects.banco.entity;

import com.projects.banco.entity.stringvalueobject.cliente.ClienteID;
import com.projects.banco.entity.stringvalueobject.cliente.Email;
import com.projects.banco.entity.stringvalueobject.cliente.Nombre;
import com.projects.banco.entity.stringvalueobject.cliente.Password;
import java.util.HashMap;
import java.util.Map;

public class Cliente extends Persona{

    private ClienteID clienteID;
    private Map<String, Cuenta> cuentas;

    public Cliente(ClienteID clienteID, Nombre nombre, Email email, Password password ) {
        super(nombre, email, password);

        this.clienteID = clienteID;
        this.cuentas = new HashMap<>();
    }

    public static Cliente CrearCliente(Nombre nombre, Email email, Password password){

        return new Cliente(
               new ClienteID(),
                nombre,
                email,
                password

        );

    }

    public ClienteID getClienteID(){
        return this.clienteID;
    }

    public Cuenta agregarCuenta(Cuenta c){

        return this.cuentas.put(String.valueOf(c.getCuentaID().ToString().getId()),c);
    }

    public void eliminarCuenta(String idCuenta) {
        cuentas.remove(idCuenta);
    }

    public Cuenta obtenerCuenta(String idCuenta) {
        return cuentas.get(idCuenta);
    }


    public Map<String, Cuenta> getCuentas() {
        return cuentas;
    }

    public boolean existNumCuenta(String numCuenta){
        for(Cuenta cuenta: cuentas.values()){
            if (cuenta.getNumeroCuenta().ToString().equals(numCuenta)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClienteID: ").append(clienteID.ToString().getId()).append("\n");
        sb.append("Nombre: ").append(getNombre().ToString()).append("\n");
        sb.append("Email: ").append(getEmail().ToString()).append("\n");
        sb.append("Cuentas:\n");
        for (Map.Entry<String, Cuenta> entry : cuentas.entrySet()) {
            String idCuenta = entry.getKey();
            Cuenta cuenta = entry.getValue();
            sb.append("  ID de Cuenta: ").append(idCuenta).append("\n");
            sb.append("  Num de Cuenta: ").append(cuenta.getNumeroCuenta().ToString());
        }
        return sb.toString();
    }

}
