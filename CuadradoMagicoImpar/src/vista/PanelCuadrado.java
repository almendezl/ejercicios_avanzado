/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import mundo.CuadradoMagico;

/**
 *
 * @author Angie Mendez
 */
public class PanelCuadrado extends JPanel {

    public PanelCuadrado(CuadradoMagico cuad) {
        setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Cuadrado Magico")));
        GridLayout gl = new GridLayout(2, 2);
        gl.setVgap(3);
        gl.setHgap(5);
        setLayout(gl);
        
        for (int i = 0; i < cuad.getCuad().length; i++) {
            for (int j = 0; j < cuad.getCuad()[i].length; j++) {
                add(new JTextField(cuad.getCuad()[i][j]));
            }
        }

    }
    

}
