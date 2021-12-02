/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazApp;

import javax.swing.JOptionPane;
import mundo.CuadradoMagico;

/**
 *
 * @author Angie Mendez
 */
public class InterfazApp {

    public static void main(String[] args) {
        while (true) {
            try {

                CuadradoMagico cuadMag;
                String comprobar;
                int tamanio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño del cuadrado"
                        + " \nRecuerde que este debe ser un numero entero: " + "\n \nPara salir ingrese '0'", "Ingreso de datos", JOptionPane.INFORMATION_MESSAGE));
                if (tamanio == 0) {
                    break;
                }
                cuadMag = new CuadradoMagico(tamanio);
                //envia los datos introducidos por el usuario a la clase Cuadrado magico,donde se verificaran
                cuadMag.setCuad(ingresoDatos(Math.abs(tamanio)));
                if (cuadMag.comprobar()) {
                    comprobar = "SI es un cuadrado magico!!!";
                } else {
                    comprobar = "NO es un cuadrado magico!!!";
                }

                JOptionPane.showMessageDialog(null, cuadMag.imprimir() + "\n" + comprobar, "Salida de datos", JOptionPane.INFORMATION_MESSAGE);

            } catch (ArrayStoreException | NullPointerException | NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "Datos invalidos, intente nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static int[][] ingresoDatos(int tamanio) {
        int datos[][] = new int[tamanio][tamanio];
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                datos[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Dato:" + " Fila " + (i + 1) + " Columna " + (j + 1),
                        "Ingreso de datos", JOptionPane.DEFAULT_OPTION));
            }
        }
        return datos;
    }
}
