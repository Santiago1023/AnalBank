/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author jhona
 */
public class ContratoPrestacionServicios extends Contrato{
    protected String fechaFinalizacionPS;

    public ContratoPrestacionServicios(String fechaInicio, String fechaFinalizacion, float salario) {
        super(fechaInicio, salario);
        this.fechaFinalizacionPS = fechaFinalizacion;
    }

    @Override
    public String toString() {
        return "ContratoFijo{" + "fechaInicio=" + fechaInicio + ", fechaFinalizacionPS=" + fechaFinalizacionPS + ", salario=" + salario + '}';
    }
    
    public void modificarInformacion(String fechaInicio, String fechaFinalizacion, float salario){
        super.fechaInicio = fechaInicio;
        super.salario = salario;
        this.fechaFinalizacionPS = fechaFinalizacion;
    }
    
    @Override
    public String obtenerDatos() {
        return "Prestación de servicios," + super.fechaInicio + "," + super.salario + "," + fechaFinalizacionPS;
    }    
}
