/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import mundo.Calculadora;
import mundo.InterfazApp;

/**
 *
 * @author Angie Mendez
 */
public class Controlador implements ActionListener {

    private InterfazApp interfaz;
    private Calculadora calculadora;
    private ButtonGroup opcion;
    String cadena1;
    String cadena2;

    public Controlador() {

        interfaz = new InterfazApp();
        calculadora = new Calculadora();
        cadena1 = "";
        cadena2 = "";
        /**
         * MANEJO BOTONES DE RADIO
         */
        opcion = new ButtonGroup();
        opcion.add(interfaz.getPnlSelEsc().getRbtOper1());
        opcion.add(interfaz.getPnlSelEsc().getRbtOper2());

        /**
         * BOTONES OPERANDOS SE LE ASIGNA EL ACTION LISTENER
         */
        interfaz.getPnlBotones().getBtnSumar().addActionListener(this);
        interfaz.getPnlBotones().getBtnRestar().addActionListener(this);
        interfaz.getPnlBotones().getBtnMultiplicar().addActionListener(this);
        interfaz.getPnlBotones().getBtnDividir().addActionListener(this);
        interfaz.getPnlBotones().getBtnModulo().addActionListener(this);
        interfaz.getPnlBotones().getBtnPotencia().addActionListener(this);
        interfaz.getPnlBotones().getBtnSqrt().addActionListener(this);
        interfaz.getPnlBotones().getBtnRaizEn().addActionListener(this);
        interfaz.getPnlBotones().getBtnSeno().addActionListener(this);
        interfaz.getPnlBotones().getBtnCoseno().addActionListener(this);
        interfaz.getPnlBotones().getBtnBorrar().addActionListener(this);
        interfaz.getPnlBotones().getBtnSalir().addActionListener(this);

        /**
         * BOTONES NUMERICOS SE LE ASIGNA EL ACTION LISTENER
         */
        interfaz.getPnlBotNum().getBtnNum0().addActionListener(this);
        interfaz.getPnlBotNum().getBtnNum1().addActionListener(this);
        interfaz.getPnlBotNum().getBtnNum2().addActionListener(this);
        interfaz.getPnlBotNum().getBtnNum3().addActionListener(this);
        interfaz.getPnlBotNum().getBtnNum4().addActionListener(this);
        interfaz.getPnlBotNum().getBtnNum5().addActionListener(this);
        interfaz.getPnlBotNum().getBtnNum6().addActionListener(this);
        interfaz.getPnlBotNum().getBtnNum7().addActionListener(this);
        interfaz.getPnlBotNum().getBtnNum8().addActionListener(this);
        interfaz.getPnlBotNum().getBtnNum9().addActionListener(this);
        interfaz.getPnlBotNum().getBtnPunto().addActionListener(this);
        interfaz.getPnlBotNum().getBtnAns().addActionListener(this);

        /**
         * BOTON DE RESULTADO SE LE ASIGNA ACTIONLISTENER
         */
        interfaz.getPnlText().getBtnResultado().addActionListener(this);

    }

