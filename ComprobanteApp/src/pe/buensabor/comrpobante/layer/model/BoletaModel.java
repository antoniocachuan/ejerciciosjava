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
public class BoletaModel extends ComprobanteAbstract{
    
    
    @Override
    public ItemDto[] procesar(double total) {
        ItemDto[] repo = new ItemDto[3];
//        Variables
        double servicio, totalGeneral;
//        Proceso
        servicio = total * 0.10;
        totalGeneral = total + servicio;
//        Retorno
        repo[0]= new ItemDto("Total",total);
        repo[1]= new ItemDto("Servicio",servicio);
        repo[2]= new ItemDto("Total General",totalGeneral);
        return repo;
        
    }
}
