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
public class Conteos {

    public int max(int arreglo[]) {
        int max = 0;
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > arreglo[max]) {
                max = i;
            }
        }
        return max;
    }

    public int min(int arreglo[]) {
        int min = 0;
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < arreglo[min]) {
                min = i;
            }
        }
        return min;
    }
    public double promedio (int arreglo[]){
        double promedio = 0;
        for (int i = 0; i < arreglo.length; i++) {
            promedio += arreglo[i];
        }
        return promedio/arreglo.length;
    }
    public int moda(int arreglo[]) {
        int min = arreglo[min(arreglo)];
        int max = arreglo[max(arreglo)];
        int contador[] = new int[max - min + 1];
        for (int dato : contador) {
            contador[dato] = 0;
        }
        for (int dato : arreglo) {
            contador[dato - min]++;
        }
        return max(contador) + min;
    }
public int buscar(int arreglo[], int clave){
    int i=0;
    do{
        if(arreglo[i] == clave)
            return i;
        i++;
        
    }while(i< arreglo.length);
    return -1;
}

public void eliminarRepetidos(int arreglo[]){
    int contador = 0;
    int i=0;
    while (i < arreglo.length-1) {
        boolean repetido = false;
        for (int j =i+ 1; j < arreglo.length; j++) {
            
            if(arreglo[i] == arreglo[j]){
                for (int k = j; k < arreglo.length-1; k++) {
                    arreglo[k] = arreglo[k+1];
                }
                arreglo[arreglo.length-1] = --contador;//primero decremento luego asigno
                repetido = true;
            }
            if(!repetido)
                i++;    
        }
    }
}
    public String histograma(int arreglo[]) {
        String salida = "";
        int min = arreglo[min(arreglo)];
        int max = arreglo[max(arreglo)];
        int contador[] = new int[max - min + 1];
        for (int dato : contador) {
            contador[dato] = 0;
        }
        for (int dato : arreglo) {
            contador[dato - min]++;
        }
        for (int i = 0; i < contador.length; i++) {
            salida += "\n" + (i + min) + " " + (contador[i]) + " -> ";
            for (int j = 0; j < contador[i]; j++) {
                salida += "*";
            }
        }
        return salida;
    }

}
