/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import java.util.ArrayList;

/**
 *
 * @author Angie Mendez
 */
public class Curso {
    private final String nombre;
    private Docente profesor;
    private ArrayList <Estudiante> estudiantes;
    
    public Curso(String nombre , Docente profesor){
        this.nombre = nombre;
        this.profesor = profesor;
        estudiantes = new ArrayList<Estudiante>();
    }

    public String getNombre() {
        return nombre;
    }

    public Docente getProfesor() {
        return profesor;
    }

    public ArrayList <Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setProfesor(Docente profesor) {
        this.profesor = profesor;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    public void matricular(Estudiante e){
        if(!estudiantes.contains(e))
            estudiantes.add(e);
    }
    
}
