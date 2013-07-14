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
public abstract class ComprobanteAbstract {
    public abstract ItemDto[] procesar(double total);
}
