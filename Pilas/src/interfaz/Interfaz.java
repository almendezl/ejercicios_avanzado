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
        Scanner datos = new Scanner(System.in);
        String operacion = datos.nextLine();
        String[] arr;
        arr = operacion.split(" ");
        
        FixedCapacityStack ops = new FixedCapacityStack(arr.length);
        FixedCapacityStack vals = new FixedCapacityStack(arr.length);

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
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
        System.out.println(vals.pop());
    }
}
