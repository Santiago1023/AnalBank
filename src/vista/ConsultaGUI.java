/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Controlador;
import javax.swing.JOptionPane;
import modelo.Empleado;
import modelo.Eventos;

/**
 *
 * @author santi
 */
public class ConsultaGUI extends javax.swing.JFrame {
    Controlador controlador = new Controlador();
    Eventos event = new Eventos();

    /**
     * Creates new form ConsultarGUI
     */
    public ConsultaGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelDatos.setVisible(false);
    }
    
    public void mostrarDatos(String [] datos){
        for (int i = 0; i < datos.length; i++) {
            String datoLeido = datos[i];
            switch (i) {
                case 0:
                    labelNombreEmpleado.setText(datoLeido);
                    break;
                case 1:
                    labelApellidoEmpleado.setText(datoLeido);
                    break;
                case 2:
                    labelId.setText(datoLeido);
                    break;
                case 3:
                    labelPais.setText(datoLeido);
                    break;
                case 4:
                    labelEstado.setText(datoLeido);
                    break;
                case 5:
                    labelCargo.setText(datoLeido);
                    break;
                case 6:
                    labelNombreARL.setText(datoLeido);
                    break;
                case 7:
                    labelTipoAfiliacionARL.setText(datoLeido);
                    break;
                case 8:
                    labelNombreEPS.setText(datoLeido);
                    break;
                case 9:
                    labelTipoAfiliacionEPS.setText(datoLeido);
                    break;
                case 10:
                    labelNumeroCuenta.setText(datoLeido);
                    break;
                case 11:
                    labelNombreFondoPension.setText(datoLeido);
                    break;
                case 12:
                    labelTipoContrato.setText(datoLeido);
                    break;
                case 13:
                    labelFechaInicio.setText(datoLeido);
                    break;
                case 14://Contrato
                    labelSalario.setText(datoLeido);
                    break;
                case 15:
                    labelFechaFin.setText(datoLeido);
                    break;
                default:
            }
        }        
    }
    
    public void eliminarCampos(){
        txtId.setText("");
        labelNombreEmpleado.setText("");
        labelApellidoEmpleado.setText("");
        labelId.setText("");
        labelPais.setText("");
        labelCargo.setText("");
        labelNombreARL.setText("");
        labelTipoAfiliacionARL.setText("");
        labelNombreEPS.setText("");
        labelTipoAfiliacionEPS.setText("");
        labelNumeroCuenta.setText("");
        labelNombreFondoPension.setText("");
        labelSalario.setText("");
        labelFechaInicio.setText(null);
        labelFechaFin.setText(null);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        comboId = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        panelDatos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelNombre1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        labelNombre2 = new javax.swing.JLabel();
        labelTipo2 = new javax.swing.JLabel();
        labelNombre3 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        labelFF = new javax.swing.JLabel();
        labelNombreEmpleado = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        labelEstado = new javax.swing.JLabel();
        labelNombreARL = new javax.swing.JLabel();
        labelTipoAfiliacionARL = new javax.swing.JLabel();
        labelApellidoEmpleado = new javax.swing.JLabel();
        labelPais = new javax.swing.JLabel();
        labelCargo = new javax.swing.JLabel();
        labelNombreEPS = new javax.swing.JLabel();
        labelTipoAfiliacionEPS = new javax.swing.JLabel();
        labelNombreFondoPension = new javax.swing.JLabel();
        labelNumeroCuenta = new javax.swing.JLabel();
        labelTipoContrato = new javax.swing.JLabel();
        labelFechaInicio = new javax.swing.JLabel();
        labelSalario = new javax.swing.JLabel();
        labelFechaFin = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ingrese el tipo y n??mero de identificaci??n");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 44, 136, -1));

        comboId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C.C", "C.E" }));
        getContentPane().add(comboId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 43, -1, -1));

        panelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Id");
        panelDatos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 46, -1));

        jLabel5.setText("Estado");
        panelDatos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 46, -1));

        jLabel4.setText("Apellido");
        panelDatos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        jLabel6.setText("Pais");
        panelDatos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 46, -1));

        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("ARL");
        panelDatos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 37, -1));

        jLabel38.setText("Nombre");
        panelDatos.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 65, -1));

        labelTipo.setText("Tipo Afiliacion");
        panelDatos.add(labelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("EPS");
        panelDatos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 37, -1));

        labelNombre1.setText("Nombre");
        panelDatos.add(labelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 88, -1));

        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("Fondo Pension");
        panelDatos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("Cuenta Nomina");
        panelDatos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, -1));

        jLabel14.setText("Numero Cuenta");
        panelDatos.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Contrato");
        panelDatos.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 56, -1));

        jLabel16.setText("Tipo contrato");
        panelDatos.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel25.setText("Cargo");
        panelDatos.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 46, -1));

        jLabel26.setForeground(new java.awt.Color(0, 0, 255));
        jLabel26.setText("Empleado");
        panelDatos.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        labelNombre2.setText("Nombre");
        panelDatos.add(labelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 65, -1));

        labelTipo2.setText("Tipo Afiliacion");
        panelDatos.add(labelTipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        labelNombre3.setText("Nombre");
        panelDatos.add(labelNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 88, -1));

        jLabel35.setText("Fecha Inicio");
        panelDatos.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 72, -1));

        jLabel36.setText("Salario");
        panelDatos.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 72, -1));

        labelFF.setText("Fecha finalizacion");
        panelDatos.add(labelFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        labelNombreEmpleado.setText("jLabel2");
        panelDatos.add(labelNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        labelId.setText("jLabel2");
        panelDatos.add(labelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        labelEstado.setText("jLabel2");
        panelDatos.add(labelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        labelNombreARL.setText("jLabel7");
        panelDatos.add(labelNombreARL, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        labelTipoAfiliacionARL.setText("jLabel8");
        panelDatos.add(labelTipoAfiliacionARL, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        labelApellidoEmpleado.setText("jLabel13");
        panelDatos.add(labelApellidoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        labelPais.setText("jLabel17");
        panelDatos.add(labelPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        labelCargo.setText("jLabel18");
        panelDatos.add(labelCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        labelNombreEPS.setText("jLabel19");
        panelDatos.add(labelNombreEPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        labelTipoAfiliacionEPS.setText("jLabel20");
        panelDatos.add(labelTipoAfiliacionEPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        labelNombreFondoPension.setText("jLabel21");
        panelDatos.add(labelNombreFondoPension, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        labelNumeroCuenta.setText("jLabel22");
        panelDatos.add(labelNumeroCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        labelTipoContrato.setText("jLabel23");
        panelDatos.add(labelTipoContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        labelFechaInicio.setText("jLabel24");
        panelDatos.add(labelFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        labelSalario.setText("jLabel27");
        panelDatos.add(labelSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        labelFechaFin.setText("jLabel28");
        panelDatos.add(labelFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        getContentPane().add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 94, 580, 510));

        btnCancelar.setText("Cerrar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 620, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(txtId.getText().equals("")){
            panelDatos.setVisible(false);
            JOptionPane.showMessageDialog(this, "Ingrese un Id para hacer la consulta", "Busqueda fallida", JOptionPane.ERROR_MESSAGE);
        }else{
            String identificacion = comboId.getSelectedItem().toString() + " " + txtId.getText();
            Empleado empleado = controlador.buscarEmpleado(identificacion);
            if(empleado == null){
                panelDatos.setVisible(false);
                JOptionPane.showMessageDialog(this, "No existe un empleado con el Id ingresado", "Resultado de b??squeda", JOptionPane.WARNING_MESSAGE);
            }else{
                panelDatos.setVisible(true);
                String[] datosEmpleado = empleado.obtenerDatos().split(",");
                mostrarDatos(datosEmpleado);
                if(labelTipoContrato.getText().equals("Indefinido")){
                    labelFF.setVisible(false);
                    labelFechaFin.setVisible(false);
                }else{
                    labelFF.setVisible(true);
                    labelFechaFin.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        eliminarCampos();
        panelDatos.setVisible(false);
        controlador.cambiarDeVentana(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        event.numberKeyPress(evt);
    }//GEN-LAST:event_txtIdKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> comboId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelApellidoEmpleado;
    private javax.swing.JLabel labelCargo;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JLabel labelFF;
    private javax.swing.JLabel labelFechaFin;
    private javax.swing.JLabel labelFechaInicio;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JLabel labelNombre2;
    private javax.swing.JLabel labelNombre3;
    private javax.swing.JLabel labelNombreARL;
    private javax.swing.JLabel labelNombreEPS;
    private javax.swing.JLabel labelNombreEmpleado;
    private javax.swing.JLabel labelNombreFondoPension;
    private javax.swing.JLabel labelNumeroCuenta;
    private javax.swing.JLabel labelPais;
    private javax.swing.JLabel labelSalario;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel labelTipo2;
    private javax.swing.JLabel labelTipoAfiliacionARL;
    private javax.swing.JLabel labelTipoAfiliacionEPS;
    private javax.swing.JLabel labelTipoContrato;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
