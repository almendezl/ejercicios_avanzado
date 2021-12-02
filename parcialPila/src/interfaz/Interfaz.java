/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.Scanner;
import stack.FixedCapacityStack;

/**
 *
 * @author Angie Mendez
 */
public class Interfaz {

    public static void main(String[] args) {
        try {
            
            Scanner datos = new Scanner(System.in);
            String operacion = datos.nextLine(); //para tomar toda la cadena con espacios
            String[] arr;
            arr = operacion.split(" ");

            FixedCapacityStack ops = new FixedCapacityStack(arr.length);
            FixedCapacityStack vals = new FixedCapacityStack(arr.length);
            int parA = 0;
            int parB = 0;
            
            for (String s : arr) { //for each porque no usaremos posiciones especificas
                if (s.equals("(")) {
                    parA++;
                } else if (s.equals("+")) {
                    ops.push(s);
                } else if (s.equals("-")) {
                    ops.push(s);
                } else if (s.equals("*")) {
                    ops.push(s);
                } else if (s.equals("/")) {
                    ops.push(s);
                } else if (s.equals("sqrt")) {
                    ops.push(s);
                } else if (s.equals(" ")) {
                    System.out.println("ERROR SINTAXIS");//cuando ingresen dos espacios seguidos
                } else if (s.equals(")")) {
                    parB++;
                    String op = ops.pop();
                    double v = Double.parseDouble(vals.pop());
                    if (op.equals("+")) {
                        v = Double.parseDouble(vals.pop()) + v;
                    } else if (op.equals("-")) {
                        v = Double.parseDouble(vals.pop()) - v;
                    } else if (op.equals("*")) {
                        v = Double.parseDouble(vals.pop()) * v;
                    } else if (op.equals("/")) {
                        v = Double.parseDouble(vals.pop()) / v;
                    } else if (op.equals("sqrt")) {
                        v = Math.sqrt(v);
                    }
                    vals.push(String.valueOf(v));
                } else {
                    vals.push(s);
                }
            }
            if((parA + parB)%2 ==1 || (parA == 0 || parB == 0) || (ops.size() != 0 || vals.size() != 1)){ //cuando no se ingresan parentesis completos de abre y cierra
                System.out.println("ERROR SINTAXIS");
            }
            else{
            System.out.println(vals.pop());
                //System.out.println(vals.size());
                //System.out.println(ops.size());
            }
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) { 
            System.out.println("ERROR SINTAXIS");
        }
        /**
         * El primero es por error si ingresan algo distinto a numeros
         * lanza esta excepcion cuando se ingresa por ejemplo ( 4 +  ) o incompleto porque la pila para hacer la operacion,
         * cuando busca el otro operando llega a una posicion N negativa es decir se sale del arreglo
         */ 
    }
    //no entiendo si debe arreglarse para que funcione por ejemplo si ingreso (1+2+3) o solo que salga error 
}
