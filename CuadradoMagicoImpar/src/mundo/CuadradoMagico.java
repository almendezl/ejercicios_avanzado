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
public class CuadradoMagico {

    private int numeros[];
    private int[][] cuad;

    public CuadradoMagico(int tamanio) {
        //sin importar si el usuario ingresa un numero negativo
        cuad = tamanio % 2 != 1 ? null : new int[Math.abs(tamanio)][Math.abs(tamanio)];
        llenarMatriz();
        numeros = new int[tamanio * tamanio];
        llenarNumeros();

    }

    public int[][] getCuad() {
        return cuad;
    }

    private void llenarMatriz() {
        for (int i = 0; i < cuad.length; i++) {
            for (int j = 0; j < cuad[i].length; j++) {
                cuad[i][j] = 0;
            }
        }
    }

    private void llenarNumeros() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
    }

    public String imprimir() {
        String salida = "";
        for (int i = 0; i < cuad.length; i++) {
            for (int j = 0; j < cuad[i].length; j++) {
                salida += cuad[i][j] + "\t";
            }
            salida += "\n";
        }
        return salida;
    }

    public void llenarCuadrado() {
        int i = 0;
        int j = cuad.length / 2;
        int aux = 0;
        cuad[i][j] = numeros[aux];
        while (aux < (cuad.length * cuad.length - 1)) {
            i--;
            j++;
            aux++;

            if (i < 0 && j >= cuad.length) {
                i = cuad.length - 1;
                j = 0;
                if (comprobarVacio(i, j)) {
                    cuad[i][j] = numeros[aux];

                } else {
                    i = 1;
                    j = cuad.length - 1;
                    cuad[i][j] = numeros[aux];
                }
            } else if (i < 0) {
                i = cuad.length - 1;

                cuad[i][j] = numeros[aux];

            } else if (j >= cuad.length) {
                j = 0;

                cuad[i][j] = numeros[aux];

            } else if (comprobarVacio(i, j)) {
                cuad[i][j] = numeros[aux];

            } else {
                i += 2;
                j--;
                cuad[i][j] = numeros[aux];

            }
        }
    }

    private boolean comprobarVacio(int i, int j) {
        return cuad[i][j] == 0;
    }
}
