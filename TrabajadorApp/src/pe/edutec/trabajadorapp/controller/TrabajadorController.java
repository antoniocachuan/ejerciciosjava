/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edutec.trabajadorapp.controller;

import java.util.HashMap;
import java.util.Map;
import pe.edutec.trabajadorapp.layer.model.Docente;
import pe.edutec.trabajadorapp.layer.model.Empleado;
import pe.edutec.trabajadorapp.layer.model.Itrabajador;
import pe.edutec.trabajadorapp.layer.model.Planilla;

/**
 *
 * @author Alumno-CT
 */
public class TrabajadorController {
    public static final String TIPO_EMPLEADO ="EMPLEADO";
    public static final String TIPO_DOCENTE = "DOCENTE";
    
    public String[] obtenerCargos(){
        String[] cargos={Itrabajador.CARGO_COORDINADOR, Itrabajador.CARGO_ASISTENTE, Itrabajador.CARGO_SECRETARIA};
        return cargos;
    }
    
    public Map<String, Double> procesar(String tipo, String cargo, int horas){
        Map<String,Double> rpta=new HashMap<String,Double>();
        //Trabajador
        Planilla planilla = new Planilla();
        Itrabajador trabajador;
        if(tipo.equals(TIPO_DOCENTE)){
            trabajador = new Docente(horas);
        }else{
            trabajador = new Empleado(cargo);
        }
        //Proceso
        rpta.put("Sueldo", trabajador.getSueldo());
        rpta.put("bono", planilla.calcularBono(trabajador));
        return rpta;
    }
}
