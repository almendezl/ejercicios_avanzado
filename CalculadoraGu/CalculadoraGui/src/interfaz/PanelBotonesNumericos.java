/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Angie Mendez
 */
public class PanelBotonesNumericos extends JPanel {
    private final JButton btnNum0;
    private final JButton btnNum1;
    private final JButton btnNum2;
    private final JButton btnNum3;
    private final JButton btnNum4;
    private final JButton btnNum5;
    private final JButton btnNum6;
    private final JButton btnNum7;
    private final JButton btnNum8;
    private final JButton btnNum9;
    private final JButton btnPunto;
    private final JButton btnAns;
    
    public PanelBotonesNumericos(){
        /**
         * SE AGREGA ESTILO, BORDE Y TITULO AL PANEL
         */
        setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Teclado numerico")));
        GridLayout gl = new GridLayout(4,3);
        gl.setVgap(3);
        gl.setHgap(5);
        setLayout(gl);
        
        /**
         * SE INSTANCIAN LOS COMPONENTES
         */
        btnNum0 = new JButton("0");
        btnNum0.setBackground(Color.getHSBColor(100, 30,60));
        btnNum1 = new JButton("1");
        btnNum1.setBackground(Color.getHSBColor(100, 30,60));
        btnNum2 = new JButton("2");
        btnNum2.setBackground(Color.getHSBColor(100, 30,60));
        btnNum3 = new JButton("3");
        btnNum3.setBackground(Color.getHSBColor(100, 30,60));
        btnNum4 = new JButton("4");
        btnNum4.setBackground(Color.getHSBColor(100, 30,60));
        btnNum5 = new JButton("5");
        btnNum5.setBackground(Color.getHSBColor(100, 30,60));
        btnNum6 = new JButton("6");
        btnNum6.setBackground(Color.getHSBColor(100, 30,60));
        btnNum7 = new JButton("7");
        btnNum7.setBackground(Color.getHSBColor(100, 30,60));
        btnNum8 = new JButton("8");
        btnNum8.setBackground(Color.getHSBColor(100, 30,60));
        btnNum9 = new JButton("9");
        btnNum9.setBackground(Color.getHSBColor(100, 30,60));
        btnPunto = new JButton(".");
        btnPunto.setBackground(Color.getHSBColor(100, 30,60));
        btnAns = new JButton("ANS");
        btnAns.setBackground(Color.getHSBColor(100, 30,60));
        
        /**
         * SE AGREGAN LOS COMPONENTES AL PANEL
         */
        add(btnNum7);
        add(btnNum8);
        add(btnNum9);
        add(btnNum4);
        add(btnNum5);
        add(btnNum6);
        add(btnNum1);
        add(btnNum2);
        add(btnNum3);
        add(btnNum0);
        add(btnPunto);
        add(btnAns);
        
    }

    public JButton getBtnNum0() {
        return btnNum0;
    }

    public JButton getBtnNum1() {
        return btnNum1;
    }

    public JButton getBtnNum2() {
        return btnNum2;
    }

    public JButton getBtnNum3() {
        return btnNum3;
    }

    public JButton getBtnNum4() {
        return btnNum4;
    }

    public JButton getBtnNum5() {
        return btnNum5;
    }

    public JButton getBtnNum6() {
        return btnNum6;
    }

    public JButton getBtnNum7() {
        return btnNum7;
    }

    public JButton getBtnNum8() {
        return btnNum8;
    }

    public JButton getBtnNum9() {
        return btnNum9;
    }

    public JButton getBtnPunto() {
        return btnPunto;
    }

    public JButton getBtnAns() {
        return btnAns;
    }
    
}
