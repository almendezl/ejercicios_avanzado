/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 *Es punto fijo si g(p) = p, se debe despejar una x de la funcion
 *para obtener la raiz o una de las raices
 *o poner x-( funcion)
 *No se puede salir del cuadrito 
 * and open the template in the editor.
 */
package puntofijo;


import java.util.Scanner;

/**
 *
 * @author Angie Mendez
 */
public class PuntoFijo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        //puntoFijo(0.4, 5);
        //System.out.println("\nAquie el otro");
        puntoF(4, 5);
    }
        public static double funcion(double x) {
        //Math.pow(3, -x);   //Math.pow(x, 10)-1;
        //return     Math.pow(3, -x);
        //return x-Math.pow(Math.E,x)+(2*x+2);
        //return x-((Math.pow(Math.E,x)-2)/3);
        //return  (Math.pow(Math.E, x)-2)/3;
        //return 1/(x+2);
        //return -1*Math.sqrt(1-2*x);
        //return (12*Math.pow(x, 3) +24*Math.pow(x, 2)-360)/348;
        return Math.sqrt((12*Math.pow(x, 3)-348*x-360)/24);
    }
public static void puntoFijo(double puntoInicial, int cifras){
    System.out.println("n \t p0 \t p \tf(p)");
    double p []= new double[200];
        p[0] = puntoInicial;
        p[1]= funcion(puntoInicial);
        int i = 1;
        while(Math.abs(p[i]-p[i-1]) >Math.pow(10, -cifras)){
            System.out.printf("\n"+i +"\t%.5f  \t%.5f  \t%.5f",p[i-1],p[i],funcion(p[i])); 
            i++;
            p[i]=funcion(p[i-1]);
            
        }
}
   public static void puntoF(double puntoInicial, int cifras) {
        double p1 = funcion(puntoInicial);
        double p0 = puntoInicial;
        int i = 1;
        System.out.println("n \t p0 \t p \tf(p)");
        while(Math.abs(p1-p0) > Math.pow(10, -cifras)){
            System.out.printf("\n"+i +"\t%.5f  \t%.5f  \t%.5f", p0,p1,funcion(p1));
            //System.out.println(i +"\t"+p0+"\t"+p1+"\t"+funcion(p1));
            i++;
            p0 = p1;
            p1 = funcion(p0);
        }
    }



}
