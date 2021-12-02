/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*Ventajas 
•	Permite calcular una aproximación del valor de la función en un punto, sin necesidad de hallar el polinomio
•	Su algoritmo es sencillo
•	Facilita la estimación del error de interpolación
Desventajas
•	Los polinomios generados para hallar la aproximación del valor dado son recurrentes, es decir para construir los polinomios de grado 3, se necesitan los de grado dos, quienes a su vez necesitan los de grado 1
•	Cuando se tiene una gran cantidad de puntos, el algoritmo se vuelve mas complejo ya que realiza mas iteraciones para poder hallar el valor aproximado

 */
package neville;

import java.util.Scanner;

/**
 *
 * @author Angie Mendez
 */
public class Neville {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*   Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese el total de datos ");
        int tamanio = datos.nextInt();
        System.out.println("Ingrese los valores de la tabla de X");
        double arrX[] = new double[tamanio];
        for (int i = 0; i < arrX.length; i++) {
            System.out.println("Dato " + (i + 1));
            arrX[i] = datos.nextDouble();
        }
        System.out.println("Ingrese los valores de la tabla de Y");
        double arrY[] = new double[tamanio];
        for (int i = 0; i < arrX.length; i++) {
            System.out.println("Dato " + (i + 1));
            arrY[i] = datos.nextDouble();
        }
        System.out.println("Ingrese el valor de X que desea aproximar");
        double x = datos.nextDouble();

        System.out.println("El valor de f(x) es: "+Neville(arrX, arrY, x));*/
        double arr[] = {0.2, 0.4, 0.6, 0.8};
        double y[] = {0.98, 0.9210, 0.8253, 0.6967};
        System.out.println("El valor de f(x) es: " + Neville(arr, y, 0.5));
    }

    public static double Neville(double[] X, double[] Y, double val) {
        int n = X.length;
        double A[][] = new double[n][(n * (n - 1)) / 2];
        for (int j = 0; j < n; j++) {
            A[j][0] = Y[j];
        }
        int p;
        for (int k = 0; k < n - 1; k++) {
            p = 0;
            for (int i = k + 1; i < n; i++) {
                A[i][k + 1] = (((val - X[p]) * A[i][k]) - ((val - X[i]) * A[i - 1][k])) / (X[i] - X[p]);
                p++;
            }
        }
        System.out.println(imprimir(A, X.length));
        return A[n - 1][n - 1];
    }

    public static String imprimir(double A[][], int tamanio) {
        String salida = "\n";
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] != 0) {
                    salida += A[i][j] + "\t";
                } else {
                    salida += " \t";
                }
            }
            salida += "\n";
        }
        return salida;
    }

    public static double funcion(double x) {
        return x;
    }
}
