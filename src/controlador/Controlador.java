/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.*;
import modelo.*;

/**
 *
 * @author jhona
 */
public class Controlador {
    protected static MainGUI ventanaMenuPrincipal;
    protected static ConsultaGUI ventanaConsulta;
    protected static ModificarGUI ventanaModificar;
    protected static RegistroGUI ventanaRegistro;
    protected Empleado empleado;
    protected static IDB proxy;
    
    public static void main(String[] args) {
        ventanaMenuPrincipal = new MainGUI();
        ventanaConsulta = new ConsultaGUI();
        ventanaModificar = new ModificarGUI();
        ventanaRegistro = new RegistroGUI();
        proxy = new Proxy();    
        
        ventanaMenuPrincipal.setVisible(true);
    }
    
    public void cambiarDeVentana(int indice){
        switch (indice) {
            case 1:
                ventanaRegistro.setVisible(true);
                ventanaMenuPrincipal.setVisible(false);
                break;
            case 2:
                ventanaConsulta.setVisible(true);
                ventanaMenuPrincipal.setVisible(false);
                break;
            case 3:
                ventanaModificar.setVisible(true);
                ventanaMenuPrincipal.setVisible(false);
                break;
            default:
                ventanaRegistro.setVisible(false);
                ventanaConsulta.setVisible(false);
                ventanaModificar.setVisible(false);
                ventanaMenuPrincipal.setVisible(true);
                break;
        }
    }
    
    public boolean validarCedulaProxy(String id){
        if(proxy.consultar(id) != null){
            
        }
    }
    
}
