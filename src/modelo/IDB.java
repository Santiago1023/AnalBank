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
public interface IDB {
    boolean guardar(Empleado empleado);
    boolean actualizar(String identificacionAntigua, Empleado empleado);
    Empleado consultar(String identificacion);
}
