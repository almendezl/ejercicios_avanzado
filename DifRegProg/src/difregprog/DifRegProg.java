/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package difregprog;

/**
 *
 * @author Angie Mendez
 */
public class DifRegProg {

    /**
     * @param args the command line arguments
     */
    static double x[] = {0.2, 0.4, 0.6, 0.8, 1, 1.2, 1.4};
    static double y[] = {0.3455, 0.9045, 0.9045, 0.3455, 0, 0.3455, 0.9045};
    static double h = x[1] - x[0];

    public static void main(String[] args) {
        
        System.out.println("valor de h: "+h);
        // la tabla
        int n = x.length;
        double A[][] = new double[n][(n * (n - 1)) / 2];
        for (int j = 0; j < n; j++) {
            A[j][0] = y[j];
        }
        int p;
        for (int k = 0; k < n - 1; k++) {
            p = 0;
            for (int i = k + 1; i < n; i++) {
                A[i][k + 1] = (A[i][k] - A[i - 1][k]) / (x[i] - x[p]);
                p++;
            }
        }
        
    }

    public static void regresivas(double arreglo[], int valor) {
        
        for (int i = 0; i < 10; i++) {
            
        }
        
        
        
        
        double res = y[0] + (y[0]) / h;
        double mult = 1;
        int k = 1;
        for (int i = 0; i < k; i++) {
            if (k < x.length) {
                mult *= valor - x[i];
            }
            k++;
        }
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
                System.out.printf("%.5f \t", A[i][j]);
            }
            System.out.println("");
        }
    }

    public static double funcion(double x) {
        return x;
    }
}
