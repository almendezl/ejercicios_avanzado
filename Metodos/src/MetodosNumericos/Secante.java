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
public class Secante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        System.out.println("ingrese el valor a");
        String a = datos.next();
        System.out.println("ingrese el valor de b");
        String b = datos.next();
        System.out.println("Ingrese las cifras");

        secante(Double.parseDouble(a), Double.parseDouble(b), datos.nextInt());

    }

    public static void secante(double a, double b, int cifras) {
        System.out.println("\tn \tb \ta \tx(n)  \tf(Xn) \terror");
        double e = Math.pow(10, -cifras);
        int i = 1;
        double error = Math.abs((b - a) / b);
        double c = 0;
System.out.printf("\n\t%d \t%.5f \t%.5f \t%.5f  \t%.5f \t%.5f", i, b, a,c, funcion(c), error);
        while (Math.abs(funcion(b)) > e && error > 5 * e && i<=40) {

            c = (a * funcion(b) - b * funcion(a)) / (funcion(b) - funcion(a));
            //System.out.printf("\n\t%d \t%.5f \t%.5f \t%.5f  \t%.5f \t%.5f", i, b, a,c, funcion(c), error);
            //System.out.println(i + "\t" + b + "\t" + a + "\t" + c + "\t" + funcion(c) + "\t" + error);
            a = b;
            b = c;
            error = Math.abs((b - a) / b);
            i++;
            System.out.printf("\n\t%d \t%.5f \t%.5f \t%.5f  \t%.5f \t%.5f", i, b, a,c, funcion(c), error);
            //System.out.println(i + "\t" + b + "\t" + a + "\t" + c + "\t" + funcion(c) + "\t" + error);
        }
        System.out.println("");
        System.out.println("La raiz esta en: " + c);
    }

    public static double funcion(double x) {
        return Math.sin(x)+ Math.cos(1+Math.pow(x, x))-1; //0.653*x*(1 - Math.pow(Math.E,-(150/x) ))-36;  //
//Math.sin(x) + Math.cos(1 + x*x)-1;    //x*x*x - x-1;   //Math.pow(x, 10) - 1;
    }
}
