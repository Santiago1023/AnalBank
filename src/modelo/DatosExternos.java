/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jhona
 */
public class DatosExternos implements IComponente{
    ARL arl;
    EPS eps;
    CuentaNomina cuentaNomina;
    FondoPension fondoPension;
    Contrato contrato;

    @Override
    public String toString() {
        String datos = "";
        datos += arl.toString() + "\n";
        datos += eps.toString() + "\n";
        datos += cuentaNomina.toString() + "\n";
        datos += fondoPension.toString() + "\n";
        datos += contrato.toString();
        return datos;
    }

    public DatosExternos(ARL arl, EPS eps, CuentaNomina cuentaNomina, FondoPension fondoPension, Contrato contrato) {
        this.arl = arl;
        this.eps = eps;
        this.cuentaNomina = cuentaNomina;
        this.fondoPension = fondoPension;
        this.contrato = contrato;
    }

    public DatosExternos() {
    }
    
    public void agregarComponente(IComponente componente){
        String tipo = componente.getClass().getSimpleName().toLowerCase();
        switch(tipo){
                case "arl":
                    arl = (ARL)componente;
                    break;
                case "eps":
                    eps = (EPS)componente;
                    break;
                case "cuentanomina":
                    cuentaNomina = (CuentaNomina)componente;
                    break;
                case "fondopension":
                    fondoPension = (FondoPension)componente;
                    break;
                case "contratoindefinido":
                    contrato = (ContratoIndefinido)componente;
                    break;
                case "contratofijo":
                    contrato = (ContratoFijo)componente;
                    break;
                case "contratoprestacionservicios":
                    contrato = (ContratoPrestacionServicios)componente;
                    break;
        }
    }
    
    public IComponente obtenerComponente(String tipo){
        switch(tipo.toLowerCase()){
                case "arl":
                    return arl;
                case "eps":
                    return eps;
                case "cuentanomina":
                    return cuentaNomina;
                case "fondopension":
                    return fondoPension;
                case "contrato":
                    return contrato;
        }
        return null;
    }
}
