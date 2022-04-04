/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Controlador;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import modelo.ARL;
import modelo.Contrato;
import modelo.ContratoFijo;
import modelo.ContratoIndefinido;
import modelo.ContratoPrestacionServicios;
import modelo.CuentaNomina;
import modelo.EPS;
import modelo.Empleado;
import modelo.Eventos;
import modelo.FondoPension;

/**
 *
 * @author santi
 */
public class ModificarGUI extends javax.swing.JFrame {
    Controlador controlador = new Controlador();
    Eventos event = new Eventos();

    /**
     * Creates new form ModificarGUI
     */
    public ModificarGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        panelDatos.setVisible(false);
    }

    public void mostrarDatos(String [] datos){
        for (int i = 0; i < datos.length; i++) {
            String datoLeido = datos[i];
            switch (i) {
                case 0:
                    txtNombreEmpleado.setText(datoLeido);
                    break;
                case 1:
                    txtApellidoEmpleado.setText(datoLeido);
                    break;
                case 2:
                    txtIdEmpleado.setText(datoLeido.substring(4));
                    break;
                case 3:
                    txtPaisEmpleado.setText(datoLeido);
                    break;
                case 4:
                    if(datoLeido.equals("Activo")){
                        comboEstadoEmpleado.setSelectedIndex(0);
                    }else if(datoLeido.equals("Inactivo")){
                        comboEstadoEmpleado.setSelectedIndex(1);
                    }else{
                        comboEstadoEmpleado.setSelectedIndex(2);
                    }
                    break;
                case 5:
                    txtCargoEmpleado.setText(datoLeido);
                    break;
                case 6:
                    txtNombreArl.setText(datoLeido);
                    break;
                case 7:
                    txtTipoAfiliadoArl.setText(datoLeido);
                    break;
                case 8:
                    txtNombreEps.setText(datoLeido);
                    break;
                case 9:
                    txtTipoAfiliacionEps.setText(datoLeido);
                    break;
                case 10:
                    txtNumeroCuentaNomina.setText(datoLeido);
                    break;
                case 11:
                    txtNombrePension.setText(datoLeido);
                    break;
                case 12:
                    if(datoLeido.equals("Fijo")){
                        comboContrato.setSelectedIndex(0);
                    }else if(datoLeido.equals("Indefinido")){
                        comboContrato.setSelectedIndex(1);
                    }else{
                        comboContrato.setSelectedIndex(2);
                    }
                    break;
                case 13:
                    String[] fechaInicio = datoLeido.split("/");
                    txtFechaInicio.setCalendar(new GregorianCalendar(Integer.parseInt(fechaInicio[2]), Integer.parseInt(fechaInicio[1])-1, Integer.parseInt(fechaInicio[0])));
                    //txtFechaInicio.setDate(new Date(Integer.parseInt(fechaInicio[2]), Integer.parseInt(fechaInicio[1]), Integer.parseInt(fechaInicio[0])));
                    break;
                case 14://Contrato
                    txtSalarioContrato.setText(datoLeido);
                    break;
                case 15:
                    String[] fechaFin = datoLeido.split("/");
                    txtFechaFin.setCalendar(new GregorianCalendar(Integer.parseInt(fechaFin[2]), Integer.parseInt(fechaFin[1])-1, Integer.parseInt(fechaFin[0])));
                    //txtFechaInicio.setDate(new Date(Integer.parseInt(fechaFin[2]), Integer.parseInt(fechaFin[1]), Integer.parseInt(fechaFin[0])));
                    break;
                default:
            }
        }        
    }
    
    public boolean datosNoVacios(){
        if(txtNombreEmpleado.getText().equals("") || txtApellidoEmpleado.getText().equals("") || txtIdEmpleado.getText().equals("") ||
                txtPaisEmpleado.getText().equals("") || txtCargoEmpleado.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Verifique la información ingresada del empleado");
            return false;
        }
        if(txtNombreArl.getText().equals("") || txtTipoAfiliadoArl.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Verifique la información ingresada del ARL");
            return false;
        }
        if(txtNombreEps.getText().equals("") || txtTipoAfiliacionEps.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Verifique la información ingresada del EPS");
            return false;
        }
        if(txtNumeroCuentaNomina.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Verifique la información ingresada de la cuenta de nómina");
            return false;
        }
        if(txtNombrePension.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Verifique la información ingresada del fondo de pensión");
            return false;
        }
        if(txtFechaInicio.getDateFormatString().equals("") || (comboContrato.getSelectedIndex() != 1 && txtFechaFin.getDateFormatString().equals(""))
                || txtSalarioContrato.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Verifique la información ingresada del contrato");
            return false;
        }
        return true;
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
        txtIdBuscar = new javax.swing.JTextField();
        comboIdBuscar = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        panelDatos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        txtNombreArl = new javax.swing.JTextField();
        txtTipoAfiliadoArl = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtNombrePension = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        comboContrato = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtSalarioContrato = new javax.swing.JTextField();
        labelFF = new javax.swing.JLabel();
        txtFechaInicio = new com.toedter.calendar.JDateChooser();
        txtFechaFin = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelNombre1 = new javax.swing.JLabel();
        txtNombreEps = new javax.swing.JTextField();
        labelTipo1 = new javax.swing.JLabel();
        txtTipoAfiliacionEps = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtNumeroCuentaNomina = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtApellidoEmpleado = new javax.swing.JTextField();
        txtIdEmpleado = new javax.swing.JTextField();
        txtPaisEmpleado = new javax.swing.JTextField();
        txtCargoEmpleado = new javax.swing.JTextField();
        comboId = new javax.swing.JComboBox<>();
        comboEstadoEmpleado = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ingrese el tipo y número de identificación");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        txtIdBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdBuscarKeyTyped(evt);
            }
        });
        getContentPane().add(txtIdBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 44, 136, -1));

        comboIdBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C.C", "C.E" }));
        getContentPane().add(comboIdBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 43, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 660, -1, -1));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 660, -1, -1));

        labelNombre.setText("Nombre");

        labelTipo.setText("Tipo Afiliacion");

        txtNombreArl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreArlKeyTyped(evt);
            }
        });

        txtTipoAfiliadoArl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoAfiliadoArlKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreArl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoAfiliadoArl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(txtNombreArl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipo)
                    .addComponent(txtTipoAfiliadoArl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel13.setText("Nombre");

        txtNombrePension.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrePensionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNombrePension, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNombrePension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Contrato");

        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("Fondo Pension");

        jLabel15.setText("Tipo contrato");

        comboContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fijo", "Indefinido", "Prestacion Servicios" }));
        comboContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboContratoActionPerformed(evt);
            }
        });

        jLabel16.setText("Fecha Inicio");

        jLabel17.setText("Salario");

        txtSalarioContrato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalarioContratoKeyTyped(evt);
            }
        });

        labelFF.setText("Fecha finalizacion");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalarioContrato)
                            .addComponent(txtFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(labelFF)
                        .addGap(18, 18, 18)
                        .addComponent(txtFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(comboContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(txtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalarioContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelFF)
                    .addComponent(txtFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Empleado");

        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("ARL");

        labelNombre1.setText("Nombre");

        txtNombreEps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEpsKeyTyped(evt);
            }
        });

        labelTipo1.setText("Tipo Afiliacion");

        txtTipoAfiliacionEps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoAfiliacionEpsKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreEps, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTipoAfiliacionEps, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre1)
                    .addComponent(txtNombreEps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipo1)
                    .addComponent(txtTipoAfiliacionEps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("EPS");

        txtNumeroCuentaNomina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroCuentaNominaKeyTyped(evt);
            }
        });

        jLabel11.setText("Numero Cuenta");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(txtNumeroCuentaNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroCuentaNomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Id");

        jLabel5.setText("Pais");

        jLabel6.setText("Estado");

        jLabel10.setText("Cargo");

        txtNombreEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEmpleadoKeyTyped(evt);
            }
        });

        txtApellidoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoEmpleadoKeyTyped(evt);
            }
        });

        txtIdEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdEmpleadoKeyTyped(evt);
            }
        });

        txtPaisEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaisEmpleadoKeyTyped(evt);
            }
        });

        txtCargoEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCargoEmpleadoKeyTyped(evt);
            }
        });

        comboId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C.C", "C.E" }));

        comboEstadoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo", "Retirado" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(comboEstadoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboId, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(txtPaisEmpleado)
                    .addComponent(txtCargoEmpleado))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtPaisEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(txtCargoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEstadoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel19.setForeground(new java.awt.Color(0, 0, 255));
        jLabel19.setText("Cuenta Nomina");

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelDatosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelDatosLayout.createSequentialGroup()
                            .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelDatosLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel8))
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(22, 22, 22)
                            .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelDatosLayout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel9))
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelDatosLayout.createSequentialGroup()
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelDatosLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addGroup(panelDatosLayout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(247, 247, 247)
                                    .addComponent(jLabel12))
                                .addComponent(jLabel14))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
            .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelDatosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(6, 6, 6)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)
                    .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelDatosLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel8)
                            .addGap(6, 6, 6)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelDatosLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(6, 6, 6)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(1, 1, 1)
                    .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelDatosLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel19))
                        .addComponent(jLabel12))
                    .addGap(6, 6, 6)
                    .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(8, 8, 8)
                    .addComponent(jLabel14)
                    .addGap(6, 6, 6)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(panelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, 610, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(txtIdBuscar.getText().equals("")){
            panelDatos.setVisible(false);
            JOptionPane.showMessageDialog(this, "Ingrese un Id para hacer la consulta", "Busqueda fallida", JOptionPane.ERROR_MESSAGE);
        }else{
            String identificacion = comboIdBuscar.getSelectedItem().toString() + " " + txtIdBuscar.getText();
            Empleado empleado = controlador.buscarEmpleado(identificacion);
            if(empleado == null){
                panelDatos.setVisible(false);
                JOptionPane.showMessageDialog(this, "No existe un empleado con el Id ingresado", "Resultado de búsqueda", JOptionPane.WARNING_MESSAGE);
            }else{
                panelDatos.setVisible(true);
                String[] datosEmpleado = empleado.obtenerDatos().split(",");
                mostrarDatos(datosEmpleado);
                if(comboContrato.getSelectedItem().toString().equals("Indefinido")){
                    labelFF.setVisible(false);
                    txtFechaFin.setVisible(false);
                }else{
                    labelFF.setVisible(true);
                    txtFechaFin.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void comboContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboContratoActionPerformed
        if(comboContrato.getSelectedIndex() == 0){
            labelFF.setVisible(false);
            txtFechaFin.setVisible(false);
        }else{
            labelFF.setVisible(true);
            txtFechaFin.setVisible(true);
        }
    }//GEN-LAST:event_comboContratoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        controlador.cambiarDeVentana(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombreEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtNombreEmpleadoKeyTyped

    private void txtIdEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdEmpleadoKeyTyped
        event.numberKeyPress(evt);
    }//GEN-LAST:event_txtIdEmpleadoKeyTyped

    private void txtApellidoEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoEmpleadoKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtApellidoEmpleadoKeyTyped

    private void txtPaisEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaisEmpleadoKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtPaisEmpleadoKeyTyped

    private void txtCargoEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargoEmpleadoKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtCargoEmpleadoKeyTyped

    private void txtNombreArlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreArlKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtNombreArlKeyTyped

    private void txtTipoAfiliadoArlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoAfiliadoArlKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtTipoAfiliadoArlKeyTyped

    private void txtNombreEpsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEpsKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtNombreEpsKeyTyped

    private void txtTipoAfiliacionEpsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoAfiliacionEpsKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtTipoAfiliacionEpsKeyTyped

    private void txtNumeroCuentaNominaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCuentaNominaKeyTyped
        event.numberKeyPress(evt);
    }//GEN-LAST:event_txtNumeroCuentaNominaKeyTyped

    private void txtNombrePensionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePensionKeyTyped
        event.textKeyPress(evt);
    }//GEN-LAST:event_txtNombrePensionKeyTyped

    private void txtSalarioContratoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioContratoKeyTyped
        event.numberDecimalKeyPress(evt, txtSalarioContrato);
    }//GEN-LAST:event_txtSalarioContratoKeyTyped

    private void txtIdBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdBuscarKeyTyped
        event.numberKeyPress(evt);
    }//GEN-LAST:event_txtIdBuscarKeyTyped

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(datosNoVacios()){
            ARL arl = new ARL(txtNombreArl.getText(), txtTipoAfiliadoArl.getText());
            EPS eps = new EPS(txtNombreEps.getText(), txtTipoAfiliacionEps.getText());
            CuentaNomina cuentaNomina = new CuentaNomina(txtNumeroCuentaNomina.getText());
            FondoPension fondoPension = new FondoPension(txtNombrePension.getText());
            Contrato contrato;
            String fechaInicio = txtFechaInicio.getDate().toLocaleString();
            if(fechaInicio.charAt(10) == ','){
                fechaInicio = fechaInicio.substring(0, 10);
            }else{
                fechaInicio = fechaInicio.substring(0, 9);
            }  
            String fechaFin;
            switch(comboContrato.getSelectedIndex()){
                case 0:
                    fechaFin = txtFechaFin.getDate().toLocaleString();
                    if(fechaFin.charAt(10) == ','){
                        fechaFin = fechaFin.substring(0, 10);
                    }else{
                        fechaFin = fechaFin.substring(0, 9);
                    }
                    contrato = new ContratoFijo(fechaInicio, fechaFin, Float.parseFloat(txtSalarioContrato.getText()));
                    break;
                case 1:
                    contrato = new ContratoIndefinido(fechaInicio, Float.parseFloat(txtSalarioContrato.getText()));
                    break;
                default:
                    fechaFin = txtFechaFin.getDate().toLocaleString();
                    if(fechaFin.charAt(10) == ','){
                        fechaFin = fechaFin.substring(0, 10);
                    }else{
                        fechaFin = fechaFin.substring(0, 9);
                    }
                    contrato = new ContratoPrestacionServicios(fechaInicio, fechaFin, Float.parseFloat(txtSalarioContrato.getText()));
            }
            Empleado empleado = new Empleado(txtNombreEmpleado.getText(), txtApellidoEmpleado.getText(), (comboId.getSelectedItem().toString() + " " + txtIdEmpleado.getText()),
                    txtPaisEmpleado.getText(), comboEstadoEmpleado.getSelectedItem().toString(), txtCargoEmpleado.getText());
            empleado.agregarComponente(arl);
            empleado.agregarComponente(eps);
            empleado.agregarComponente(cuentaNomina);
            empleado.agregarComponente(fondoPension);
            empleado.agregarComponente(contrato);
            if(controlador.actualizar(comboIdBuscar.getSelectedItem().toString() + " " + txtIdBuscar.getText(), empleado)){
                JOptionPane.showMessageDialog(this, "Los datos del empleado se han actualizado", "Datos actualizados", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "No se han podido modificar los datos del empleado", "Datos no actualizados", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> comboContrato;
    private javax.swing.JComboBox<String> comboEstadoEmpleado;
    private javax.swing.JComboBox<String> comboId;
    private javax.swing.JComboBox<String> comboIdBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelFF;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel labelTipo1;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JTextField txtApellidoEmpleado;
    private javax.swing.JTextField txtCargoEmpleado;
    private com.toedter.calendar.JDateChooser txtFechaFin;
    private com.toedter.calendar.JDateChooser txtFechaInicio;
    private javax.swing.JTextField txtIdBuscar;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtNombreArl;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtNombreEps;
    private javax.swing.JTextField txtNombrePension;
    private javax.swing.JTextField txtNumeroCuentaNomina;
    private javax.swing.JTextField txtPaisEmpleado;
    private javax.swing.JTextField txtSalarioContrato;
    private javax.swing.JTextField txtTipoAfiliacionEps;
    private javax.swing.JTextField txtTipoAfiliadoArl;
    // End of variables declaration//GEN-END:variables
}
