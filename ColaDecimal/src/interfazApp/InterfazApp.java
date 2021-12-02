/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazApp;

import java.util.InputMismatchException;
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
                System.out.println("Ingrese el dato, \nIngrese una letra para salir");
                int n = Math.abs(datos.nextInt());
        String binario = String.valueOf(n);
        Queue <Integer> decimal = new Queue();
        for (int i = 0; i < binario.length(); i++) {
            int num = Integer.parseInt(binario.substring(i, i+1));
            if(num == 1 || num ==0)
                decimal.enqueue(num);
            
        }
        int contador = 0;
        for (int i = 0; i < binario.length(); i++) {
            contador += decimal.dequeue()*Math.pow(2, decimal.size());
        }
        System.out.println(contador);
            
    }catch( NumberFormatException  | InputMismatchException e){
            System.exit(0);
}catch(NullPointerException c){
            System.out.println("Error, intente de nuevo\n");
}
        }
    }
}
