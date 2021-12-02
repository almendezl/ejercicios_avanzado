/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Scanner;
import mundo.Operacion;

/**
 *
 * @author Angie Mendez
 */
public class Controlador {
    Scanner datos = new Scanner (System.in);
    Operacion operacion;
    
    public Controlador(){
        operacion = new Operacion(0,0);
    }
    
     public void inicio(){
         
        while(true){
        System.out.println("Seleccione la opcion correspondiente: ");
        System.out.println("1. + \n2.-  \n3. *  \n4. /  \n5. ^ \n6. salir");
        switch(datos.next()){
            case "1":
                pedirNum();
                System.out.println(operacion.suma());
                break;
           case "2":
               pedirNum();
               System.out.println(operacion.resta());
                break;
           case "3":
               pedirNum();
               System.out.println(operacion.multiplicacion());
                break;
           case "4":
               pedirNum();
               System.out.println(operacion.division());
                break;
           case "5":
               pedirNum();
               System.out.println(operacion.potencia());
                break;
           case "6":
               System.exit(0);
           default: System.out.println("Error de seleccion!!!");
        }
        }
        
    }
         private void pedirNum(){
        System.out.println("Ingrese el primer numero");
        operacion.setNum1(datos.nextDouble());
        System.out.println("Ingrese el segundo numero");
        operacion.setNum2(datos.nextDouble());
    }
}
