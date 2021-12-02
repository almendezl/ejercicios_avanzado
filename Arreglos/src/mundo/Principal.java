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
public class Principal {

    public static void main(String[] args) {
        Arreglos arr = new Arreglos(500);

        arr.llenar(1, 8);
        System.out.println(arr.imprimir());

        Conteo contar = new Conteo();

        System.out.println("El maximo es: " + arr.getArr()[contar.max(arr.getArr())]
                + " Esta en la posicion: " + contar.max(arr.getArr()) + "\nEl minimo es: " + arr.getArr()[contar.min(arr.getArr())] + " Esta en la posicion: " + contar.min(arr.getArr()));
        System.out.println("La media es: " + contar.media(arr.getArr()));
        System.out.println("La moda es: " + contar.moda(arr.getArr()));
        System.out.println(contar.histograma(arr.getArr()));

    }
}
