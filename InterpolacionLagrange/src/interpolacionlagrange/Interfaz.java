/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpolacionlagrange;

/**
 *
 * @author Angie Mendez
 */
public class Interfaz {
    public static void main(String[] args) {
         int x[]={5,7,11,13,17};
	  int y[]={150,392,1452,2366,5202};
	  InterpolacionLagrange l=new InterpolacionLagrange(y, x);
	  double res=l.getResultadoP(9);
	  
	  System.out.println("\nEl resultado es "+res);
    }
}
