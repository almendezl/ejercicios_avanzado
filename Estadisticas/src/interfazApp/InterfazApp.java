/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazApp;

import java.util.Scanner;
import mundo.Conteos;
import mundo.Matriz;

/**
 *
 * @author Angie Mendez
 */
public class InterfazApp {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Matriz arreglos = new Matriz(500);
        //arreglos.llenar(1, 500);
        arreglos.llenar(1, 500, false);
        System.out.println(arreglos.imprimir());
        Conteos conteo = new Conteos();
        int menor, mayor;
        menor = conteo.min(arreglos.getArreglo());
        mayor = conteo.max(arreglos.getArreglo());
        System.out.println("El maximo esta en posicion : " + (mayor + 1) + " Y es el numero : " + arreglos.getArreglo()[mayor]);
        System.out.println("El minimo esta en posicion : " + (menor + 1) + " Y es el numero : " + arreglos.getArreglo()[menor]);
        System.out.println("El promedio es : " + conteo.promedio(arreglos.getArreglo()));
        System.out.println("La moda es :" + conteo.moda(arreglos.getArreglo()));
        System.out.println("Ingrese el dato a buscar: ");
        int clave = datos.nextInt();
        int encontrado = conteo.buscar(arreglos.getArreglo(), clave);
        System.out.println(encontrado != -1 ? "El dato fue encontrado en la posicion " + encontrado : "Dato no encontrado");
        conteo.eliminarRepetidos(arreglos.getArreglo());
        System.out.println(arreglos.imprimir());
        //System.out.println(conteo.histograma(arreglos.getArreglo
        /*
        System.out.println("Ingrese el dato a buscar:");
        Scanner datos = new Scanner(System.in);
        int dato = arreglos.buscar(datos.nextInt());
        if (dato != -1) {
            System.out.println("La posicion del dato es: " + dato);
        } else {
            System.out.println("Dato no encontrado");
        }*/
        //arreglos.eliminarRepetidos();
        //System.out.println(arreglos.imprimir());

    }

}
