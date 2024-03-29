package cola;

import java.util.Iterator;

/**
 *
 * @author Angie Mendez
 * @param <Item>
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
public void eliminar(Item item){
    if(!isEmpty()){
        Node aux = first;
        Node ant = null;
        while(aux != null){
            if(aux.item == item){
                if(ant == null){
                    aux = first.next;
                    first.next = null;
                    first = aux;
                    N--;
                    return;
                }else{
                    if(aux.next == null){
                        ant.next = null;
                        last = ant;
                        N--;
                        return;
                    }else{
                        aux = aux.next;
                        ant.next = aux;
                        N--;
                        return;
                    }
                }
            }else{
                ant = aux;
                aux = aux.next;
            }
        }
    }
}
    @Override
        public Iterator<Item> iterator() {
        return new ListIterator();
}

    private class ListIterator implements Iterator<Item> {

    private Node current = first;

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public void remove() {
    }

    @Override
    public Item next() {
        Item item = current.item;
        current = current.next;
        return item;
    }
}

}
