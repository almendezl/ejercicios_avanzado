/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import java.util.Date;

/**
 *
 * @author Angie Mendez
 */
public class Persona  implements  Comparable <Persona> {

    private String nombre;
    private String apellido;
    private int edad;
    private final String cedula;
    private Date fechaInscripcion;

    public Persona(String nombre, String apellido, int edad, String cedula, Date fechaInscripcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad>=18 && edad <=99?edad: 18;
    }

    public String getCedula() {
        return cedula;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    @Override
    public String toString() {
        return  "\tNombre: \t" + nombre + "\tApellido: \t" + apellido +"\tEdad: \t" +edad+ "\tCedula: \t" + cedula + "\tFecha de Inscripcion: \t" + fechaInscripcion ;
    }


   @Override
    public int compareTo(Persona that) {
        if (this.nombre.compareToIgnoreCase(that.nombre) > 0) {
            return 1;
        }
        if (this.nombre.compareToIgnoreCase(that.nombre) < 0) {
            return -1;
        }
        if (this.apellido.compareToIgnoreCase(that.apellido) > 0) {
            return 1;
        }
        if (this.apellido.compareToIgnoreCase(that.apellido) < 0) {
            return -1;
        }
        if(this.edad > that.edad) return 1;
        if(this.edad < that.edad) return -1;
        if(this.edad == that.edad) return 0;
        if (this.cedula.compareToIgnoreCase(that.cedula) > 0) {
            return 1;
        }
        if (this.cedula.compareToIgnoreCase(that.cedula) < 0) {
            return -1;
        }
        if (this.fechaInscripcion.compareTo(that.fechaInscripcion) > 0) {
            return 1;
        }
        if (0 >= this.fechaInscripcion.compareTo(that.fechaInscripcion)) {
            return -1;
        }
        return 0;
    }

}
