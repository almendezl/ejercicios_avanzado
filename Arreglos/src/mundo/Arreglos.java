/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author Angie Mendez
 */
public class Arreglos {

    private int arr[];

    public Arreglos(int tam) {
        arr = new int[tam];
    }

    public void llenar(int inicio, int fin) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (fin - inicio + 1) + inicio);
        }
    }

    public String imprimir() {
        String salida = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 20 == 0) {
                salida += "\n";
            }
            salida += arr[i] + "\t";
        }
        return salida;
    }

    public int[] getArr() {
        return arr;
    }
}
