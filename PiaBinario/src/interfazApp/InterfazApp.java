/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazApp;

import java.util.InputMismatchException;
import java.util.Scanner;
import listaPila.Stack;

/**
 *
 * @author Angie Mendez
 */
public class InterfazApp {

    public static void main(String[] args) {
        while (true) {
            try {

                Stack<Integer> binario = new Stack();
                Scanner datos = new Scanner(System.in);
                System.out.println("Ingrese el dato, \nIngrese una letra para salir ");
                int numero = Math.abs(datos.nextInt());
                while (numero > 0) {

                    binario.push(numero % 2);
                    numero = numero / 2;
                }
                
                for (int i : binario) {
                    System.out.print(i + "");
                }
                System.out.println("");
                
            } catch ( InputMismatchException n) {
                System.exit(0);
            } catch (NumberFormatException e) {
                System.out.println("Error, intente de nuevo");
            }
        }
    }
}
