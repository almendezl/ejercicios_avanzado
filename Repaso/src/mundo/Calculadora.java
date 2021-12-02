/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

/**
 *
 * @author Angie Mendez
 */
public class Calculadora {
    private double num1;
    private double num2;
    public Calculadora(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double suma(){
        return num1 + num2;
    }
    public double resta(){
        return num1 - num2;
    }
    public double multiplicacion(){
        return num1 * num2;
    }
    public double division(){
        return num1 / num2;
    }
    public double modulo(){
        return num1 % num2;
    }
    public double potencia(){
        return Math.pow(num1, num2);
    }
}
