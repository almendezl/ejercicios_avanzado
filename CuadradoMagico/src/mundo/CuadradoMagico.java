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

    private final int arrSumas[];
    private int[][] cuad;

    public CuadradoMagico(int tamanio) {
        arrSumas = new int[2 * Math.abs(tamanio) + 2] ;
    }

    public String imprimir() {
        String salida = "";
        for (int i = 0; i < cuad.length; i++) {
            for (int j = 0; j < cuad[i].length; j++) {
                salida += cuad[i][j] + " \t ";
            }
            salida += "\n";
        }
        return salida;
    }

    public void sumaFilas() {
        for (int i = 0; i < cuad.length; i++) {
            int acumulador = 0;
            for (int j = 0; j < cuad[i].length; j++) {
                acumulador += cuad[i][j];
            }
            arrSumas[i] = acumulador;
        }
    }

    public void sumaColumnas() {
        for (int i = 0; i < cuad.length; i++) {
            int acumulador = 0;
            for (int j = 0; j < cuad[i].length; j++) {
                acumulador += cuad[j][i];
            }
            arrSumas[i + cuad.length] = acumulador;
        }
    }

    public void sumaDiagPrin() {
        int acumulador = 0;
        for (int i = 0; i < cuad.length; i++) {
            for (int j = 0; j < cuad[i].length; j++) {
                if (i == j) {
                    acumulador += cuad[i][j];
                }
            }
        }
        arrSumas[arrSumas.length - 2] = acumulador;
    }

    public void sumaDiagSec() {
        int acumulador = 0;
        for (int i = 0; i < cuad.length; i++) {
            for (int j = 0; j < cuad[i].length; j++) {
                if ((i + j) == cuad.length - 1) {
                    acumulador += cuad[i][j];
                }
            }
        }
        arrSumas[arrSumas.length-1] = acumulador;
    }

    public boolean comprobar() {
        sumaFilas();
        sumaColumnas();
        sumaDiagPrin();
        sumaDiagSec();
        int comprobar = 0;
        for (int i = 0; i < arrSumas.length; i++) {
            if (arrSumas[0] == arrSumas[i]) {
                comprobar++;
            }
        }
        return comprobar == cuad.length * 2 + 2;
    }

    public void setCuad(int[][] cuad) {
        this.cuad = new int[cuad.length][cuad.length];
        for (int i = 0; i < cuad.length; i++) {
            for (int j = 0; j < cuad[i].length; j++) {
                this.cuad[i][j] = cuad[i][j] < 0 ? Math.abs(cuad[i][j]) : cuad[i][j];
            }
        }
    }

    public int[][] getCuad() {
        return cuad;
    }

    public int[] getArrSumas() {
        return arrSumas;
    }

}
