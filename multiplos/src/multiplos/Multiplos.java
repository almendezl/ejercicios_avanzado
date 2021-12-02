/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplos;

/**
 *
 * @author Angie Mendez
 */
public class Multiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     long suma =0;
        for (int i = 1; i <= 100; i++) {
            suma += Math.pow(i, 2);
        }
        System.out.println(suma);
        //System.out.println("cuadrado ="+ Math.pow(suma, 2));
        }
   
}
