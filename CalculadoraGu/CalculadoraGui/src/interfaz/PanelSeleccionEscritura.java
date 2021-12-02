/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;


import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Angie Mendez
 */
public class PanelSeleccionEscritura extends JPanel {
 
    private final JRadioButton rbtOper1;
    private final JRadioButton rbtOper2;
    
    public PanelSeleccionEscritura(){
        /**
         * SE AGREGA BORDE, TITULO Y ESTILO AL PANEL
         */
        setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Seleccion de escritura")));
        GridLayout gl = new GridLayout(2,2);
        gl.setVgap(3);
        gl.setHgap(3);
        setLayout(gl);
        
        /**
         * SE INSTANCIAN LOS COMPONENTES
         */
        rbtOper1 = new JRadioButton("Primer Operando");
        rbtOper2 = new JRadioButton("Segundo Operando");
        
        /**
         * SE AGREGAN LOS COMPONENTES AL PANEL
         */
        add(rbtOper1);
        add(rbtOper2);
    }

    public JRadioButton getRbtOper1() {
        return rbtOper1;
    }

    public JRadioButton getRbtOper2() {
        return rbtOper2;
    }
   
}
