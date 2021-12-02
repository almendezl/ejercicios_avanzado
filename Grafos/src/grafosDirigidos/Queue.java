/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafosDirigidos;

import java.util.Iterator;

/**
 *
 * @author Angie Mendez
 */
public class Queue<Item> implements Iterable<Item> {

    private class Node {

        Item item;
        Node next;
    }
    private Node first;
    private Node last;
    private int N;

    public Queue() {
        first = null;
        last = null;
        N = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

    public void enqueue(Item item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
        }
        N++;
    }

    
    public Item dequeue(){
        Item item = first.item;
        first = first.next;
        if(isEmpty()){
            last = null;
        }
        N--;
        return item;
    }

    @Override
        public Iterator<Item> iterator() {
        return new ListIterator();
    

}

    private class ListIterator implements Iterator<Item> {

    private Node current = first;

    public boolean hasNext() {
        return current != null;
    }

    public void remove() {
    }

    public Item next() {
        Item item = current.item;
        current = current.next;
        return item;
    }
}

}
