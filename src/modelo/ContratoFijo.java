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
public class ContratoFijo extends Contrato{
    protected String fechaFinalizacionF;

    public ContratoFijo(String fechaInicio, String fechaFinalizacion, float salario) {
        super(fechaInicio, salario);
        this.fechaFinalizacionF = fechaFinalizacion;
    }

    @Override
    public String toString() {
        return "ContratoFijo{" + "fechaInicio=" + fechaInicio + ", fechaFinalizacionF=" + fechaFinalizacionF + ", salario=" + salario + '}';
    }
    
    public void modificarInformacion(String fechaInicio, String fechaFinalizacion, float salario){
        super.fechaInicio = fechaInicio;
        super.salario = salario;
        this.fechaFinalizacionF = fechaFinalizacion;
    }

    @Override
    public String obtenerDatos() {
        return "Fijo," + super.fechaInicio + "," + super.salario + "," + fechaFinalizacionF;
    }    
    
}
