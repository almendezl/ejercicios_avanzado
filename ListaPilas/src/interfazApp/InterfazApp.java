/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazApp;

import listaPila.Stack;

/**
 *
 * @author Angie Mendez
 */
public class InterfazApp {
    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        for (int i = 0; i < 25; i++) {
            s.push(i+1);
        }
        System.out.println("La pila completa");
        for(int numero: s){
            System.out.print(numero+ " ");
        }
        while(s.iterator().hasNext()){
            System.out.println("La cola nueva");
            for(int numero: s){
            System.out.print(numero +" ");
        }
            System.out.println(s.pop());
        }
        
    }
}
