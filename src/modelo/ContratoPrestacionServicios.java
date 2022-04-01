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
    protected LocalDate fechaFinalizacion;

    public ContratoPrestacionServicios(LocalDate fechaInicio, LocalDate fechaFinalizacion, float salario) {
        super(fechaInicio, salario);
        this.fechaFinalizacion = fechaFinalizacion;
    }

    @Override
    public String toString() {
        return "ContratoFijo{" + "fechaInicio=" + fechaInicio + ", fechaFinalizacion=" + fechaFinalizacion + ", salario=" + salario + '}';
    }
    
    public void modificarInformacion(LocalDate fechaInicio, LocalDate fechaFinalizacion, float salario){
        super.fechaInicio = fechaInicio;
        super.salario = salario;
        this.fechaFinalizacion = fechaFinalizacion;
    }
}
