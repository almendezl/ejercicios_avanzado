/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Angie Mendez
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese el numero de filas del array:");
        Scanner datos = new Scanner(System.in);
        int filas = datos.nextInt();
        System.out.println("Ingrese el numero de columnas:");
        int columnas = datos.nextInt();
        int array[][] = new int [filas][columnas];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Ingrese el dato fila " +(i+1)+ " Columna "+(j+1));
                array[i][j] = datos.nextInt();
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+ "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[j][i]+ "\t");
            }
            System.out.println("");
        }
    }

}
