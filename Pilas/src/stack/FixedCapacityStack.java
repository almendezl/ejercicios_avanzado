/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author Angie Mendez
 */
public class FixedCapacityStack {
    //arreglo de la pila y tamañp de la pila
    
    private String stack[];
    private int N;
    
    public FixedCapacityStack(int cap){
        stack = new String [cap];
        N =0;
    }
    public void push(String item){
        stack[N++] = item; //primero lo usa y lugo incrementa 
    }
    public String pop (){
        return stack[--N];
    }
    public boolean isEmpty(){
        return N ==0;
    }
    public int size(){
        return N;//es la cantidad de elementos  que estan en la pila y no el tamaño del arreglo
    }
}
