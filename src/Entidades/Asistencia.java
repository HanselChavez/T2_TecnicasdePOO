/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 *
 * @author chave
 */
public class Asistencia {
    private LocalDate fecha;    
    private String estado;
    private Estudiante estudiante;    

    public Asistencia(LocalDate fecha,   String estado, Estudiante estudiante) {
        this.fecha = fecha;       
        this.estado = estado;
        this.estudiante = estudiante;
    }

    
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
  
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

    public Estudiante getListaDeAsistencia() {
        return estudiante;
    }

    public void setListaDeAsistencia(Estudiante listaDeAsistencia) {
        this.estudiante = listaDeAsistencia;
    }

    @Override
    public String toString() {
        return fecha.toString()+"   "+estudiante.getNombre()+"    "
                +estudiante.getApellido()+"      "+estado;
    }
    
    
    
    
}
