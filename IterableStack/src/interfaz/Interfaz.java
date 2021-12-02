/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.Scanner;
import stack.IterableStack;

/**
 *
 * @author Angie Mendez
 */
public class Interfaz {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        String operacion = datos.nextLine();
        String[] arr;
        arr = operacion.split(" ");
        
        
        IterableStack<String> ops = new IterableStack();
        IterableStack<Double> vals = new IterableStack();

        for (String s : arr) { // si fuera el FixedCapacityStack no se podria hacer este for, porque no tiene agragado el iterador 
            System.out.println("El contenido de ops");
            for (String operador: ops) {
                System.out.println(operador);
            }
            System.out.println("El contenido de vals");
            for (Double v: vals) {
                System.out.println(v);
            }
            if (s.equals("(")) {

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
            } else if (s.equals(")")) {
                
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) {
                    v = vals.pop() + v;
                } else if (op.equals("-")) {
                    v = vals.pop() - v;
                } else if (op.equals("*")) {
                    v = vals.pop() * v;
                } else if (op.equals("/")) {
                    v = vals.pop() / v;
                } else if (op.equals("sqrt")) {
                    v = Math.sqrt(v);
                }
                vals.push(v);
            } else {
                vals.push(Double.parseDouble(s));
            }
        }
        System.out.println(vals.pop());
    }
}
