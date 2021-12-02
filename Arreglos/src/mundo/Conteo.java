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
public class Conteo {

    public int max(int arr[]) {
        //me retorna la posicion y no el valor maximo
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public int min(int arr[]) {
        //me retorna la posicion y no el valor minimo
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }

    public double media(int arr[]) {
        double promedio = 0;
        for (int dato : arr) {
            promedio = dato;
        }
        promedio /= arr.length;
        return promedio;
    }

    public int moda(int arr[]) {
        int min, max;
        min = arr[min(arr)];
        max = arr[max(arr)];

        int contador[] = new int[(max - min + 1)];
        for (int i = 0; i < contador.length; i++) {
            contador[i] = 0;
        }
        for (int dato : arr) {
            contador[dato - min]++;
        }
        return max(contador) + min;
    }

    public String histograma(int arr[]) {
        int min, max;
        min = arr[min(arr)];
        max = arr[max(arr)];
        String grafico = "";

        int contador[] = new int[(max - min + 1)];
        for (int i = 0; i < contador.length; i++) {
            contador[i] = 0;
        }
        for (int dato : arr) {
            contador[dato - min]++;
        }
        for (int i = 0; i < contador.length; i++) {
            grafico += "\n" + (i + min) + "-> ";
            for (int j = 0; j < contador[i]; j++) {
                grafico += "*";
            }
        }
        return grafico;
    }

}
