/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jhona
 */
public class CuentaNomina implements IComponente{
    protected String numeroCuenta;
    protected String usuario;
    private String contrasena;

    public CuentaNomina(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    public void modificarInformacion(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "CuentaNomina{" + "numeroCuenta=" + numeroCuenta + '}';
    }

    
    
}
