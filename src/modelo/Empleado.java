/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author jhona
 */
public class Empleado implements IComponente{
    protected String nombre;
    protected String apellido;
    protected String id;
    protected String pais;
    protected String estado;
    protected String cargo;
    protected DatosExternos datosExternos;
    
    public Empleado(String nombre, String apellido, String id, String pais, String estado, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.pais = pais;
        this.estado = estado;
        this.cargo = cargo;
        datosExternos = new DatosExternos();
    }

    public Empleado(String nombre, String apellido, String id, String pais, String estado, String cargo, DatosExternos datosExternos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.pais = pais;
        this.estado = estado;
        this.cargo = cargo;
        this.datosExternos = datosExternos;
    }
    
    public void cambiarEstado(String estado){
        this.estado = estado;
    }
    
    public void modificarInformacion(String nombre, String apellido, String id, String pais, String estado, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.pais = pais;
        this.estado = estado;
        this.cargo = cargo;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "datosExternos=" + datosExternos + ", nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", pais=" + pais + ", estado=" + estado + ", cargo=" + cargo + '}';
    }
    
    public void agregarComponente(IComponente componente){
        datosExternos.agregarComponente(componente);
    }
    
    public IComponente obtenerComponente(String tipo){
        return datosExternos.obtenerComponente(tipo);
    }
}
