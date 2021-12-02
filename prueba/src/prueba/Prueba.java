/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Angie Mendez
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner datos = new Scanner(System.in);
   Stack<Integer> stack = new Stack<Integer>();
  stack.add(10);
  stack.add(20);
  stack.add(30);
  stack.push(25);
  stack.pop();
        System.out.println(stack.toString());
  
  for(int i: stack){
      System.out.println(i);
  }
    }


}
