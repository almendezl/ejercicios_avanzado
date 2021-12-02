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
public class Docente {

    private final String nombre;
    private int edad;
    private final String identificacion;

    public Docente(String nombre, int edad, String identificacion) {
        this.nombre = nombre;
        if (edad >= 18) {
            this.edad = edad;
        } else {
            this.edad = 18;
        }
        this.identificacion = identificacion;
    }
    
public String getNombre(){
    return nombre;
}

public int getEdad(){
    return edad;
}
public void setEdad(int edad){
    if(edad >= 18)
    this.edad = edad;
    else
        this.edad = 18;
}
public String getIdentificacion(){
    return identificacion;
}
}
