/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.Scanner;
import queue.IterableQueue;

/**
 *
 * @author Angie Mendez
 */
public class InterfazApp {

    public static void main(String[] args) {
        IterableQueue<Integer> digiturno = new IterableQueue();
        for (int i = 0; i < 25; i++) {
            digiturno.enqueue(i + 1);
        }
        System.out.println("La cola completa");
        for (int numero : digiturno) {
            System.out.println(numero + " ");
        }
        while (digiturno.iterator().hasNext()) {
            System.out.println("Turno : " + digiturno.dequeue() + " Caja X");
        }
        System.out.println("la cola nueva");
        for (int numero : digiturno) {
            System.out.println(numero + " ");
        }
        /* IterableQueue <Integer> q = new IterableQueue();
        Scanner datos = new Scanner (System.in);
        do{
       
        System.out.println("agregar, sacar, salir, tamanio, imprimir");
        int opcion = datos.nextInt();
        switch(opcion){
            case 1:
                System.out.println("ingrese el numero a agregar");
                q.enqueue(datos.nextInt());
                break;
            case 2:
                String o = "" +q.dequeue();
                if(o.equals("null"))
                System.out.println("Cola vacia");
                else
                    System.out.println(o);
                break;
            case 3:
                System.exit(0);
                break;
            case 4:
                System.out.println(q.size());
                break;
            case 5:
               // System.out.println(q.salida());
                System.out.println("El contenido de la cola");
            for (int r: q) {
                System.out.println(r);
            }
                break;
        }
        }while(true);*/
 /*    q.enqueue(10);
        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(14);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        
        System.out.println(q.salida());
        System.out.println(q.size());
        
        q.enqueue(20);
        q.enqueue(21);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.salida());
        System.out.println(q.size());*/
        //System.out.println(q.dequeue());
    }
}
