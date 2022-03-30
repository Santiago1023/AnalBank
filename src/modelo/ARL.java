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
    String nombre;
    String tipoAfiliacion;
    
    protected ARL(){
        
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean modificarInformacion(String nombre, String tipoAfiliacion){
        this.nombre = nombre;
        this.tipoAfiliacion = tipoAfiliacion;
    }
}
