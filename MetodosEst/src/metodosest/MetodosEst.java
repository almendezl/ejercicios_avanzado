/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosest;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Angie Mendez
 */
public class MetodosEst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[] = new int[500];
        llenar( 0, 90, matriz);
        System.out.println(imprimir(matriz));
        System.out.println("El maximo valor es: "+ maximo(matriz));
        System.out.println("El minimo valor es: "+ minimo(matriz));
       System.out.println("La moda es: "+ moda(matriz));
        System.out.println("El promedio es: "+ promedio(matriz));
       
        
       //Arrays.sort(matriz);
        //System.out.println(imprimir(matriz));

    }

    public static void llenar(int inicio, int fin,int matriz[]) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = (int)(Math.random()*(fin - inicio+1)+inicio);
        }
            
            //int aux = 0;
            //int nuevoVal = (int)(Math.random()*(fin - inicio+1)+inicio);
            
            //matriz[i] = nuevoVal;
            //i++;
     
        
        
        }
        
        
    
    public static int maximo(int matriz []){
        int maximo = matriz[0];
        for (int i = 0; i < matriz.length; i++) {
            if(matriz[i] > maximo)
                maximo = matriz[i];
            
        }
        return maximo;
    }
    public static int minimo(int matriz []){
        int minimo = matriz[0];
        for (int i = 0; i < matriz.length; i++) {
            if(matriz[i] < minimo)
                minimo = matriz[i];
            
        }
        return minimo;
    }
    public static String moda(int matriz[]){
        int contador [] = new int[10];
        String salida = "";
        
        for (int i = 0; i < matriz.length; i++) {
            contador [matriz[i]]++;
        }
        salida += buscar(contador,maximo(contador));
        for (int i = 0; i < contador.length; i++) {
            salida += "\n" + i +" ";
            for (int j = 0; j < contador[i]; j++) {
                salida += "* ";
            }
        }
        return salida;
    }
    public static double promedio(int matriz[]){
        double acumulador = 0;
        for (int i = 0; i < matriz.length; i++) {
            acumulador += matriz[i];
        }
        return acumulador / matriz.length;
    }
    public static String buscar(int contador[], int num){
        String posicion = "";
        for (int i = 0; i < contador.length; i++) {
            if(contador[i] == num)
            posicion += i + " ";
            
        }
        return posicion;
    }

    public static String imprimir(int matriz[]) {
        String salida = "";
        for (int i = 0; i < matriz.length; i++) {

            if (i % 20 == 0) {
                salida += "\n";
            } else {
                salida += matriz[i] + "\t";
            }
        }
        return salida;
    }
}
