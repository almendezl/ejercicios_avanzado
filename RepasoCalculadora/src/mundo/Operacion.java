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
public class Operacion {
    
private double num1;
private double num2;

    public Operacion(double num1, double num2){
        this.num1= num1;
        this.num2=num2;
    }
    public double suma(){
        return num1+num2;
    }
    public double resta(){
        return num1-num2;
    }
    public double multiplicacion(){
        return num1*num2;
    }
    public double division(){
        return num1/num2;
    }
    public double potencia(){
        return Math.pow(num1,num2);
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
}
    