/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*Ventajas 
•	Permite calcular el polinomio de Lagrange en cualquier punto x
•	No considera el espaciamiento entre cada uno de los puntos
•	Sirve para aproximar funciones complejas a otras mas sencillas
•	Útil para número reducido de puntos a interpolar
•	Útiles para desarrollar expresiones de derivadas e integrales
Desventajas
•	A medida que aumentan los puntos a interpolar, aumenta el grado del polinomio
•	A medida que aumenta la cantidad de puntos, su algoritmo se vuelve mas extenso, ya que la matriz aumenta de tamaño

 */
package newton_diferencias;

import java.util.Scanner;

public class Newton_Diferencias {

    public static void main(String[] args) {

        /*Scanner datos = new Scanner(System.in);
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
        }*/
 double arr[]={0.2,0.4,0.6,0.8};
        double y[]={0.98,0.9210,0.8253,0.6967};
        System.out.println("El valor de f(x) es: " + tabla(arr, y));
    }

    public static double tabla(double[] X, double[] Y) {
        int n = X.length;
        double A[][] = new double[n][(n * (n - 1)) / 2];
        for (int j = 0; j < n; j++) {
            A[j][0] = Y[j];
        }
        int p;
        for (int k = 0; k < n - 1; k++) {
            p = 0;
            for (int i = k + 1; i < n; i++) {
                A[i][k + 1] = (A[i][k] - A[i - 1][k]) / (X[i] - X[p]);
                p++;
            }
        }
        imprimir(A, X.length);
        return A[n - 1][n - 1];
    }

    public static void imprimir(double A[][], int tamanio) {
        System.out.println("");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                /*if (A[i][j] != 0) {
                    System.out.printf("%.5f \t",A[i][j]);
                } else {
                    System.out.println("\t");
                }*/
                System.out.printf("%.5f \t",A[i][j]);
            }
            System.out.println("");
        }
    }

    public static double funcion(double x) {
        return x;
    }

}
