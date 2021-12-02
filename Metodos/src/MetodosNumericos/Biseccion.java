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
public class Biseccion {

    public static double fuction(double x) {
        return  ((1+x)/2)*Math.pow((x)/(1-x+Math.pow(x, 2)), 21)-0.5;        //Math.pow(x, 10)-1;  //30787.6*x*x-10262.5*x*x*x;    //230*Math.pow(x, 4)+18*Math.pow(x, 3)+9*Math.pow(x, 2)-221*x-9;    //Math.sin(x) + 0.2;//Math.pow(x, 10)-1;//Math.sin(x) + 0.2; 
    }
public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("ingrese el valor a");
        System.out.println("ingrese el valor b");
        System.out.println("Ingrese el valor de epsilon");
        System.out.println("\t   a      \tc      \tb     \tf(c)      \tn");
        String a = datos.next();
        String b = datos.next();
        bisection(Double.parseDouble(a), Double.parseDouble(b), datos.nextInt());
   
    }
    
public static void bisection(double a, double b, double e){
    double c=0; //valor del medio 
    double d=0; //variable auxiliar
    int i =0; //contador
    if(fuction(a)*fuction(b)<0){
        System.out.printf("\n  \t  %.5f  \t  %.5f  \t  %.5f ",a, c, b);
        System.out.printf("\t %.5f",fuction(c));
        System.out.print(" \t "+ i++);
    while(true){
        
        c = (a+b)/2;
        System.out.printf("\n  \t  %.5f  \t  %.5f  \t  %.5f ",a, c, b);
        System.out.printf("\t %.5f",fuction(c));
        
        if(Math.abs(fuction(c)) <= Math.pow(10, -e) || Math.abs(c-d)<= 5*Math.pow(10, -e)){
            System.out.println("\nEl valor de X es: "+ c);
            break;
        }
        if(fuction(a)*fuction(c) < 0){
            b=c;
        }else{
            a=c;
        }
        d =c;
        //System.out.printf("\n  \t  %.5f  \t  %.5f  \t  %.5f ",a, c, b);
          //System.out.printf("\t %.5f",fuction(d));
            System.out.print(" \t "+ i++);
    }
    
    }
    else{
        System.out.println("No hay raiz");
    }
}
}
