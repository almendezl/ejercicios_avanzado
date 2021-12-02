/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package splinescubicos;

/**
 *
 * @author Darwin Morocho
 */
public class ParticionesSplinesCubicos {

    double[] puntosParticion(int puntos, double[] x, double[] y, double[] xi, double[] bj, double[] cj, double[] dj) {
        double li[] = new double[200];// almacena las componentes y de la particion del intervalo [a,b]
        double sx = 0;
        for (int k = 0; k < li.length; k++) {
            
            for (int i = 0; i < puntos-1; i++) {
            if (xi[k]>x[i] && xi[k]<x[i+1] ) {
                sx=y[i]+( bj[i]*(xi[k]-x[i]) )  +  (cj[i]*Math.pow(xi[k]-x[i], 2)) +(dj[i]*Math.pow(xi[k]-x[i], 3));
            }
        }
            li[k]=sx;
            
        }

        return li;
    }
}
