/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 *Evita que uno de sus puntos permanezca fijo, cuando eso pasa divide
 *a la mitad el valor de la funcion en el punto de estancamiento
 * and open the template in the editor.
 */
package regulafalsiModificado;

import java.util.Scanner;

/**
 *
 * @author Angie Mendez
 */
public class RegulaFalsi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese el valor de a");
        String a = datos.next();
        System.out.println("Ingrese el valor de b");
        String b = datos.next();
        System.out.println("Ingrese el valor de epsilon");
        String c = datos.next();
        System.out.println("\ta \t\tc \t\tb \t\tf(c) \t\tn\n");
        double rta = regulaFalsi(Double.parseDouble(a), Double.parseDouble(b), Double.parseDouble(c));
        if (rta != -123456) {
            System.out.printf("\n \tEl valor de x es: %.5f \n", rta);
        } else {
            System.out.println("NO hay raiz");
        }
    }

    public static double function(double x) {
      //aqui se escribe la funcion continua
    return -3*Math.PI*x*x -25;
    }

    public static double regulaFalsi(double a, double b, double e) {
        double c = 0; //valor del medio 
        double d = 0; //variable auxiliar
        int i = 0; //contador
        if (function(a) * function(b) < 0) {
            System.out.print(" \t " + i++);
            System.out.printf("\n  \t  %.5f  \t  %.5f  \t  %.5f ", a, c, b);
            System.out.printf("\t %.5f", function(c));
            while (true) {
                c = (function(b) * a - function(a) * b) / (function(b) - function(a));

                System.out.printf("\n  \t  %.5f  \t  %.5f  \t  %.5f ", a, c, b);
                System.out.printf("\t %.5f", function(c));
                if (Math.abs(function(c)) <= Math.pow(10, -e) || Math.abs(c - d) <= Math.pow(10, -e) || Math.abs((c - d) / c) <= 5 * Math.pow(10, -e)) {
                    return c;
                }
                if (function(a) * function(c) < 0) {
                    if (d == b) {// aqui se mejora el algoritmo
                        c = (function(b) * a - 0.5 * function(a) * b) / (function(b) - 0.5 * function(a));
                    }
                    b = c;

                }    else {
                    if (d == a) {// aqui se mejora el algoritmo
                        c = (0.5 * function(b) * a - function(a) * b) / (0.5 * function(b) - function(a));
                    }
                    a = c;

                }
                d = c;
                System.out.print(" \t " + i++);


            }
        } else {
            return -123456; //si no se cumple la condicion inicial
        }
    }

}
