/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.math.BigInteger;
import java.util.Scanner;
import listaCola.Queue;

/**
 *
 * @author Angie Mendez
 */
public class InterfazApp {

    public static void main(String[] args) {
        while(true){
            try{
        Scanner datos = new Scanner(System.in);
                System.out.println("Ingrese  el numero binario, \nuna letra o un negativo para salir");
        String numero = datos.next();
        Queue<BigInteger> q = new Queue();

        for (int i = 0; i < numero.length(); i++) {
            q.enqueue(new BigInteger(numero.substring(i, i + 1)));
        }
        
        BigInteger contador = new BigInteger("0");
        for (int i = 0; i < numero.length(); i++) {
            contador = contador.add(q.dequeue().multiply(new BigInteger("2").pow(q.size())));
        }
        System.out.println("\n" + contador);
            }catch(NumberFormatException n){
                System.exit(0);
            }
    }
    }
}
