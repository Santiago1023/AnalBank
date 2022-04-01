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
public class Proxy implements IDB{
    private DBJson dbJson;

    public Proxy() {
    }

    @Override
    public boolean guardar(Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado consultar(String identificacion) {
        return dbJson.consultar(identificacion);
    }
    
    public boolean validar(String identificacion){
        //TODO
    }
}
