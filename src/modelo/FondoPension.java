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
public class FondoPension implements IComponente{
    protected String nombre;
    protected int semanasCotizadas;
    protected int semanasRestantes;
    protected int totalSemanas;

    public FondoPension(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "FondoPension{" + "nombre=" + nombre + '}';
    }

    
    public void modificarInformacion(String nombre){
        this.nombre = nombre;
    }
}
