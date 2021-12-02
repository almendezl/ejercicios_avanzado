/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazApp;

import controlador.Controlador;
import java.util.InputMismatchException;
import java.util.Scanner;
import mundo.CuadradoMagico;

/**
 *
 * @author Angie Mendez
 */
public class InterfazApp {

    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        controlador.iniciar();
        /*while (true) {
            try {
                Scanner datos = new Scanner(System.in);
                int tamanio;

                System.out.println("Ingrese un numero entero impar:" + "\n \nIngrese 0 para salir");
                tamanio = datos.nextInt();
                if (tamanio == 0) {
                    System.exit(0);
                }

                CuadradoMagico cuadMagico = new CuadradoMagico(tamanio);
                cuadMagico.llenarCuadrado();
                System.out.println(cuadMagico.imprimir());
            } catch (ArrayStoreException | NullPointerException | NumberFormatException | InputMismatchException e) {
                System.out.println("Datos invalidos, intente nuevamente");
            }
        }*/
    }
}
