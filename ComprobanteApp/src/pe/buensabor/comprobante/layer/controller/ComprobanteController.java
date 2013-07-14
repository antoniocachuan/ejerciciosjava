/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.buensabor.comprobante.layer.controller;

import pe.buensabor.comprobante.dto.ItemDto;
import pe.buensabor.comrpobante.layer.model.BoletaModel;
import pe.buensabor.comrpobante.layer.model.ComprobanteAbstract;
import pe.buensabor.comrpobante.layer.model.FacturaModel;

/**
 *
 * @author Alumno-CT
 */
public class ComprobanteController {
    
    public static final String TIPO_FACTURA = "FACTURA";
    public static final String TIPO_BOLETA = "BOLETA";
    
    public ItemDto[] procesar (String tipo, double total){
        ComprobanteAbstract comp = null;
        if(tipo.equals(TIPO_FACTURA)){
            comp= new FacturaModel();
        }else if(tipo.equals(TIPO_BOLETA)){
            comp = new BoletaModel();
        }
        return comp.procesar(total);
    }
}
