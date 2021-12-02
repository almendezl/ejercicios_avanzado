/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazApp;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;
import listaPila.Stack;

/**
 *
 * @author Angie Mendez
 */
public class InterfazApp {
    public static void main(String[] args) {
        while(true){
            try{
        Scanner datos = new Scanner (System.in);
        System.out.println("Ingrese el dato, una letra o un negativo para salir");
        
        BigInteger num = datos.nextBigInteger().abs();
        
        Stack<BigInteger> s = new Stack();
        
       while(!num.equals(new BigInteger("0"))){
            s.push(num.mod( new BigInteger("2")));
            num = num.divide(new BigInteger("2"));
       }
            for(BigInteger w:s){
                System.out.print(w + "");
            }
                System.out.println("");
            }catch(InputMismatchException i){
                System.exit(0);
            }
        }
        
    }
}
