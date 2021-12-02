/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Angie Mendez
 */
public class PanelTexto extends JPanel {
    private final JLabel lblNumero1;
    private final JLabel lblNumero2;
    private final JLabel lblOperador;
    private final JButton btnResultado;
    private JLabel lblResp;
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JTextField txtOper;
    
    public PanelTexto(){
        
        /**
         * SE DA ESTILO, BORDE Y TITULO AL PANEL
         */
        setBorder(new CompoundBorder(new EmptyBorder(0, 0, 0, 0), new TitledBorder("")));
        GridLayout gl = new GridLayout(4,2);
        gl.setVgap(3);
        gl.setHgap(3);
        setLayout(gl);
        
        /**
         * SE INSTANCIAN LOS COMPONENTES
         */
        lblNumero1 = new JLabel ("Primer Operando →");
        lblNumero2 = new JLabel("Segundo Operando →");
        lblOperador = new JLabel("Operador →");
        btnResultado = new JButton("Resultado →");
        lblResp = new JLabel("");
        
        txtNum1 = new JTextField (60);
        txtNum2 = new JTextField (60);
        txtOper = new JTextField (1);
        
        /**
         * SE AGREGAN LOS COMPONENTES AL PANEL
         */
        add(lblNumero1);
        add(txtNum1);
        add(lblOperador);
        add(txtOper);
        add(lblNumero2);
        add(txtNum2);
        add(btnResultado);
        add(lblResp);
        
    }

    public JButton getBtnResultado() {
        return btnResultado;
    }

    public JLabel getLblNumero1() {
        return lblNumero1;
    }

    public JLabel getLblNumero2() {
        return lblNumero2;
    }

    public JLabel getLblOperador() {
        return lblOperador;
    }

    public JButton getLblResultado() {
        return btnResultado;
    }

    public JLabel getLblResp() {
        return lblResp;
    }

    public void setLblResp(JLabel lblResp) {
        this.lblResp = lblResp;
    }

    public JTextField getTxtNum1() {
        return txtNum1;
    }

    public void setTxtNum1(JTextField txtNum1) {
        this.txtNum1 = txtNum1;
    }

    public JTextField getTxtNum2() {
        return txtNum2;
    }

    public void setTxtNum2(JTextField txtNum2) {
        this.txtNum2 = txtNum2;
    }

    public JTextField getTxtOper() {
        return txtOper;
    }

    public void setTxtOper(JTextField txtOper) {
        this.txtOper = txtOper;
    }
    
}
