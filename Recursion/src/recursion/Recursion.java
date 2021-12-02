package recursion;

import java.util.Scanner;

/**
 *
 * @author Angie Mendez
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Euclides
        /*Scanner datos = new Scanner(System.in);
       int a = datos.nextInt();
        int b = datos.nextInt();
        System.out.println(mcd(a, b));
        System.out.println(mcdR(a, b));*/
        //String a = "radar";
        //System.out.println(palindromoR(a, 0,5 ));
        //multiplicacion
        /* Scanner datos = new Scanner (System.in);
        int a = datos.nextInt();
        int b = datos.nextInt();
        System.out.println(multR(a,b));*/
        //potencia
        /*System.out.println(potencia(5,0));
        System.out.println(potenciaR(5,2));*/
        //IMPRIMIR MATRIZ
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(imprimirArray(array));
        imprimirArrayR(array, 0);
        System.out.println(imprimirArrayInverso(array));
        imprimirArrayInversoR(array, array.length - 1);
        int var = buscarArray(array, 7, 0);
        if( var == -1){
        System.out.println("\nDato no encontrado: ");
        }else{
            System.out.println("\nDato encontrado en la posicion: "+ var);
        }
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
        imprimirMatriz(matriz, 0,0);
        mostrarAlfabeto('A');
        String s = "356453";
        System.out.println(palindromoR(s, 0, s.length()-1));
        ulamR(26);
        System.out.println(binarioDecR("10000001", 0, 0));
        
        System.out.println(decBinR(129, ""));
        
        System.out.println(fibo(6));
        System.out.println(mcd(10, 0));
    }
    public static long fibo(int n){
        if(n==0){
            return 0;
        }if(n==1){
            return 1;
        }else{
            return fibo(n-1)+ fibo(n-2);
        }
    }
    public static double  binarioDecR(String binario, int n, int val){
        if(n < binario.length()){ //inicia con n = 0 y aumenta hasta el tamaño menos 1 
            val += (Integer.parseInt(binario.substring(n, n+1))*Math.pow(2, binario.length()-(n+1)));
            return  binarioDecR(binario, n+1, val);
        }else{
            return val;
        }
    }
    public static String decBinR(int numero, String salida){
        if(numero != 0){
            String aux = salida; //para que se muestren alreves esta es una var auxiliar para concatenar 
            salida =  numero %2 +" "+ aux;
            return decBinR(numero/2, salida);
        }else{
            
            return salida;
        }
    }
    
    public static void ulamR(int numero){
        if(numero%2 == 0){
            System.out.print(numero + " ");
             ulamR(numero/2);
        }
        if(numero % 2 == 1 && numero != 1){
            System.out.print(numero+" ");
            ulamR(numero*3+1);
        }
        if(numero ==1)
            System.out.println(numero);
        }
            
    
    public static void mostrarAlfabeto(char val){
        char aux = val;
        if(aux < 'Z'){
            System.out.print(aux+ " ");
            aux++;
            mostrarAlfabeto(aux);
        }else{
            System.out.println('Z');
        }
    }
    public static void imprimirMatriz(int matriz[][], int filas, int columnas){
        if(filas <= matriz.length-1){
            if( columnas< matriz[filas].length-1){
                System.out.print(matriz[filas][columnas] +" ");
                imprimirMatriz(matriz, filas, columnas+1);
            }else if(columnas == matriz[filas].length-1){
                System.out.println(matriz[filas][columnas]);
                columnas = 0;
                imprimirMatriz(matriz, filas+1,columnas);
            }
        }
    }
public static int buscarArray(int array[], int buscar, int indice){//devuelve la posicion
    if(indice<array.length){
        if(array[indice] == buscar){
            return indice;
        }else{
            return buscarArray(array, buscar, indice+1);
        }
    }else
        return -1;//si no esta el dato retorna -1
}
    public static String imprimirArray(int matriz[]) {
        String salida = "";
        for (int i = 0; i < matriz.length; i++) {
            salida += matriz[i] + " ";
        }
        return salida;
    }

    public static String imprimirArrayInverso(int matriz[]) {
        String salida = "";
        for (int i = matriz.length - 1; i >= 0; i--) {
            salida += matriz[i] + " ";
        }
        return salida;
    }

    public static void imprimirArrayInversoR(int matriz[], int i) {
        System.out.print(matriz[i] + " ");
        if (i > 0) {
            imprimirArrayInversoR(matriz, i - 1);
        }
    }

    public static void imprimirArrayR(int matriz[], int i) {
        if (i != matriz.length - 1) {
            System.out.print(matriz[i] + " ");
            imprimirArrayR(matriz, i + 1);
        } else {
            System.out.println(matriz[i]);
        }
    }

    public static int potencia(int a, int b) {
        int pot = 1;
        for (int i = 0; i < b; i++) {
            pot *= a;
        }
        return pot;
    }

    public static int potenciaR(int a, int b) {
        if (b > 0) {
            return a * potenciaR(a, (b - 1));
        } else {
            return 1;
        }
    }

    public static int multiplicacion(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < b; i++) {
            resultado += a;
        }
        return resultado;
    }

    public static int multR(int a, int b) {
        if (a > 0 && b > 0) {
            return a + multR((a), (b - 1));
        } else {
            return 0;
        }
    }

    public static int mcd(int a, int b) {
        int mod;
        if (b == 0) {
            return -1;
        } else if (a == 0) {
            return 0;
        } else {
            while (b > 0) {
                mod = a % b;
                a = b;
                b = mod;
            }
            return a;
        }
    }

    public static int mcdR(int a, int b) {
        if (a > 0 && b > 0) {
            return mcdR((b), (a % b));
        } else {
            return a;
        }
    }

    public static boolean palindromoR(String palabra, int lo, int hi) {
        if (lo >= hi) {
            return true;
        } else {
            return palabra.charAt(lo) == palabra.charAt(hi) && palindromoR(palabra, ++lo, --hi);// no se puede poner ++ o -- toca mas 1 o menos 1 etc
        }

    }
}
