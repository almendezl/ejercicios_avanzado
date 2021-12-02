/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Angie Mendez
 */
public class PanelBotones extends JPanel {
    private JButton btnBorrar;
    private JButton btnSalir;
    private JButton btnIniciar;
    private JTextField txtTamanio;
    
    public PanelBotones(){
        
        setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("  ")));
        GridLayout gl = new GridLayout(2,2);
        gl.setVgap(3);
        gl.setHgap(5);
        setLayout(gl);
        
        btnBorrar = new JButton("Borrar");
        btnSalir = new JButton("Salir");
        btnIniciar = new JButton("Iniciar");
        txtTamanio = new JTextField();
        add(txtTamanio);
        add(btnIniciar);
        add(btnBorrar);
        add(btnSalir);
    }

    public void setTxtTamanio(JTextField txtTamanio) {
        this.txtTamanio = txtTamanio;
    }

    public JButton getBtnBorrar() {
        return btnBorrar;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public JButton getBtnIniciar() {
        return btnIniciar;
    }

    public JTextField getTxtTamanio() {
        return txtTamanio;
    }
}
