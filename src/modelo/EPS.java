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
public class EPS implements IComponente{
    private String nombre;
    private String tipoAfiliacion;

    public EPS(String nombre, String tipoAfiliacion) {
        this.nombre = nombre;
        this.tipoAfiliacion = tipoAfiliacion;
    }

    public void modificarInformacion(String nombre, String tipoAfiliacion) {
        this.nombre = nombre;
        this.tipoAfiliacion = tipoAfiliacion;
    }

    @Override
    public String toString() {
        return "EPS{" + "nombre=" + nombre + ", tipoAfiliacion=" + tipoAfiliacion + '}';
    }

}
