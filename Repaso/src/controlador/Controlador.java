/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.InputMismatchException;
import java.util.Scanner;
import mundo.Calculadora;

/**
 *
 * @author Angie Mendez
 */
public class Controlador {

    private Calculadora cal;
    
    public Controlador() {
        
    }

    public void iniciar() {
        try {
            do {
                System.out.println("Ingrese el primer numero o una letra para salir");
                Scanner datos = new Scanner(System.in);
                double num1 = datos.nextDouble();
                System.out.println("Ingrese el segundo numero");
                double num2 = datos.nextDouble();
                cal = new Calculadora(num1, num2);
                do {
                    System.out.println("Ingrese la operacion que desea hacer: \n+.Suma \n-.Resta \n*.Multiplicacion \n/.Division \n%.Modulo \n^.Potencia\nS.Salir");
                    String oper = datos.next();
                    if (!oper.equalsIgnoreCase("s")) {
                        operacion(oper);
                    } else {
                        break;
                    }
                } while (true);
            } while (true);
        } catch (InputMismatchException i) {
            System.exit(0);
        }
    }

    private void operacion(String oper) {
        switch (oper) {
            case "+":
                System.out.println(cal.suma());
                break;
            case "-":
                System.out.println(cal.resta());
                break;
            case "*":
                System.out.println(cal.multiplicacion());
                break;
            case "/":
                System.out.println(cal.division());
                break;
            case "%":
                System.out.println(cal.modulo());
                break;
            case "^":
                System.out.println(cal.potencia());
                break;            
            default:                
                System.out.println("Error de operacion");
                break;
        }
    }
}
