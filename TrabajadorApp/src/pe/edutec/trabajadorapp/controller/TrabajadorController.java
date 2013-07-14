/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edutec.trabajadorapp.controller;

import pe.edutec.trabajadorapp.layer.model.Itrabajador;

/**
 *
 * @author Alumno-CT
 */
public class TrabajadorController {
    public String TIPO_EMPLEADO ="EMPLEADO";
    public String TIPO_DOCENTE = "DOCENTE";
    
    public String[] obtenerCargos(){
        String[] cargos={Itrabajador.CARGO_COORDINADOR, Itrabajador.CARGO_ASISTENTE, Itrabajador.CARGO_SECRETARIA};
        return cargos;
    }
}
