/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazApp;

import mundo.Libro;
import mundo.Persona;

/**
 *
 * @author Angie Mendez
 */
public class InterfazApp {

    public static void main(String[] args) {
        Libro libros[] = new Libro[10];
        libros[0] = new Libro("El alquimista", new Persona("Paulo", "Coelho", 71, "Brasileno", "Novela"), "Novela", "Planeta",
                "9788408045076", 112);
        libros[1] = new Libro("Rayuela", new Persona("Julio", "Cortazar", 69, "Argentina", "Novela"), "Novela", "Pantheon Books",
                "9788466319058", 736);
        libros[2] = new Libro("La metamorfosis", new Persona("Franz", "Kafka", 40, "Austrohungara", "Modernismo"),
                "Novela y cuento", "Kurt Wolff", "9788420651361", 128);
        libros[3] = new Libro("El extrangero", new Persona("Albert", "Camus", 46, "Francesa", "Existencialismo"), "Novela filosofica",
                "Editions Callimard", "9788496580206", 184);
        libros[4] = new Libro("Las intermitencias de la muerte", new Persona("Jose", "Saramago", 87, "Portuguesa", "Novela"),
                "Novela", "Harcourt", "9788420469454", 214);
        libros[5] = new Libro("En las montanas de la locura", new Persona("Howard", "Lovecraft", 46, "Estadounidense",
                "Cosmicismo"), "Novela", "Acantilado", "9788477026181", 176);
        libros[6] = new Libro("El tunel", new Persona("Ernesto", "Sabato", 99, "Argentina", "Novela"), "Novela", "Sur",
                "9788432248368", 184);
        libros[7] = new Libro("La vuelta al mundo en ochenta dias", new Persona("Julio", "Verne", 77, "Francesa", "Aventuras"),
                "Novela de aventuras", "Pierre Jules Hetzel", "9788498016284", 224);
        libros[8] = new Libro("El principito", new Persona("Antonie", "de Saint Exupery", 44, "Francesa", "Novela"), "Novela",
                "Reynal & Hitchcock", "9788478887194", 96);
        libros[9] = new Libro("Satanas", new Persona("Mario", "Mendoza", 54, "Colombiano", "Realismo"), "Novela", "Seix Barral",
                "9789584233233", 128);

        // imprimirArray(libros);
        System.out.println("Arreglo de libros ordenados de forma ascendente");
        sortA(libros);
        imprimirArray(libros);
        
        System.out.println("AQUI ESTA EN ORDEN DESCENDENTE");
        sortD(libros);
        imprimirArray(libros);
    }

    public static void imprimirArray(Libro libros[]) {
        for (Libro libro : libros) {
            System.out.println(libro + "\n");//no es necesario el .tostring porque lo hace automatico
        }
    }

    public static void sortA(Comparable[] a) {
        //seleccion
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    public static void sortD(Comparable[] a) {
        //seleccion
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int max = i;
            for (int j = i + 1; j < N; j++) {
                if (lessD(a[j], a[max])) {
                    max = j;
                }
            }
            exch(a, i, max);
        }
    }
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
   private static boolean lessD(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static boolean isSorted(Comparable[] a) { 
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
}
