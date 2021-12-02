/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import mundo.CuadradoMagico;
import vista.Contenedor;
import vista.PanelCuadrado;

/**
 *
 * @author Angie Mendez
 */
public class Controlador implements ActionListener {
    private PanelCuadrado pnlCuad;
    private Contenedor contenedor;
    private CuadradoMagico cuadMag;

    public Controlador() {
        pnlCuad = new PanelCuadrado();
        contenedor = new Contenedor(pnlCuad);

        contenedor.getPnlBtn().getBtnBorrar().addActionListener(this);
        contenedor.getPnlBtn().getBtnSalir().addActionListener(this);
        contenedor.getPnlBtn().getBtnIniciar().addActionListener(this);
    }

    public void iniciar() {
        contenedor.setTitle("Cuadrado Magico");
        contenedor.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == contenedor.getPnlBtn().getBtnIniciar()) {
                int tamanio = Integer.parseInt(contenedor.getPnlBtn().getTxtTamanio().getText());
                if (tamanio >= 3 && !(tamanio % 2 == 0)) {
                    cuadMag = new CuadradoMagico(tamanio);
                    pnlCuad = new PanelCuadrado(cuadMag);
                    
                }
                else
                    JOptionPane.showMessageDialog(null, "Tamaño incorrecto, intentelo nuevamente");
            }
            if (e.getSource() == contenedor.getPnlBtn().getBtnSalir()) {
                int resultado = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?");
                if (resultado == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
            if (e.getSource() == contenedor.getPnlBtn().getBtnBorrar()) {
                contenedor.getPnlBtn().getTxtTamanio().setText("");
            }
        } catch (ArrayStoreException | NullPointerException | NumberFormatException | InputMismatchException a) {
            JOptionPane.showMessageDialog(null, "Datos incorrectos, Intente nuevamente");
        }
    }

}
