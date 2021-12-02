/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * tres puntos con los que traza una parabola y selecciona la raiz mas conveniente
 * halla raices complejas
 */
package muller;

import java.util.Scanner;

/**
 *
 * @author Angie Mendez
 */
public class Muller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        double x0, x1, x2, x3;
        double h0, h1, d0, d1, a, b, c, e;
        int cifras, n = 0;
        System.out.println("Ingrese: ");
        System.out.println("x0");
        System.out.println("x1");
        System.out.println("x2");
        System.out.println("cifras");
        x0 = datos.nextDouble(); //debe ser mayor que x1
        x1 = datos.nextDouble(); //debe ser mayor que x2
        x2 = datos.nextDouble(); 
        cifras = datos.nextInt();
        System.out.print("\nn \tx0 \tx1 \tx2 \tx3 \tf(x) \terror ");
do{
    h0 = x1 - x0;
        h1 = x2 - x1;
        d0 = (funcion(x1) - funcion(x0)) / (x1 - x0);
        d1 = (funcion(x2) - funcion(x1)) / (x2 - x1);
        a = (d1 - d0) / (h1 + h0);
        b = a * h1 + d1;
        c = funcion(x2);
        x3 = b > 0 ? x2 - ((2 * c) / (b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))) : x2 - ((2 * c) / (b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)));
        e = Math.abs((x3 - x2) / x3); n++;
        System.out.printf("\n%d \t%.5f \t%.5f \t%.5f \t%.5f \t%.5f \t%.5f", n, x0, x1, x2, x3, funcion(x3), e);
        //intercambio de varia bles
        x0 = x1;
        x1 = x2;
        x2 = x3;
}while(e <= 5*Math.pow(10, -cifras));
        
        

    }

    public static double funcion(double x) {
        //return Math.pow(x, 3) - 2 * Math.pow(x, 2) - 5;
        return Math.pow(x, 3)-x-1;
    }

}
