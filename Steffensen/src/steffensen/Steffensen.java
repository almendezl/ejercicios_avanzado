/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * combina punto fijo y aitken, utiliza la formula de abajo para encontrar un punto fijo
 * hay que despejar una x o poner x-(funcion)
 */
package steffensen;

/**
 *
 * @author Angie Mendez
 */
public class Steffensen {
    public static double funcion(double x) {
        //return x-Math.pow(Math.E,x)+(2*x+2);//para puntofijo la funcion original, para hallar la raiz, se pone x -(funcion)
        //return x-((Math.pow(Math.E,x)-2)/3);
        //return x+(Math.log(3*x+2));
       // return  (Math.pow(Math.E,x)-2)/3;//Math.pow(Math.E,x)-(2*x+2);
       //return  (Math.pow(Math.E, x)-2)/3;
       //return Math.log(3*x+2);
       //return 1/(x+2);
      return (12*Math.pow(x, 3) +24*Math.pow(x, 2)-360)/348;   //-1*Math.sqrt(1-2*x);//toca despejar una x
      //return Math.sqrt((12*Math.pow(x, 3)-348*x-360)/24);
    }

    public static void main(String[] args) {

        int cifras = 5, i = 0;
        double p0, p1, p2;
        double p = -5;//valor inicial cercano al punto o raiz
        double error;
        System.out.println("n \tp0 \tp1 \tp2 \tp \terror");

        do {
            p0 = p;
            p1 = funcion(p0);
            p2 = funcion(p1);
            p = p0 - (Math.pow(p1 - p0, 2) / (p2 - 2 * p1 + p0));
            error = Math.abs(p - p0);
            i++;
            System.out.printf("\n%d \t%.5f \t%.5f \t%.5f \t%.5f \t%f", i, p0, p1, p2, p, error);
        } while (error > Math.pow(10, -cifras));

    }
}
