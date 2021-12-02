/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamientobinario;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Angie Mendez
 */
public class ArregloBinario {

    private int[] datos;
    private static Random generador = new Random();

    public ArregloBinario(int tamanio) {

        datos = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            datos[i] = 10 + generador.nextInt(90);
        }
        Arrays.sort(datos);
    }

    public int busquedaBinaria(int elementoBusqueda) {
        int inferior = 0;
        int superior = datos.length - 1;
        int medio = (inferior + superior + 1) / 2;
        int ubicacion = -1; //lo que devuelve si no lo encuentra

        do {
         /*   System.out.println(elementosRestantes(inferior, superior));

            // imprime espacios para alineación
            for (int i = 0; i < medio; i++) {
                System.out.print(" ");
            }
            System.out.println("*"); // indica el elemento medio actual
*/
            // si el elemento se encuentra en medio
            if (elementoBusqueda == datos[medio]) {
                ubicacion = medio; // la ubicación es el elemento medio actual
            } // el elemento medio es demasiado alto
            else if (elementoBusqueda < datos[medio]) {
                superior = medio - 1; // elimina la mitad superior
            } else // el elemento medio es demasiado bajo
            {
                inferior = medio + 1; // elimina la mitad inferior
            }
            medio = (inferior + superior + 1) / 2;
        } while ((inferior <= superior) && (ubicacion == -1));
        return ubicacion;
    }

    public String elementosRestantes(int inferior, int superior) {
        StringBuilder temporal = new StringBuilder();
        for (int i = 0; i < inferior; i++) {
            temporal.append("    ");
        }
        for (int i = inferior; i < superior; i++) {
            temporal.append(datos[i] + " ");
        }
        temporal.append("\n");
        return temporal.toString();
    }

    public String toString() {
        return elementosRestantes(0, datos.length - 1);
    }
}
