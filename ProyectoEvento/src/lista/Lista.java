package lista;

import java.util.Iterator;

/**
 *
 * @author Angie Mendez y Nicolas.
 * @param <Item>
 */
public class Lista<Item> implements Iterable<Item> {

    private Node primero;
    private Node ultimo;
    private int N;

    private class Node {

        Item item;
        Node siguiente;
        Node anterior;

    }

    public Lista() {
        primero = null;
        ultimo = null;
        N = 0;
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public int size() {
        return N;
    }

    public void insertarFinal(Item item) {
        Node nuevo = new Node();
        nuevo.item = item;
        if (primero == null) {
            nuevo.siguiente = null;
            nuevo.anterior = null;
            primero = nuevo;
            ultimo = nuevo;
        } else {

            ultimo.siguiente = nuevo;
            nuevo.siguiente = null;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }
        N++;
    }

    public void eliminaValor(Item item) {
        if (!isEmpty()) {
            Node aux = primero;
            while (aux != null) {
                if (aux.item == item) {
                    if (aux.anterior == null) {
                        primero = aux.siguiente;
                        primero.anterior = null;
                        N--;
                        return;
                    } else if (aux.siguiente == null) {
                        ultimo = aux.anterior;
                        ultimo.siguiente = null;
                        N--;
                        return;
                    } else {
                        aux.anterior.siguiente = aux.siguiente;
                        aux.siguiente.anterior = aux.anterior;
                        N--;
                        return;
                    }
                }
                aux = aux.siguiente;
            }
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();

    }

    private class ListIterator implements Iterator<Item> {

        private Node current = primero;

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
            current = current.siguiente;
            return item;
        }
    }

}
