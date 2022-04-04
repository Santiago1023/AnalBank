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
        dbJson = new DBJson();
    }

    @Override
    public boolean guardar(Empleado empleado) {
        if(!validar(empleado.id)){
            dbJson.guardar(empleado);
            return true;
        }
        return false;
    }

    @Override
    public boolean actualizar(String identificacionAntigua, Empleado empleado) {
        if(validar(identificacionAntigua)){
            if(!identificacionAntigua.equals(empleado.id) && !validar(empleado.id)){
                return dbJson.actualizar(identificacionAntigua, empleado);
            }
        }
        return false;
    }

    @Override
    public Empleado consultar(String identificacion) {
        return dbJson.consultar(identificacion);
    }
    
    public boolean validar(String identificacion){
        if(consultar(identificacion) == null){
            return false;
        }
        return true;
    }
}
