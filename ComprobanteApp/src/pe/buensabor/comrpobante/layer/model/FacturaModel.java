/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.buensabor.comrpobante.layer.model;

import pe.buensabor.comprobante.dto.ItemDto;

/**
 *
 * @author Alumno-CT
 */
public class FacturaModel extends ComprobanteAbstract{

    @Override
    public ItemDto[] procesar(double total) {
        ItemDto[] repo = new ItemDto[5];
//        Variables
        double consumo, impuesto, servicio, totalGeneral;
//        Proceso
        consumo = total / 1.18;
        impuesto = total - consumo;
        servicio = total * 0.10;
        totalGeneral = total + servicio;
//        Retorno
        repo[0]= new ItemDto("Consumo",consumo);
        repo[1]= new ItemDto("Impuesto",impuesto);
        repo[2]= new ItemDto("Total",total);
        repo[3]= new ItemDto("Servicio",servicio);
        repo[4]= new ItemDto("Total General",totalGeneral);
        return repo;
        
    }
    
}
