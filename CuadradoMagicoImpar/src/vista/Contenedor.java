/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author Angie Mendez
 */
public class Contenedor extends JFrame{
    
    private PanelBotones pnlBtn;
    
    public Contenedor(PanelCuadrado pnlCuad){
        Container c = getContentPane();
        c.setLayout(null);
        setBounds(350, 180, 1300, 360);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        pnlBtn = new PanelBotones();
        
        
        pnlCuad.setBounds(400,10,400,300);
        pnlBtn.setBounds(10,200,350,100);
        c.add(pnlCuad);
        c.add(pnlBtn);
    }

    public PanelBotones getPnlBtn() {
        return pnlBtn;
    }

    public PanelCuadrado getPnlCuad() {
        return pnlCuad;
    }
    
}
