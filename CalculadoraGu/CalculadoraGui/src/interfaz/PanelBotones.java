/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Angie Mendez
 */
public class PanelBotones extends JPanel {
    private final JButton btnSumar;
    private final JButton btnRestar;
    private final JButton btnMultiplicar;
    private final JButton btnDividir;
    private final JButton btnSalir;
    private final JButton btnBorrar;
    private final JButton btnPotencia;
    private final JButton btnModulo;
    private final JButton btnSqrt;
    private final JButton btnRaizEn;
    private final JButton btnSeno;
    private final JButton btnCoseno;
    
    public PanelBotones(){
        /**
         * SE LE APLICA BORDE Y UN TITULO AL PANEL
         */
        setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("Operadores")));
        setLayout(new FlowLayout()); // AQUI SE LE DA EL FORMATO DE ORGANIZACION EN EL PANEL
        
        /**
         * SE INSTANCIAN TODOS LOS COMPONENTES
         */
        
        btnSumar = new JButton("+");
        btnSumar.setBackground(Color.getHSBColor(100, 30,60));
        btnRestar = new JButton("-");
        btnRestar.setBackground(Color.getHSBColor(100, 30,60));
        btnMultiplicar = new JButton("*");
        btnMultiplicar.setBackground(Color.getHSBColor(100, 30,60));
        btnDividir = new JButton("/");
        btnDividir.setBackground(Color.getHSBColor(100, 30,60));
        btnSalir = new JButton("Salir");
        btnBorrar = new JButton("Borrar");
        btnModulo = new JButton("%");
        btnModulo.setBackground(Color.getHSBColor(100, 30,60));
        btnPotencia = new JButton("^");
        btnPotencia.setBackground(Color.getHSBColor(100, 30,60));
        btnSqrt = new JButton("sqrt");
        btnSqrt.setBackground(Color.getHSBColor(100, 30,60));
        btnRaizEn = new JButton("sqrt n");
        btnRaizEn.setBackground(Color.getHSBColor(100, 30,60));
        btnSeno = new JButton("sin");
        btnSeno.setBackground(Color.getHSBColor(100, 30,60));
        btnCoseno = new JButton("cos");
        btnCoseno.setBackground(Color.getHSBColor(100, 30,60));
        
        /**
         * SE AGREGAN TODOS LOS COMPONENTES AL PANEL
         */
        add(btnSumar);
        add(btnRestar);
        add(btnMultiplicar);
        add(btnDividir);
        add(btnModulo);
        add(btnPotencia);
        add(btnSqrt);
        add(btnRaizEn);
        add(btnSeno);
        add(btnCoseno);
        add(btnBorrar);
        add(btnSalir);
    }

    public JButton getBtnRaizEn() {
        return btnRaizEn;
    }

    public JButton getBtnSeno() {
        return btnSeno;
    }

    public JButton getBtnCoseno() {
        return btnCoseno;
    }

    public JButton getBtnSqrt() {
        return btnSqrt;
    }

    public JButton getBtnPotencia() {
        return btnPotencia;
    }

    public JButton getBtnModulo() {
        return btnModulo;
    }

    public JButton getBtnSumar() {
        return btnSumar;
    }

    public JButton getBtnRestar() {
        return btnRestar;
    }

    public JButton getBtnMultiplicar() {
        return btnMultiplicar;
    }

    public JButton getBtnDividir() {
        return btnDividir;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public JButton getBtnBorrar() {
        return btnBorrar;
    }
    
}
