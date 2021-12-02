/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author Angie Mendez
 */
public class Persona implements Comparable<Persona>{
    private final String nombre;
    private final String apellido;
    private int edad;
    private final String nacionalidad;
    private final String movimientoLiterario;
    
    public Persona(String nombre, String apellido, int edad, String nacionalidad, String movimientoLiterario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad >= 16? edad: 16; 
        this.nacionalidad = nacionalidad;
        this.movimientoLiterario = movimientoLiterario;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getMovimientoLiterario() {
        return movimientoLiterario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + " Apellido: " + apellido + " Edad: " + edad + " Nacionalidad: " + nacionalidad + " Movimiento Literario: " + movimientoLiterario;
    }

    @Override
    public int compareTo(Persona that) {
         if(this.nombre.compareTo(that.nombre) > 0){
            return 1;
        }
         if(this.nombre.compareTo(that.nombre) < 0){
            return -1;
        }
         if(this.apellido.compareTo(that.apellido) > 0){
            return 1;
        }
         if(this.apellido.compareTo(that.apellido) < 0){
            return -1;
        }
         if(this.edad > that.edad){
            return 1;
        }
         if(this.edad < that.edad){
            return -1;
        }
         if(this.nacionalidad.compareTo(that.nacionalidad) > 0){
            return 1;
        }
         if(this.nacionalidad.compareTo(that.nacionalidad) < 0){
            return -1;
        }
         if(this.movimientoLiterario.compareTo(that.movimientoLiterario) > 0){
            return 1;
        }
         if(this.movimientoLiterario.compareTo(that.movimientoLiterario) < 0){
            return -1;
        }
         return 0;
    }
    
}
