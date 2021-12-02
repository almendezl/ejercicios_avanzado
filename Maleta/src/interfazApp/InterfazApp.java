/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazApp;

import bag.Bag;

/**
 *
 * @author Angie Mendez
 */
public class InterfazApp {
    public static void main(String[] args) {
        Bag<Integer> b = new Bag();
        
        for (int i = 0; i < 10; i++) {
            b.add(i+1);
        }
        for(int i: b){
            System.out.println(i);
        }
    }
}
