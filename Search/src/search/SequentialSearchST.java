/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

/**
 *
 * @author Angie Mendez
 * @param <Key>
 * @param <Value>
 */
public class SequentialSearchST<Key, Value> {
    /**
     * busqueda secuencial con listas enlazadas para una tabla de simbolos
     */

    private Node first; // first node in the linked list

    private class Node { // linked-list node

        Key key;
        Value val;
        Node next;

        public Node(Key key, Value val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    public Value get(Key key) { // Search for key, return associated value.
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                return x.val; // search hit
            }
        }
        return null; // search miss
    }

    public void put(Key key, Value val) { // Search for key. Update value if found; grow table if new.
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.val = val;
                return;
            } // Search hit: update val.
        }
        first = new Node(key, val, first); // Search miss: add new node.
    }
}
