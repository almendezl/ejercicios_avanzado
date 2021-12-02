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

    private double numero1;
    private double numero2;
    private double resultado;

    public Calculadora() {

    }

    public Calculadora(String numero1, String numero2, String operacion) {
        setNumero1(numero1);
        setNumero2(numero2);
        
    }

    public double sumarNumeros() {
        resultado = numero1 + numero2;
        return resultado;
    }

    public double restarNumeros() {
        resultado = numero1 - numero2;
        return resultado;
    }

    public double multiplicarNumeros() {
        resultado = numero1 * numero2;
        return resultado;
    }

    public double dividirNumeros() {
        resultado = numero1 / numero2;
        return resultado;
    }
    
    public double potencia(){
        resultado = Math.pow(numero1, numero2);
        return resultado;
    }
    
    public double modulo(){
        resultado = numero1 % numero2;
        System.out.println(resultado);
        return resultado;
    }
    
    public double raizCuadrada(){
        resultado = Math.sqrt(numero1);
        return resultado;
    }
    public double raizEnesima(){
        resultado = Math.pow(numero1, 1/numero2);
        return resultado;
    }
    
    public double seno(){
        resultado = Math.sin(numero1);
        return resultado;
    }
    
    public double coseno(){
        resultado = Math.cos(numero1);
        return resultado;
    }
    //public double factorial()

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(String numero1) {
        this.numero1 = Double.parseDouble(numero1);
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(String numero2) {
        this.numero2 = Double.parseDouble(numero2);
    }

    public double getResultado() {
        return resultado;
    }

    public double operar(String operador) {
        switch (operador) {
            case "+":
                resultado = sumarNumeros();
                break;
            case "-":
                resultado = restarNumeros();
                break;
            case "*":
                resultado = multiplicarNumeros();
                break;
            case "/":
                resultado = dividirNumeros();
                break;
            case "%":
                resultado = modulo();
                break;
            case "^":
                resultado = potencia();
                break;
            case "sqrt":
                resultado = raizCuadrada();
                break;
            case "sqrt n":
                resultado = raizEnesima();
                break;
            case "sin":
                resultado = seno();
                break;
            case "cos":
                resultado = coseno();
                break;
            default:
            
        }
        return resultado;
    }

}
