/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasuma;

import java.util.Stack;

/**
 *
 * @author Angie Mendez
 */
public class PruebaSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numero = "827365827638562836590980598205802385765765757578048102840180481009009809809808043243243242424080980980980984414324242424242424028305820850283058203580238512572176410235288523723";
        String numero2 = "3463445674562325209801345812395078080864664808987979798712412412498098098098098124124858755803253051352035023513850139502835813513";
        Stack<Integer> num = new Stack();
        Stack<Integer> num2 = new Stack();
        Stack<Integer> suma = new Stack();
        for (int i = 0; i < numero.length(); i++) {
            num.push(Integer.parseInt(numero.substring(i, i + 1)));
        }
        for (int i = 0; i < numero2.length(); i++) {
            num2.push(Integer.parseInt(numero2.substring(i, i + 1)));
        }
        for (int i = 0; i < (numero.length() > numero2.length() ? numero.length() : numero2.length()); i++) {
            //revisar cuando ambos tienen tamaños diferentes
            int s = 0;
            if (num.size() > 0 && num2.size() > 0) {
                s = num.pop() + num2.pop();
                if (s >= 10) {
                    if (num.empty() && num2.empty()) {
                        suma.push(s % 10);
                        suma.push(s / 10);
                    } else {
                        if (num.size() > 0) {
                            num.push(num.pop() + s / 10);
                        } else if (num2.size() > 0) {
                            num2.push(num2.pop() + s / 10);
                        }
                        suma.push(s % 10);
                    }
                } else {//si no es mayor a 10
                    suma.push(s);
                }

            } else if (num.size() > 0 && num2.empty()) {

                //do {
                    s = num.pop();
                    if (s >= 10) {
                        
                        if (num.size() > 0) {

                            suma.push(s % 10);
                            num.push(num.pop() + s / 10);
                        } else {
                            
                            suma.push(s % 10);
                            suma.push(s / 10);
                        }

                    } else {
                        suma.push(s);
                    }
               //} while (!num.empty());

            } else if (num2.size() > 0 && num.empty()) {
                s = num2.pop();
                if (s >= 10) {
                    if (num2.size() > 0) {
                        suma.push(s % 10);
                        num2.push(num2.pop() + s / 10);
                    } else {
                        suma.push(s % 10);
                        suma.push(s / 10);
                    }
                } else {
                    suma.push(s);
                }
            }

        }
        String s = "";
        for (int i = suma.size() - 1; i >= 0; i--) {
            if(i%29!=0){
            s += suma.get(i);
            }else{
                s+="\n"+suma.get(i);
            }
        }
        System.out.println("La suma es \n"+s);
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //LA RESTA
        
        
    }

}
