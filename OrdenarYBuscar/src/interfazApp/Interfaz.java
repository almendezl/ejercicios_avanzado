/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazApp;

import busqueda.Buscar;
import java.util.Scanner;
import libro.Libro;
import search.ArbolBinarioBusquedaST;
import sort.HeapSort;
import sort.Insertion;
import sort.MergueBU;
import sort.MergueSort;
import sort.QuickSort;
import sort.Shell;
import sort.Stopwatch;

/**
 *
 * @author Angie Mendez
 */
public class Interfaz {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese el tamaño");
        int tamanio =datos.nextInt();
       /* Libro biblioteca [] =  new Libro[tamanio];
        Libro biblioteca2 [];
        Libro biblioteca3 [];
        Libro biblioteca4 [];
        Libro biblioteca5 [];
        Libro biblioteca6 [];
       for (int i = 0; i< biblioteca.length ; i++) {
            biblioteca[i] = new Libro(llenar(), llenar(), llenar(), llenar());
            
        }*/
       //biblioteca2 = biblioteca;
            //biblioteca3 = biblioteca;
            //biblioteca4 =biblioteca;
            //biblioteca5 = biblioteca; 
            //biblioteca6 = biblioteca; 
            Integer biblioteca[] = new Integer[tamanio];
            ArbolBinarioBusquedaST< Integer, Integer>arbol = new ArbolBinarioBusquedaST();
            for (int i = 0; i < biblioteca.length; i++) {
            biblioteca[i]= (int)(Math.random()*50);
                System.out.print(biblioteca[i]+" ");
        }
            //Integer biblioteca2 []= biblioteca;
            Stopwatch time1 = new Stopwatch();
            QuickSort.sort(biblioteca);
             for (int i = 0; i < biblioteca.length; i++) {
                System.out.print(biblioteca[i]+" ");
        }
            int r= Buscar.busquedaB(biblioteca, 10);
           double t1 = time1.elapsedTime();
           System.out.println("posicion del valor buscado: "+r+" tiempo: "+t1);
           Stopwatch time2 = new Stopwatch();
           for (int i = 0; i < biblioteca.length; i++) {
            arbol.put(biblioteca[i], biblioteca[i]);
        }
            Integer r2 = arbol.get(10);
            double t2 = time2.elapsedTime();
           System.out.println("valor buscado: "+r2+" tiempo: "+t2); 
            
            
        /*System.out.println("Sin ordenar");
        for (Libro biblioteca1 : biblioteca) {
            System.out.println(biblioteca1);
        }*/
        /*System.out.println("*************************************Ordenar con Mergue**************************************");
        Stopwatch time1 = new Stopwatch();
        MergueSort.sort(biblioteca);
        double t1 = time1.elapsedTime();
        System.out.println("Tiempo de ordenamiento: "+t1);
       /* for (Libro biblioteca1 : biblioteca) {
            System.out.println(biblioteca1);
        }*/
        /*for (Libro biblioteca1 : biblioteca) {
        System.out.println(biblioteca1);
        }*/
       /* System.out.println("*************************************Ordenar con Quick**************************************");
        Stopwatch time5 = new Stopwatch();
        Insertion.sort(biblioteca5);
        double t5 = time5.elapsedTime();
        System.out.println("Tiempo de ordenamiento: "+t5);
        System.out.println("*************************************Ordenar con HeapSort**************************************");
        Stopwatch time6 = new Stopwatch();
        HeapSort.sort(biblioteca6);
        double t6 = time6.elapsedTime();
        for (Libro bibliotecaa : biblioteca6) {
        System.out.println(bibliotecaa);
        }
        System.out.println("Tiempo de ordenamiento: "+t6);
        
        
       /*System.out.println("*************************************Ordenar con MergueBU**************************************");
        Stopwatch time2 = new Stopwatch();
        MergueBU.sort(biblioteca2);
        double t2 = time2.elapsedTime();
        System.out.println("Tiempo de ordenamiento: "+t2);*/
       /* System.out.println("*************************************Ordenar con Shell**************************************");
        Stopwatch time3 = new Stopwatch();
        Shell.sort(biblioteca3);
        double t3 = time3.elapsedTime();
        System.out.println("Tiempo de ordenamiento: "+t3);
        /*System.out.println("*************************************Ordenar con Insercion**************************************");
        Stopwatch time4 = new Stopwatch();
        Insertion.sort(biblioteca4);
        double t4 = time4.elapsedTime();
        System.out.println("Tiempo de ordenamiento: "+t4);*/
       
        
    }
public static String llenar(){
    String salida = "";
    String basura = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum luctus at ante vitae luctus. Vestibulum id fringilla orci, quis efficitur massa. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Cras non tincidunt dui, sit amet imperdiet augue. Nullam erat magna, molestie at orci vitae, convallis semper ex. Integer mattis pretium ex eu ornare. Sed eget ante ac lorem ullamcorper accumsan. Aliquam sagittis tortor vel lacus ultricies, vel aliquam mi bibendum. Sed nibh purus, pretium ut volutpat at, sagittis a dolor. Nullam dapibus est at eros hendrerit, convallis fringilla leo commodo. Morbi quis dui quis nulla. ";
    String arr[] = basura.split(" ");
    salida += arr[(int)(Math.random()*arr.length-1)];
    return salida.toUpperCase();
}
    
}
