/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazApp;

import listaCola.Queue;

/**
 *
 * @author Angie Mendez
 */
public class InterfazApp {
    public static void main(String[] args) {
        Queue <Integer> q = new Queue();
        for (int i = 0; i < 25; i++) {
            
            q.enqueue(i+1);
        }
        System.out.println("La pila completa");
        for(int numero: q){
            System.out.print(numero+ " ");
        }
        while(q.iterator().hasNext()){
            System.out.println("La cola nueva");
            for(int numero: q){
            System.out.print(numero +" ");
        }
            System.out.println(q.dequeue());
        }
    }
}
