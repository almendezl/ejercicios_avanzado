/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*para aproximar un valor  en un punto medio de los datos de la tabla de x y y
*las distancias entre los puntos debe ser iguales
*Ventajas: 
•	Ofrece ventajas para el caso general de interpolación, ya que, es utilizable con mucha mayor precisión en un sector más amplio de la tabla dada, que las fórmulas ya estudiadas.
Desventajas:
•	El método de Stirling acostumbra a dar mejores resultados para grados impares de polinomios de interpolación. 

 */
package stirling;

/**
 *
 * @author Administrador
 */
// Java program to demonstrate Stirling 
// Approximation 

import static java.lang.Math.*;

public class Stirling {

    static void Stirling(double x[], double fx[], double x1, int n) {
        double h, a, u, y1 = 0, N1 = 1, d = 1,
                N2 = 1, d2 = 1, temp1 = 1,
                temp2 = 1, k = 1, l = 1, delta[][];

        delta = new double[n][n];
        int i, j, s;
        h = x[1] - x[0];
        s = (int) floor(n / 2);
        a = x[s];
        u = (x1 - a) / h;

        // Preparing the forward difference 
        // table 
        for (i = 0; i < n - 1; ++i) {
            delta[i][0] = fx[i + 1] - fx[i];
        }
        for (i = 1; i < n - 1; ++i) {
            for (j = 0; j < n - i - 1; ++j) {
                delta[j][i] = delta[j + 1][i - 1]
                        - delta[j][i - 1];
            }
        }

        // Calculating f(x) using the Stirling 
        // formula 
        y1 = fx[s];

        for (i = 1; i <= n - 1; ++i) {
            if (i % 2 != 0) {
                if (k != 2) {
                    temp1 *= (pow(u, k)
                            - pow((k - 1), 2));
                } else {
                    temp1 *= (pow(u, 2)
                            - pow((k - 1), 2));
                }
                ++k;
                d *= i;
                s = (int) floor((n - i) / 2);
                y1 += (temp1 / (2 * d))
                        * (delta[s][i - 1]
                        + delta[s - 1][i - 1]);
            } else {
                temp2 *= (pow(u, 2)
                        - pow((l - 1), 2));
                ++l;
                d *= i;
                s = (int) floor((n - i) / 2);
                y1 += (temp2 / (d))
                        * (delta[s][i - 1]);
            }
        }

        System.out.print(+y1);
    }

    // Driver main function 
    public static void main(String args[]) {
        int n;
        n = 5;
        double x[] = {1, 2, 3, 4, 5};
        double fx[] = {1, 4, 9, 16,25};

        // Value to calculate f(x) 
        double x1 = 3.2;

        Stirling(x, fx, x1, n);
    }
}
