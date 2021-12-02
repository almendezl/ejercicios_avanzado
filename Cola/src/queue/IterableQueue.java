/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.util.Iterator;

/**
 *
 * @author Angie Mendez
 * @param <Item>
 */
public class IterableQueue<Item> implements Iterable<Item> {

    //enqueue recibe un item
    //dequeue elimina el primero agregado
    //is empty, size
    private Item queue[];
    private int fin;
    //usar n para saber la cantidad de elementos
    //hacer la implementacion con las dos variables de inicio y de fin 


    public IterableQueue() {
        queue = (Item[]) new Object[1];
        fin = 0;
    }

    public void enqueue(Item item) {
        if (fin == queue.length) {
            resize(queue.length * 2);
        }
        queue[fin++] = item;
    }
 public Item dequeue() {
   Item item = queue[0];
     for (int i = 1; i < fin; i++) {
         queue [i-1] = queue[i];
     }
   queue[--fin] = null;
   if (fin > 0 && fin < queue.length / 4) {
            resize(queue.length / 2);
            
    }
   /* public Item dequeue() {
        if(isEmpty()){
        Item auxiliar = queue[inicio++]; 
        queue[inicio-1] = null;
        if(inicio == fin)
            inicio = fin = 0; //cuando ambas se cruzan, si ambas son iguales que vuelva a comenzar a llenar desde cero
        if (fin > 0 && fin < queue.length / 4) {
            resize(queue.length / 2);
        }
        
        return auxiliar;
        }
        else 
            return null;
    }*/
   return item;
 }
    public boolean isEmpty() {
        return fin > 0;
    }

    public int size() {
        return fin;
    }

    public void resize(int tamanio) {
        Item temporal[] = (Item[]) new Object[tamanio];
        for (int i = 0; i < fin; i++) {
            temporal[i] = queue[i];
        }
        queue = temporal;
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iterador();
    }
private class Iterador implements Iterator<Item>{  // a este lo puedo llamar como quiera  IteradorDeCosianfiros por ejemplo 
        //cuando implemento una super clase, me vuelvo miembro de esa superclase 
        private int i = 0;
        
        @Override
        public boolean hasNext() {
            return i<fin;
        }

        @Override
        public Item next() {
            return queue[i++];
        }
        
    }
    
}
