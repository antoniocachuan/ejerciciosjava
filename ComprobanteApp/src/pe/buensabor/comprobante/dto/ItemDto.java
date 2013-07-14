/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.buensabor.comprobante.dto;

/**
 *
 * @author Alumno-CT
 */
public class ItemDto {
    
    private String concepto;
    private double valor;
    
     public ItemDto(String concepto, double valor) {
        this.concepto = concepto;
        this.valor = valor;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

   
    
}
