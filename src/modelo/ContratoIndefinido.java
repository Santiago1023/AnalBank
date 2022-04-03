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
public class ContratoIndefinido extends Contrato{

    public ContratoIndefinido(String fechaInicio, float salario) {
        super(fechaInicio, salario);
    }

    @Override
    public String toString() {
        return "ContratoFijo{" + "fechaInicio=" + fechaInicio + ", salario=" + salario + '}';
    }
    
    public void modificarInformacion(String fechaInicio, float salario) {
        this.fechaInicio = fechaInicio;
        this.salario = salario;
    }
}
