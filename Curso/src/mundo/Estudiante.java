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
public class Estudiante {

    private final String nombre;
    private int edad;
    private final String identificacion;
    private double notas[];

    public Estudiante(String nombre, int edad, String identificacion, double notas[]) {
        this.nombre = nombre;
        if (edad >= 15) {
            this.edad = edad;
        } else {
            this.edad = 15;
        }
        this.identificacion = identificacion;
        notas = new double[4];
    }

    public String getNombre(){
        return nombre;
    }
    public void setEdad(int edad){
        if(edad >= 15)
            this.edad = edad;
        else
            this.edad = 15;
    }
    public int getEdad(){
        return edad;
    }
    public String getIdentificacion(){
        return identificacion;
    }
    public double[] getNotas(){
        return notas;
    }
   
}
