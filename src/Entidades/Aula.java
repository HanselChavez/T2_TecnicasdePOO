/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chave
 */
public class Aula {
 
    private String horario;
    private String curso;   
    private List<Estudiante > Estudiantes; 
    private List<Asistencia> Asistencia;

   
    public Aula(String horario , String curso){
        Estudiantes = new ArrayList();
        this.horario = horario;
        this.curso = curso;   
        Asistencia = new ArrayList();
        
    }    
     public List<Asistencia> getAsistencia() {
        return Asistencia;
    }

    public void setAsistencia(List<Asistencia> Asistencia) {
        this.Asistencia = Asistencia;
    }
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void agregarEstudiante(Estudiante estudiante){
        if(Estudiantes.size()<=10){
            Estudiantes.add(estudiante);
        }
    }  
    public List<Estudiante> getEstudiantes() {
        return Estudiantes;
    }

    public void setEstudiantes(List<Estudiante> Estudiantes) {
        this.Estudiantes = Estudiantes;
    }
}
