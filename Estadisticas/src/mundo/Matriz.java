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
public class Matriz {

    private final int arreglo[];

    public Matriz(int tam) {
        arreglo = new int[tam];
    }

    public void llenar(int inicio, int fin) {
        int mover;
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * ((fin - inicio + 1) + inicio));
            for (int posicion = 0; posicion < i; posicion++) {
                if (arreglo[posicion] > arreglo[i]) {
                    mover = arreglo[posicion];
                    arreglo[posicion] = arreglo[i];
                    arreglo[i] = mover;
                }
            }
        }
    }

    public void llenar(int inicio, int fin, boolean ascendente) {
        //verdadero ascendente falso descendente 
        int aux;
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * ((fin - inicio + 1) + inicio));
            if (i > 0) {
                
                for (int j = i; j > 0; j--) {
                    if(ascendente){
                    //aqui queda ascendente con el < y con el > queda descendente
                    if (arreglo[j] < arreglo[j - 1]) {
                        aux = arreglo[j];
                        arreglo[j] = arreglo[j - 1];
                        arreglo[j - 1] = aux;
                    }
                    else
                        break;//porque estan siendo ordenados entonces no necesite comparar
                }
                    else{
                        if (arreglo[j] > arreglo[j - 1]) {
                        aux = arreglo[j];
                        arreglo[j] = arreglo[j - 1];
                        arreglo[j - 1] = aux;
                    }
                    else
                        break;//porque estan siendo ordenados entonces no necesite comparar
                }
                    }
                }
                
            }
        }

    public int buscar(int dato, int tam) {
        int izquierda = tam;
        int derecha = arreglo.length - 1;
        int medio = (izquierda + derecha + 1) / 2;
        int ubicacion = -1; //lo que devuelve si no lo encuentra
        do {
            if (dato == arreglo[medio]) {
                ubicacion = medio; // es porque el dato es la mitad
            } else if (dato < arreglo[medio]) {
                derecha = medio - 1; // cambia de mitad
            } else {
                izquierda = medio + 1;
            }
            medio = (izquierda + derecha + 1) / 2;
        } while ((izquierda <= derecha) && (ubicacion == -1));
        return ubicacion;
    }

    public String imprimir() {
        String impresion = "";
        for (int i = 0; i < arreglo.length; i++) {
            impresion += arreglo[i] + "\t";
            if ((i + 1) % 20 == 0) {
                impresion += "\n";
            }
        }
        return impresion;
    }

    public int[] getArreglo() {
        return arreglo;
    }
}
