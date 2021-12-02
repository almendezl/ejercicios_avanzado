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
public class MetodoSecante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //secante(0,2,5);
        //arreglar
        Scanner datos = new Scanner (System.in);
        
        double[] x = new double[50];
        double a= 0.9;
        double b= 0.8;
        double e = 0;
        int i = 1;
        x[0]=a;
        x[1]=b;
        while(e> 10e-5 || funcion(x[i])<10e-5){
            x[i+1] = x[i]-((funcion(x[i])* (x[i-1]-x[i]))/(funcion(x[i-1])-funcion(x[i])));
                    e= Math.abs((x[i]-x[i-1]))/Math.abs(x[i]);
                    System.out.printf("\n%d  \t%f \t %f \t %f \t %f", i,x[i-1], x[i], funcion(x[i]), e);
                   // System.out.println("xi-1 -> "+ x[i-1]);
                    //System.out.println("funcion de xi"+ funcion(x[i]));
                    i++;
        }
    }
    public static double funcion(double x) {
        return  Math.pow(x, 10)-1;     //30787.6*x*x-10262.5*x*x*x;    //230*Math.pow(x, 4)+18*Math.pow(x, 3)+9*Math.pow(x, 2)-221*x-9;    //Math.sin(x) + 0.2;//Math.pow(x, 10)-1;//Math.sin(x) + 0.2; 
    }
 
}
