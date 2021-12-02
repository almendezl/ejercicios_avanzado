/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientobinario;

import java.util.Scanner;

/**
 *
 * @author Angie Mendez
 */
public class PruebaBusquedaBinaria {

    public static void main(String args[]) {
        // crea un objeto Scanner para recibir datos de entrada
        Scanner entrada = new Scanner(System.in);

        int enteroABuscar; // clave de búsqueda
        int posicion; // ubicación de la clave de búsqueda en el arreglo

        // crea un arreglo y lo muestra en pantalla
        ArregloBinario arregloBusqueda = new ArregloBinario(15);
        System.out.println(arregloBusqueda);

        // obtiene la entrada del usuario
        System.out.print(
                "Escriba un valor entero (-1 para salir): ");
        enteroABuscar = entrada.nextInt(); // lee un entero del usuario
        System.out.println();

        // recibe un entero como entrada en forma repetida; -1 termina el programa
        while (enteroABuscar != -1) {
            // usa la búsqueda binaria para tratar de encontrar el entero
            posicion = arregloBusqueda.busquedaBinaria(enteroABuscar);

            // el valor de retorno -1 indica que no se encontró el entero
            if (posicion == -1) {
                System.out.println("El entero " + enteroABuscar
                        + " no se encontro.\n");
            } else {
                System.out.println("El entero " + enteroABuscar
                        + " se encontro en la posicion " + posicion + ".\n");
            }

            // obtiene entrada del usuario
            System.out.print(
                    "Escriba un valor entero (-1 para salir): ");
            enteroABuscar = entrada.nextInt(); // lee un entero del usuario
            System.out.println();
        } // fin de while
    } // fin de main
}
