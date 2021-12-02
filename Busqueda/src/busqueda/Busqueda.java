/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda;

/**
 *
 * @author Angie Mendez
 */
public class Busqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i+1;
        }
        System.out.println(busquedaB(5, arr));
        System.out.println(buscarBRecur(5, arr, 0, arr.length - 1));
        System.out.println(busquedaLRecur(arr, 5, 0));
    }

    public static int buscarBRecur(int dato, int arr[], int iz, int der) {
        int medio = (iz + der) / 2;
        if (dato == arr[medio]) {
            return medio;
        } else if (iz <= der) {
            if (dato < arr[medio]) {
                return buscarBRecur(dato, arr, iz, medio - 1); 
                
            } else {
                return buscarBRecur(dato, arr, medio + 1, der);
            }
        }
        return -1;
    }

    public static int busquedaB(int dato, int arreglo[]) {
       return buscar(arreglo, dato, 0, arreglo.length-1);
    }
    private static int buscar(int arreglo[], int dato, int ini, int fin){
        int mid;
        do{
            mid = (ini +fin)/2;
            if(arreglo[mid] == dato){
                return mid;
            }else if(arreglo[mid] > dato){
                fin = mid - 1;
            }else{
                ini = mid+1;
            }
        }while(ini <= fin);
        return -1;
    }
    public static int busquedaLineal(int arr[], int dato){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == dato){
                return i;
            }
        }
        return -1;
    }
    public static int busquedaLRecur(int arr[], int dato, int pos){
        if(pos <arr.length){
            if(arr[pos] == dato)
                return pos;
            else
                return busquedaLRecur(arr, dato, pos+1);
        }
        return -1;
    }
}
