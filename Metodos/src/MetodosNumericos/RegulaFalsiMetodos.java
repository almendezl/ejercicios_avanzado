/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosNumericos;

import java.util.Scanner;

/**
 *
 * @author Angie Mendez
 */
public class RegulaFalsiMetodos {

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
        regulaFalsi(Double.parseDouble(a),Double.parseDouble(b) , Double.parseDouble(c));

    }

    public static double function(double x) {
        return Math.pow(x, 10) - 1; //230 * Math.pow(x, 4) + 18 * Math.pow(x, 3) + 9 * Math.pow(x, 2) - 221 * x - 9;  //Math.pow(x, 10) - 1;//Math.pow(Math.E, x)-x*x-x-1;//Math.pow(x, 10)-1; //x*x*x-x-1;//Math.cos(x)-x;//Math.pow(Math.E, x)-(x*x)-x-1;//Math.sin(x) + 0.2; 
    }

    public static void regulaFalsi(double a, double b, double e) {
        double c = 0; //valor del medio 
        double d = 0; //variable auxiliar
        int i = 0; //contador
        if (function(a) * function(b) < 0) {
            System.out.printf("\n  \t  %.5f  \t  %.5f  \t  %.5f ", a, c, b);
            System.out.printf("\t %.5f", function(c));
            System.out.print(" \t " + i++);
            while (true) {
                c = (function(b) * a - function(a) * b) / (function(b) - function(a));
                System.out.printf("\n  \t  %.5f  \t  %.5f  \t  %.5f ", a, c, b);
                System.out.printf("\t %.5f", function(c));
                if (Math.abs(function(c)) <= Math.pow(10, -e) || Math.abs(c - d) <= Math.pow(10, -e)) {

                    System.out.println("\nEl valor de X es: " + c);
                    break;
                }
                if (function(a) * function(c) < 0) {
                    b = c;
                } else {
                    a = c;
                }
                d = c;
                //System.out.print(" \t " + i++);
                //System.out.printf("\n  \t  %.5f  \t  %.5f  \t  %.5f ", a, c, b);
                //System.out.printf("\t %.5f", function(d));
                System.out.print(" \t " + i++);
            }
        } else {
            System.out.println("No hay raiz");
        }
    }
}
