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
public class ARL implements IComponente{
    protected String nombre;
    protected String tipoAfiliacion;
    
    public ARL(String nombre, String tipoAfiliacion){
        this.nombre = nombre;
        this.tipoAfiliacion = tipoAfiliacion;
    }

    @Override
    public String toString() {
        return "ARL{" + "nombre=" + nombre + ", tipoAfiliacion=" + tipoAfiliacion + '}';
    }
    
    public void modificarInformacion(String nombre, String tipoAfiliacion){
        this.nombre = nombre;
        this.tipoAfiliacion = tipoAfiliacion;
    }
}
