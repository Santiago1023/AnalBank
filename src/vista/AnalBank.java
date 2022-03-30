/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author jhona
 */
public class AnalBank {
    
    protected static MainGUI ventanaMenuPrincipal;
    protected static ConsultaGUI ventanaConsulta;
    protected static ModificarGUI ventanaModificar;
    protected static RegistroGUI ventanaRegistro;
    
    public static void main(String[] args) {
        ventanaMenuPrincipal = new MainGUI();
        ventanaConsulta = new ConsultaGUI();
        ventanaModificar = new ModificarGUI();
        ventanaRegistro = new RegistroGUI();
        ventanaMenuPrincipal.setVisible(true);
    }
}
