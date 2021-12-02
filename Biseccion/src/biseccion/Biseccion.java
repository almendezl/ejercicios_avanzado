/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biseccion;

import java.util.Scanner;

/**
 *
 * @author Angie Mendez
 */
public class Biseccion {

    public static double fuction(double x) {

        return -5.6667 + 14.3238 * x - 30.2859 * Math.pow(x, 2) + 22.0325 * Math.pow(x, 3)
                - 7.69148 * Math.pow(x, 4) + 1.45825 * Math.pow(x, 5) - 0.15313 * Math.pow(x, 6)
                + 0.00832472 * Math.pow(x, 7) - 0.000182013 * Math.pow(x, 8);
        //Aqui se escribe la funcion continua
    }

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("ingrese el valor a");
        System.out.println("ingrese el valor b");
        System.out.println("Ingrese el valor de epsilon");
        System.out.println("\t   a      \tc      \tb     \tf(c)      \tn");
        double a = datos.nextDouble();
        double b = datos.nextDouble();
        bisection(a, b, datos.nextInt());

    }

    public static void bisection(double a, double b, double e) {
        double c = 0; //valor del medio 
        double d = 0; //variable auxiliar
        int i = 0; //contador
        if (fuction(a) * fuction(b) < 0) {
            System.out.printf("\n  \t  %.5f  \t  %.5f  \t  %.5f ", a, c, b);
            System.out.printf("\t %.5f", fuction(c));
            System.out.print(" \t " + i++);
            while (true) {

                c = (a + b) / 2;
                System.out.printf("\n  \t  %.5f  \t  %.5f  \t  %.5f ", a, c, b);
                System.out.printf("\t %.5f", fuction(c));

                if (Math.abs(fuction(c)) <= Math.pow(10, -e) || Math.abs(c - d) <= 5 * Math.pow(10, -e)) {
                    System.out.println("\nEl valor de X es: " + c);
                    break;
                }
                if (fuction(a) * fuction(c) < 0) {
                    b = c;
                } else {
                    a = c;
                }
                d = c;
                System.out.print(" \t " + i++);
            }

        } else {
            System.out.println("No hay raiz");
        }
    }
}
