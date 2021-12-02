/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 *traza una recta entre los dos puntos y se toma el valor que corta con 
 *el eje x, valor de a menor que b, 
 * and open the template in the editor.
 */
package secantemodificado;

import java.util.Scanner;

/**
 *
 * @author Angie Mendez
 */
public class SecanteModificado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//valores muy cercanos
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        System.out.println("ingrese el valor  de X0");
        String a = datos.next();
        System.out.println("Ingrese las cifras");
        secanteMod(Double.parseDouble(a), datos.nextInt());
    }
    public static void secanteMod(double a, int cifras){
        System.out.println("\tn \tb \ta \tx(n)  \tf(Xn) \terror");
        double e = Math.pow(10, -cifras);
        int i = 1;
        double b = a;
        double delta = 0.001;
        double error = 1;
        System.out.printf("\n\t%d \t%.5f \t%.5f \t%.5f  \t%.5f ", i, b, a, funcion(b), error);
        while(Math.abs(funcion(b)) > e && error > 5 * e  &&  i<=40){
            b = a-(delta * a * funcion(a))/(funcion(a + delta * a)- funcion(a));
            
            error = Math.abs((b-a)/b);
            a = b;
             i++;
            System.out.printf("\n\t%d \t%.5f \t%.5f \t%.5f  \t%.5f ", i, b, a, funcion(b), error); 
        }
        System.out.println("");
        System.out.println("La raiz esta en: " + a);
    }
        public static double funcion(double x) {
       // return x*x*x -x -1;//Math.pow(x, 10) - 1;
       return -3*Math.PI*x*x -25;
    }
}