    public void iniciar() {
        interfaz.setTitle("Calculadora");
        interfaz.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /**
         * PARA LOS BOTONES NUMERICOS CUANDO EL PRIMER OPERANDO ESTE
         * SELECCIONADO
         */
        if (interfaz.getPnlSelEsc().getRbtOper1().isSelected() && !interfaz.getPnlSelEsc().getRbtOper2().isSelected()) {
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum0()) {
                cadena1 += "0";
                interfaz.getPnlText().getTxtNum1().setText(cadena1);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum1()) {
                cadena1 += "1";
                interfaz.getPnlText().getTxtNum1().setText(cadena1);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum2()) {
                cadena1 += "2";
                interfaz.getPnlText().getTxtNum1().setText(cadena1);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum3()) {
                cadena1 += "3";
                interfaz.getPnlText().getTxtNum1().setText(cadena1);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum4()) {
                cadena1 += "4";
                interfaz.getPnlText().getTxtNum1().setText(cadena1);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum5()) {
                cadena1 += "5";
                interfaz.getPnlText().getTxtNum1().setText(cadena1);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum6()) {
                cadena1 += "6";
                interfaz.getPnlText().getTxtNum1().setText(cadena1);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum7()) {
                cadena1 += "7";
                interfaz.getPnlText().getTxtNum1().setText(cadena1);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum8()) {
                cadena1 += "8";
                interfaz.getPnlText().getTxtNum1().setText(cadena1);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum9()) {
                cadena1 += "9";
                interfaz.getPnlText().getTxtNum1().setText(cadena1);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnPunto()) {
                cadena1 += ".";
                interfaz.getPnlText().getTxtNum1().setText(cadena1);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnAns()) {
                cadena1 = String.valueOf(interfaz.getPnlText().getLblResp().getText());
                cadena2 = "";
                interfaz.getPnlText().getTxtNum1().setText(cadena1);
                interfaz.getPnlText().getTxtNum2().setText("");
                interfaz.getPnlText().getTxtOper().setText("");
                interfaz.getPnlText().getLblResp().setText("");
            }

        } /**
         * CUANDO ESTE SELECCIONADO EL SEGUNDO BOTON DE RADIO
         */
        else if (!interfaz.getPnlSelEsc().getRbtOper1().isSelected() && interfaz.getPnlSelEsc().getRbtOper2().isSelected()) {
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum0()) {
                cadena2 += "0";
                interfaz.getPnlText().getTxtNum2().setText(cadena2);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum1()) {
                cadena2 += "1";
                interfaz.getPnlText().getTxtNum2().setText(cadena2);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum2()) {
                cadena2 += "2";
                interfaz.getPnlText().getTxtNum2().setText(cadena2);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum3()) {
                cadena2 += "3";
                interfaz.getPnlText().getTxtNum2().setText(cadena2);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum4()) {
                cadena2 += "4";
                interfaz.getPnlText().getTxtNum2().setText(cadena2);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum5()) {
                cadena2 += "5";
                interfaz.getPnlText().getTxtNum2().setText(cadena2);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum6()) {
                cadena2 += "6";
                interfaz.getPnlText().getTxtNum2().setText(cadena2);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum7()) {
                cadena2 += "7";
                interfaz.getPnlText().getTxtNum2().setText(cadena2);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum8()) {
                cadena2 += "8";
                interfaz.getPnlText().getTxtNum2().setText(cadena2);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum9()) {
                cadena2 += "9";
                interfaz.getPnlText().getTxtNum2().setText(cadena2);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnPunto()) {
                cadena2 += ".";
                interfaz.getPnlText().getTxtNum2().setText(cadena2);
            }
            if (e.getSource() == interfaz.getPnlBotNum().getBtnAns()) {
                cadena1 = "";
                cadena2 = String.valueOf(interfaz.getPnlText().getLblResp().getText());;
                interfaz.getPnlText().getTxtNum1().setText("");
                interfaz.getPnlText().getTxtNum2().setText(cadena2);
                interfaz.getPnlText().getTxtOper().setText("");
                interfaz.getPnlText().getLblResp().setText("");
            }

        } else if (!interfaz.getPnlSelEsc().getRbtOper1().isSelected() && !interfaz.getPnlSelEsc().getRbtOper2().isSelected()) {
            if (e.getSource() == interfaz.getPnlBotNum().getBtnNum0() || e.getSource() == interfaz.getPnlBotNum().getBtnNum1()
                    || e.getSource() == interfaz.getPnlBotNum().getBtnNum2() || e.getSource() == interfaz.getPnlBotNum().getBtnNum3()
                    || e.getSource() == interfaz.getPnlBotNum().getBtnNum4() || e.getSource() == interfaz.getPnlBotNum().getBtnNum5()
                    || e.getSource() == interfaz.getPnlBotNum().getBtnNum6() || e.getSource() == interfaz.getPnlBotNum().getBtnNum7()
                    || e.getSource() == interfaz.getPnlBotNum().getBtnNum8() || e.getSource() == interfaz.getPnlBotNum().getBtnNum9()
                    || e.getSource() == interfaz.getPnlBotNum().getBtnPunto() || e.getSource() == interfaz.getPnlBotNum().getBtnAns()) {
                JOptionPane.showMessageDialog(null, "Seleccione el lugar de escritura!", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        /**
         * PARA LOS BOTONES OPERADORES Y OTROS
         */
        if (e.getSource() == interfaz.getPnlBotones().getBtnSalir()) {
            int resultado = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?");
            if (resultado == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
        if (e.getSource() == interfaz.getPnlBotones().getBtnBorrar()) {
            cadena1 = "";
            cadena2 = "";
            interfaz.getPnlText().getTxtNum1().setText("");
            interfaz.getPnlText().getTxtNum2().setText("");
            interfaz.getPnlText().getTxtOper().setText("");
            interfaz.getPnlText().getLblResp().setText("");
        }
        if (e.getSource() == interfaz.getPnlBotones().getBtnSumar()) {
            interfaz.getPnlText().getTxtOper().setText("+");
        }
        if (e.getSource() == interfaz.getPnlBotones().getBtnRestar()) {
            interfaz.getPnlText().getTxtOper().setText("-");
        }
        if (e.getSource() == interfaz.getPnlBotones().getBtnMultiplicar()) {
            interfaz.getPnlText().getTxtOper().setText("*");
        }
        if (e.getSource() == interfaz.getPnlBotones().getBtnDividir()) {
            interfaz.getPnlText().getTxtOper().setText("/");
        }
        if (e.getSource() == interfaz.getPnlBotones().getBtnModulo()) {
            interfaz.getPnlText().getTxtOper().setText("%");
        }
        if (e.getSource() == interfaz.getPnlBotones().getBtnPotencia()) {
            interfaz.getPnlText().getTxtOper().setText("^");
        }
        if (e.getSource() == interfaz.getPnlBotones().getBtnSqrt()) {
            interfaz.getPnlText().getTxtOper().setText("sqrt");
            interfaz.getPnlText().getTxtNum2().setText("2");
        }
        if (e.getSource() == interfaz.getPnlBotones().getBtnRaizEn()) {
            interfaz.getPnlText().getTxtOper().setText("sqrt n");
        }
        if (e.getSource() == interfaz.getPnlBotones().getBtnSeno()) {
            interfaz.getPnlText().getTxtOper().setText("sin");
            interfaz.getPnlText().getTxtNum2().setText("0");
        }
        if (e.getSource() == interfaz.getPnlBotones().getBtnCoseno()) {
            interfaz.getPnlText().getTxtOper().setText("cos");
            interfaz.getPnlText().getTxtNum2().setText("0");
        }
        if (e.getSource() == interfaz.getPnlText().getBtnResultado()) {
            try {
                calculadora.setNumero1(interfaz.getPnlText().getTxtNum1().getText());
                calculadora.setNumero2(interfaz.getPnlText().getTxtNum2().getText());
                interfaz.getPnlText().getLblResp().setText(String.valueOf(calculadora.operar(interfaz.getPnlText().getTxtOper().getText())));
            } /**
             * POSIBLES ERRORES QUE SE PUEDEN PRESENTAR AL MOMENTO DE REALIZAR
             * LAS OPERACIONES
             */
            catch (NumberFormatException a) {
                JOptionPane.showMessageDialog(null, "Datos Invalidos", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException | UnsupportedOperationException f) {
                JOptionPane.showMessageDialog(null, "Operacion no valida, por favor revise los datos ingresados!!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
