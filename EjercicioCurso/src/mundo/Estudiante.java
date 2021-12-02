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

    public Estudiante(String nombre, int edad, String identificacion) {
        this.nombre = nombre;
        if (edad >= 16) {
            this.edad = edad;
        } else {
            this.edad = 16;
        }
        this.identificacion = identificacion;
        notas = new double[4];
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setEdad(int edad) {
        if (edad >= 16) {
            this.edad = edad;
        } else {
            this.edad = 16;
        }
    }

    public double[] getNotas() {
        return notas;
    }

    public double getNotas(int corte) {
        if (corte >= 1 && corte <= 4) {
            return notas[corte - 1];
        } else {
            return -1;
        }
    }

    private double notaFinal(double notas[]) {
        return notas[0] * 0.3 + notas[1] * 0.3 + notas[2] * 0.4;
    }

    public void setNotas(double nota, int corte) {
        if (corte >= 1 && corte <= 4) {
            if (nota >= 0 && nota <= 5) {
                notas[corte - 1] = nota;
                notas[3] = notaFinal(notas);
            }
        }
    }

    public void setNotas(double notas[]) {
        boolean asignar = true;
        for (double n : notas) {
            if (n < 0 || n > 5) {
                asignar = false;
                break;
            }
            
        }
        if(asignar && notas[3] == notaFinal(notas))
            this.notas = notas;
        notaFinal(this.notas);
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + " Edad: " + edad + "  Identificacion: " + identificacion +  "\nNota 1: "+ notas[0]+"\nNota 2: "+ notas[1]+ "\nNota 3: "+ notas[2]+"\nNota final: "+ notas[3] + "\n";
    }
    
}
