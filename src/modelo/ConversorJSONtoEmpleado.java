/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jhona
 */
public class ConversorJSONtoEmpleado {

    public Empleado buscarEmpleado(String id) {
        try (BufferedReader br = new BufferedReader(new FileReader("archivoEmpleados.json"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(id)) {
                    return convertirEmpleado(line);
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public Empleado convertirEmpleado(String json) {
        if (json.endsWith("]") || json.endsWith(",")) {
            json = json.substring(0, json.length() - 2);
        } else {
            json = json.substring(0, json.length() - 1);
        }
        if (json.charAt(0) == '[') {
            json = json.substring(2);
        } else {
            json = json.substring(1);
        }
        String[] vectorDatos = json.split(",");
        String nombreEmpleado = "";
        String apellidoEmpleado = "";
        String idEmpleado = "";
        String paisEmpleado = "";
        String estadoEmpleado = "";
        String cargoEmpleado = "";
        String nombreARL = "";
        String tipoAfiliacionARL = "";
        String nombreEPS = "";
        String tipoAfiliacionEPS = "";
        String numeroCuenta = "";
        String nombrePension = "";
        String fechaInicio = "";
        String salario = "";
        String fechaFin = "";
        int tipoContrato = 0;
        if (vectorDatos.length == 17) {
            tipoContrato = 1;
            for (int i = 0; i < vectorDatos.length; i++) {
                String datoLeido = vectorDatos[i];
                switch (i) {
                    case 0:
                        nombreEmpleado = datoLeido.substring(10, datoLeido.length() - 1);
                        break;
                    case 1:
                        apellidoEmpleado = datoLeido.substring(12, datoLeido.length() - 1);
                        break;
                    case 2:
                        idEmpleado = datoLeido.substring(6, datoLeido.length() - 1);
                        break;
                    case 3:
                        paisEmpleado = datoLeido.substring(8, datoLeido.length() - 1);
                        break;
                    case 4:
                        estadoEmpleado = datoLeido.substring(10, datoLeido.length() - 1);
                        break;
                    case 5:
                        cargoEmpleado = datoLeido.substring(9, datoLeido.length() - 1);
                        break;
                    case 6:
                        nombreARL = datoLeido.substring(34, datoLeido.length() - 1);
                        break;
                    case 7:
                        tipoAfiliacionARL = datoLeido.substring(18, datoLeido.length() - 1);
                        break;
                    case 8:
                        nombreEPS = datoLeido.substring(17, datoLeido.length() - 1);
                        break;
                    case 9:
                        tipoAfiliacionEPS = datoLeido.substring(18, datoLeido.length() - 1);
                        break;
                    case 10:
                        numeroCuenta = datoLeido.substring(32, datoLeido.length() - 1);
                        break;
                    case 11:
                        nombrePension = datoLeido.substring(26, datoLeido.length() - 1);
                        break;
                    case 15://Contrato
                        fechaInicio = datoLeido.substring(26, datoLeido.length() - 1);
                        break;
                    case 16:
                        salario = datoLeido.substring(11, datoLeido.length() - 1);
                        break;
                    default:
                }
            }
        } else { //Contrato fijo o prestacion servicios
            for (int i = 0; i < vectorDatos.length; i++) {
                String datoLeido = vectorDatos[i];
                switch (i) {
                    case 0:
                        nombreEmpleado = datoLeido.substring(10, datoLeido.length() - 1);
                        break;
                    case 1:
                        apellidoEmpleado = datoLeido.substring(12, datoLeido.length() - 1);
                        break;
                    case 2:
                        idEmpleado = datoLeido.substring(6, datoLeido.length() - 1);
                        break;
                    case 3:
                        paisEmpleado = datoLeido.substring(8, datoLeido.length() - 1);
                        break;
                    case 4:
                        estadoEmpleado = datoLeido.substring(10, datoLeido.length() - 1);
                        break;
                    case 5:
                        cargoEmpleado = datoLeido.substring(9, datoLeido.length() - 1);
                        break;
                    case 6:
                        nombreARL = datoLeido.substring(34, datoLeido.length() - 1);
                        break;
                    case 7:
                        tipoAfiliacionARL = datoLeido.substring(18, datoLeido.length() - 1);
                        break;
                    case 8:
                        nombreEPS = datoLeido.substring(17, datoLeido.length() - 1);
                        break;
                    case 9:
                        tipoAfiliacionEPS = datoLeido.substring(18, datoLeido.length() - 1);
                        break;
                    case 10:
                        numeroCuenta = datoLeido.substring(32, datoLeido.length() - 1);
                        break;
                    case 11:
                        nombrePension = datoLeido.substring(26, datoLeido.length() - 1);
                        break;
                    case 15://Contrato
                        if (datoLeido.contains("PS")) {
                            tipoContrato = 2;
                            fechaFin = datoLeido.substring(35, datoLeido.length() - 1);
                        } else {
                            tipoContrato = 0;
                            fechaFin = datoLeido.substring(34, datoLeido.length() - 1);
                        }
                    case 16:
                        fechaInicio = datoLeido.substring(26, datoLeido.length() - 1);
                        break;
                    case 17:
                        salario = datoLeido.substring(11, datoLeido.length() - 1);
                        break;
                    default:
                }
            }
        }
        Empleado empleado;
        ARL arl;
        EPS eps;
        CuentaNomina cuentaNomina;
        FondoPension fondoPension;
        Contrato contrato;
        arl = new ARL(nombreARL, tipoAfiliacionARL);
        eps = new EPS(nombreEPS, tipoAfiliacionEPS);
        cuentaNomina = new CuentaNomina(numeroCuenta);
        fondoPension = new FondoPension(nombrePension);
        if(tipoContrato == 0){
            contrato = new ContratoFijo(fechaInicio, fechaFin, Float.parseFloat(salario));
        }else if(tipoContrato == 1){
            contrato = new ContratoIndefinido(fechaInicio, Float.parseFloat(salario));
        }else{
            contrato = new ContratoPrestacionServicios(fechaInicio, fechaFin, Float.parseFloat(salario));
        }
        DatosExternos datosExternos = new DatosExternos(arl, eps, cuentaNomina, fondoPension, contrato);
        empleado = new Empleado(nombreEmpleado, apellidoEmpleado, idEmpleado, paisEmpleado, estadoEmpleado, cargoEmpleado, datosExternos);
        return empleado;
    }
}
