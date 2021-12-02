/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splinescubicos;

/**
 *
 * @author Angie Mendez
 */
public class SplinesCubicos {

    /**
     * @param args the command line arguments
     */
    public  static double f(double x){
        return Math.sqrt(x);
    }
    public static void main(String[] args) {
        // TODO code application logic here
  double val=9;//valor que se desea aproximar
        double t[]= {7,10,13,16,19};
        double y[]= {14,21,28,30,28};
        double h[]=new double[t.length];
        double b[]=new double[t.length];
        double v[]=new double[t.length];
        double u[] = new double[t.length];
        double z[] = new double[t.length];
        for (int i = 0; i < t.length-1; i++) {
            h[i]= t[i+1]-t[i];
            b[i]= (6*(y[i+1]-y[i]))/h[i];
        }
        u[1]=2*(h[0]+h[1]);
        v[1]=b[1]-b[0];
        for (int i = 2; i < t.length-1; i++) {
            u[i]=2*(h[i]+h[i-1])-Math.pow(h[i-1], 2)/u[i-1];
            v[i]= b[i]-b[i-1]-h[i-1]*v[i-1]/u[i-1];
        }
        
        z[t.length-1]=0;
        for (int i = t.length-2; i >=1; i--) {
        
            z[i]=(v[i]-h[i]*z[i+1])/u[i];
        }
        z[0]=0;

        
        double A[] = new double [t.length];
        double B[] = new double [t.length];
        double C[] = new double [t.length];
        
        for (int i = 0; i < A.length-1; i++) {
            A[i]= (1/6*h[i])*(z[i+1]-z[i]);
            B[i]=z[i]/2;
            C[i]=-((h[i]/6)*(z[i+1]))-((h[i]/3)*z[i])+(1/h[i])*(y[i+1]-y[i]);
        }
        double S[]= new double[t.length];
        for (int i = 0; i < S.length-1; i++) {
            S[i]=y[i]+(val-t[i])*(C[i]+(val-t[i])*(B[i]+(val-t[i])*A[i]));
        }
        for (int i = 0; i < S.length; i++) {
            System.out.println(S[i]);
                
            
        }
    }
    
}
