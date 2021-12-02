/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import interfaz.PanelBotones;
import interfaz.PanelBotonesNumericos;
import interfaz.PanelSeleccionEscritura;
import interfaz.PanelTexto;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Angie Mendez
 */
public class InterfazApp extends JFrame {

    private final PanelBotones pnlBotones;
    private final PanelBotonesNumericos pnlBotNum;
    private final PanelTexto pnlText;
    private final PanelSeleccionEscritura pnlSelEsc;

    public InterfazApp() {
        /**
         * SE CREA EL CONTENEDOR PARA AGREGAR LOS PANELES CREADOS
         */
        Container c = getContentPane();

        ImageIcon icono = new ImageIcon("data/logo.png");
        JLabel imagen;
        imagen = new JLabel(" ");
        imagen.setIcon(icono);
        add(imagen);

        c.setLayout(null);
        setBounds(300, 300, 750, 390);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**
         * SE INSTANCIAN LOS PANELES QUE SE AGREGARAN Y SE LES DA SU RESPECTIVO
         * TAMAÑO
         */
        
        pnlBotones = new PanelBotones();
        pnlBotones.setBounds(335, 130, 395, 90);
        pnlBotNum = new PanelBotonesNumericos();
        pnlBotNum.setBounds(20, 130, 310, 210);
        pnlText = new PanelTexto();
        pnlText.setBounds(20, 10, 710, 110);
        pnlSelEsc = new PanelSeleccionEscritura();
        pnlSelEsc.setBounds(335, 230, 150, 80);
        imagen.setBounds(490, 230,600,110);

        /**
         * SE AGREGAN LOS PANELES AL CONTENEDOR
         */
        c.add(pnlText);
        c.add(pnlBotNum);
        c.add(pnlBotones);
        c.add(pnlSelEsc);
    }

    public PanelBotones getPnlBotones() {
        return pnlBotones;
    }

    public PanelBotonesNumericos getPnlBotNum() {
        return pnlBotNum;
    }

    public PanelTexto getPnlText() {
        return pnlText;
    }

    public PanelSeleccionEscritura getPnlSelEsc() {
        return pnlSelEsc;
    }

}
