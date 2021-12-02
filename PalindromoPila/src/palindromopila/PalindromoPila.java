/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromopila;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Angie Mendez
 */
public class PalindromoPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        String palabra = datos.next();
	palabra= palabra.replace(" ", "")
        Stack <Character> pal = new Stack();
        
        for (int i = 0; i < palabra.length(); i++) {
            pal.push(palabra.charAt(i));
        }
        String aux = "";
        for (int i = 0; i < palabra.length(); i++) {
            aux += pal.pop();
        }
        if(palabra.equals(aux)){
            System.out.println("Si!!, Es palindromo");
        }
        else
            System.out.println("No!!, No es palindromo");
        
        
    }
    
}
