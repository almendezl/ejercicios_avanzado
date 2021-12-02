/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splinescubicos;
//import metodos.Util;

public class SplinesCubicos {
static double componenteX[]= {1,2,3,4,5};
        static double componenteY[]= {1,4,9,25};
        static double D[], C[], B[];


    public static void main(String[] args) {
        
    int n=5;//numero de puntos
    
    splines(n);
    double xi[] = new double[200];// almacena los valores Xi de las paricines de cada intervalo [Xi,Xi+1]
            // se divide el intervalo [Xo,Xn-1] en 199 particiones
            double h1 = (componenteX[componenteX.length - 1] - componenteX[0]) / 199;

            xi[0] = componenteX[0];
            for (int i = 1; i < xi.length; i++) {
                xi[i] = componenteX[0] + (i * h1);// paso a determinar las valores Xi del intervalo [Xo,Xn-1]
            }
    puntosParticion(n, componenteX, componenteY,xi, B,C,D);
double x_evaluar = 2.5;// almacena en el en la poicion i del arreglo el valor ingresado en jText de la componente en x
            double sx;// variable que almacena el valor del polinomio en el punto ingresado
            for (int i = 0; i < n- 1; i++) {
                // si el punto ingresado es elemento del intervale [Xi,Xi+1]
                    // se evalua e punto ingresado en el polinomio Sj
                    sx = componenteY[i] + (B[i] * (x_evaluar - componenteX[i])) + (C[i] * Math.pow(x_evaluar - componenteX[i], 2)) + (D[i] * Math.pow(x_evaluar - componenteX[i], 3));
                   System.out.println("El valor aproximado es:"+sx);
                    //  inprime el resultado de la evluacion anterior
                    

                
    }
    }
    public static double[] puntosParticion(int puntos, double[] x, double[] y, double[] xi, double[] bj, double[] cj, double[] dj) {
        double li[] = new double[200];// almacena las componentes y de la particion del intervalo [a,b]
        double sx = 0;
        for (int k = 0; k < li.length; k++) {
            
            for (int i = 0; i < puntos-1; i++) {
            if (xi[k]>x[i] && xi[k]<x[i+1] ) {
                sx=y[i]+( bj[i]*(xi[k]-x[i]) )  +  (cj[i]*Math.pow(xi[k]-x[i], 2)) +(dj[i]*Math.pow(xi[k]-x[i], 3));
            }
        }
            li[k]=sx;
            
        }

        return li;
    }
    public static void splines(int n1) {
        
        
            int puntos = n1;
            String puntosSr[] = new String[puntos];
            String punto;
            double x[] = componenteX;// arreglo que almacena las componentes x de los puntos ingresados
            double y[] = componenteY;// arreglo que almacena las componentes Y de los puntos ingresados

            // AC=b
            double h[] = new double[puntos];




            for (int i = 0; i < puntos - 1; i++) {
                h[i] = x[i + 1] - x[i];
            }



            double b[] = new double[puntos];



            /**
             * paso a cargar la matriz b 
             * |-                                           -|
             * |         0                                   |
             * | 3(x2-x1)/h1 - 3(x1-x0)/h0                   |
             * |       .                                     | 
             * |       .                                     |
             * |       .                                     | =b, con i=0,...,n-1 | . |
             * | 3(Xn - Xn-1)/(hn-1) - 3(Xn-1 - Xn-2)/(hn-2) |
             * |          0                                  |
             * |-                                           -|(n+1)x1
             */
            b[0] = 0;
            b[puntos - 1] = 0;
            for (int i = 1; i < puntos - 1; i++) {
                b[i] = ((3 / h[i]) * (y[i + 1] - y[i])) - ((3 / h[i - 1]) * (y[i] - y[i - 1]));

            }// fin cargar matriz b







            // 
            double matrizA[][] = new double[puntos][puntos];// de orden nxn, con i=0,...,n-1
            /**
             * |-                                                  -|
             * | 1            0 ................................. 0 | 
             * | h0      2(h0+h1)    h1 ................          0 | 
             * | 0          h1   2(h1+h2)     h2 ................ 0 |
             * | 0           0  .....................  .  0       1 |
             * | 0           0             hn-2  2(hn-2 +hn-1) hn-1 |
             * |-                                                  -| (n+1)x(n+1)
                 
                 * A=matrizA, con i=0,...,n-1  
             
             */
            matrizA[0][0] = 1;
            matrizA[puntos - 1][puntos - 1] = 1;

            for (int i = 1; i < puntos; i++) {
                matrizA[0][i] = 0;
            }
            for (int i = 0; i < puntos - 1; i++) {
                matrizA[puntos - 1][i] = 0;
            }



            // paso a cargar la matrizA  desde la fila i asta la fila n,  con  i=1,...n


            for (int i = 1; i < puntos; i++) {
                for (int j = 1; j < puntos - 1; j++) {

                    if (i == j) {
                        matrizA[i][j - 1] = h[j - 1];
                        matrizA[i][j] = 2 * (h[j - 1] + h[j]);
                        matrizA[i][j + 1] = h[j];
                    }

                }// fin buqle j

            }// fin bucle i
            // fin cargar la matirzA 




            /**
             * la matrizA1 es de dimension (puntos-2)x(puntos-2), usada para
             * resolver el sistema de e uaciones para en contrar las incognitas
             * cj de la matriz C Note que por las condiciones de frotera las
             * componentes Cjo=0 y Cjn=0
             */
            double matrizA1[][] = new double[puntos - 2][puntos - 2];
            for (int i = 0; i < puntos - 2; i++) {
                for (int j = 0; j < puntos - 2; j++) {
                    matrizA1[i][j] = matrizA[i + 1][j + 1];
                }// fin buqle j
            }// bucle i







            int n = puntos - 2;
            double r[] = new double[n];// carreglo que almacenara los valores de Cji  desde i=1,...,n-2
            for (int l = 0; l < n; l++) {
                r[l] = b[l + 1];

            }




            /**
             * acontinuacion usamos el metodo de caus jordan para encontar los
             * valores de Cji desde i=1,...,n-2
             */
            double d, c1;
            for (int i = 0; i <= n - 1; i++) {
                d = matrizA1[i][i];
                for (int s = 0; s <= n - 1; s++) {
                    matrizA1[i][s] = ((matrizA1[i][s]) / d);
                }
                r[i] = ((r[i]) / d);
                for (int x1 = 0; x1 <= n - 1; x1++) {
                    if (i != x1) {
                        c1 = matrizA1[x1][i];
                        for (int y1 = 0; y1 <= n - 1; y1++) {
                            matrizA1[x1][y1] = matrizA1[x1][y1] - c1 * matrizA1[i][y1];
                        }
                        r[x1] = r[x1] - c1 * r[i];
                    }// fin if
                }/// buble x1
            }// fin bucle i





            /**
             * nesitamos que la matriz C sea de la forma
             *
             * |- -| 
             * | 0 |
             * | 1 |
             * | 1 |
             * | . |
             * | . | =C
             * | . |
             * | . |
             * | 1 |
             * | 0 |
             * |- -|(n+1)x1 Note que por las condiciones de frotera las componentes
             * Cjo=0 y Cjn=0
             */
            double cj[] = new double[puntos];
            cj[0] = 0;
            cj[puntos - 1] = 0;
            for (int i = 1; i < puntos - 1; i++) {
                cj[i] = r[i - 1];
            }



            /**
             * los polinomios de Splin cubicos esta dadas por la siguiente
             * expresion Sj(X)=aj+bj(x-xj)+cj(x-xj)^2 +dj(x-xj)^3, donde las
             * aj=y[j]
             */
            double bj[] = new double[puntos - 1];
            double dj[] = new double[puntos - 1];
            for (int i = 0; i < puntos - 1; i++) {
                bj[i] = ((y[i + 1] - y[i]) / h[i]) - ((h[i] * (2 * cj[i] + cj[i + 1])) / 3);
                dj[i] = (cj[i + 1] - cj[i]) / (3 * h[i]);
            }



            for (int j = 0; j < puntos - 1; j++) {
                String signo = "-";
                if (x[j] < 0) {
                    signo = "";

                }
                System.out.println("S" + j + "(x)= " + y[j] + " + (" + bj[j] + ")(x" + j + signo + x[j] + ")  +  (" + cj[j] + ")(x" + j + signo + x[j] + ")^2 + ( " + dj[j] + ")(x" + j + signo + x[j] + ")^3\n");
            }

            C= cj;
            B = bj;
            D = dj;
        }
}


