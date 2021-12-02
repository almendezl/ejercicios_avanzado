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
public  class Buscar {
    
    public static int buscarBRecur( Comparable arr[], Comparable dato, int iz, int der) {
        int medio = (iz + der) / 2;
        if (dato.compareTo(arr[medio]) == 0) {
            return medio;
        } else if (iz <= der) {
            if (dato.compareTo(arr[medio]) < 0) {
                return buscarBRecur( arr,dato, iz, medio - 1); 
                
            } else {
                return buscarBRecur( arr,dato, medio + 1, der);
            }
        }
        return -1;
    }
      public static int busquedaB( Comparable arreglo[], Comparable dato) {
       return buscar(arreglo, dato, 0, arreglo.length-1);
    }
    private static int buscar(Comparable arreglo[], Comparable dato, int ini, int fin){
        int mid;
        do{
            mid = (ini +fin)/2;
            if(arreglo[mid].compareTo(dato) == 0){
                return mid;
            }else if(arreglo[mid].compareTo(dato) > 0){
                fin = mid - 1;
            }else{
                ini = mid+1;
            }
        }while(ini <= fin);
        return -1;
    }
     public static int busquedaLineal(Comparable arr[], Comparable dato){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].compareTo( dato) == 0){
                return i;
            }
        }
        return -1;
    }
      public static int busquedaLRecur(Comparable arr[], Comparable dato, int pos){
        if(pos <arr.length){
            if(arr[pos].compareTo( dato) == 0)
                return pos;
            else
                return busquedaLRecur(arr, dato, pos+1);
        }
        return -1;
    }
}
