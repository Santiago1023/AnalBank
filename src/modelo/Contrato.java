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
public abstract class Contrato implements IComponente {
    protected LocalDate fechaInicio;
    protected float salario;

    public Contrato(LocalDate fechaInicio, float salario) {
        this.fechaInicio = fechaInicio;
        this.salario = salario;
    }

    @Override
    public abstract String toString();
    
}
