/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import mundo.Auto;
import mundo.Pregunta;
import mundo.SenalT;

public class JuegoST extends JFrame implements KeyListener {

    private final int windowWidth = 800;
    private final int windowHeight = 600;
    private Auto auto;
    private SenalT senal1;
    private SenalT senal2;
    private SenalT senal3;
    private int puntuacion;
    private long goal;
    private final int tiempoDemora = 60;
    private Pregunta preguntas[];

   /* public static void main(String[] args) {
        new JuegoST();
    }*/

    public JuegoST() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(windowWidth, windowHeight);
        this.setResizable(false);
        this.setLocation(100, 100);
        this.setVisible(true);

        this.createBufferStrategy(2);
        this.addKeyListener(this);

        inicializoObjetos();

        while (true) {
            juego();
            sleep();
        }

    }

    private void inicializoObjetos() {
        auto = new Auto();
        auto.tamanioAuto();
        senal1 = new SenalT();
        senal1.nuevaSenal();
        senal2 = new SenalT();
        senal2.nuevaSenal();
        senal3 = new SenalT();
        senal3.nuevaSenal();
        puntuacion = 0;
        matrizPreguntas();

    }

    private void juego() {

        auto.moverAuto();
        chequearColision();
        dibujoPantalla();

    }

    private void dibujoPantalla() {

        BufferStrategy bf = this.getBufferStrategy();
        Graphics g = null;

        try {
            g = bf.getDrawGraphics();

            g.setColor(Color.WHITE);
            g.fillRect(0, 0, windowWidth, windowHeight);

            senal1.dibujoSenal(g);
            senal2.dibujoSenal(g);
            senal3.dibujoSenal(g);
            auto.dibujoAuto(g);
            muestroPuntos(g);

        } finally {
            g.dispose();
        }

        bf.show();

        Toolkit.getDefaultToolkit().sync();
    }

    private void chequearColision() {
        
        if(auto.getLargo().get(0).equals(senal1.getSenal())){
            preguntar();
            senal1.nuevaSenal();
        }else if(auto.getLargo().get(0).equals(senal2.getSenal())){
            preguntar();
            senal2.nuevaSenal();
        }else if (auto.getLargo().get(0).equals(senal3.getSenal())){
            preguntar();
            senal3.nuevaSenal();
        }
        

        

        if (auto.getLargo().get(0).x < 0 || auto.getLargo().get(0).x > 39
                || auto.getLargo().get(0).y < 1 || auto.getLargo().get(0).y > 29) {
            inicializoObjetos();
        }

        for (int n = 1; n < auto.getLargo().size(); n++) {
            if (auto.getLargo().get(0).equals(auto.getLargo().get(n)) && auto.getLargo().size() > 2) {
                inicializoObjetos();
            }
        }
    }
private void preguntar(){
    int posPreg = (int) (Math.random() * (preguntas.length - 1));
            int seleccion = JOptionPane.showOptionDialog(null, preguntas[posPreg].getPregunta(), "Pregunta",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, preguntas[posPreg].getIcon(),
                    preguntas[posPreg].getOpciones(), preguntas[posPreg].getOpciones()[0]); //revisar
            if (seleccion == preguntas[posPreg].getRespuestaC()) {
                JOptionPane.showMessageDialog(null, "Respuesta correcta +10 !!!");
                auto.tamanioAuto();
                puntuacion += 10;
            } else {
                JOptionPane.showMessageDialog(null, "Respuesta Incorrecta \nNo has conseguido puntos",
                        "Error!", JOptionPane.ERROR_MESSAGE);
            }
}
    private void muestroPuntos(Graphics g) {
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.drawString("Puntuacion: " + puntuacion, 20, 50);

    }

    private void sleep() {
        goal = (System.currentTimeMillis() + tiempoDemora);
        while (System.currentTimeMillis() < goal) {

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

        int tecla = e.getKeyCode();

        switch (tecla) {
            case KeyEvent.VK_UP:
                auto.direccion("ARR");
                break;
            case KeyEvent.VK_DOWN:
                auto.direccion("ABA");
                break;
            case KeyEvent.VK_LEFT:
                auto.direccion("IZQ");
                break;
            case KeyEvent.VK_RIGHT:
                auto.direccion("DER");
                break;
            case KeyEvent.VK_E:
                System.exit(0);

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    private void matrizPreguntas() {
        preguntas = new Pregunta[20];
        preguntas[0] = new Pregunta("¿Cual de las siguientes no es un tipo de señal de transito?",
                new String[]{"Preventivas", "Reglamentarias", "Informativas", "Señales de piso", "Ninguna de las anteriores"},
                4, new ImageIcon("data/0.jpg"));
        preguntas[1] = new Pregunta("Las señales REGLAMENTARIAS tienen por objeto advertir a los usuarios de la vía la "
                + "\nexistencia de una condición peligrosa y la naturaleza de esta, los colores distintivos son: fondo amarillo, "
                + "\nsímbolo y orla negras. Se identifican con el código SP", new String[]{"Verdadero", "Falso"},
                1, new ImageIcon("data/1.jpg"));
        preguntas[2] = new Pregunta("Las señales PREVENTIVAS tienen por objeto guiar al usuario de la vía,"
                + "\n suministrandole información de localidades, destinos,direcciones, sitios especiales, distancias y prestación de "
                + "\nservicios. Los colores distintivos son: fondo azul, textos y flechas blancos y símbolos negros. Se exceptúan las "
                + "\nseñales de identificación cuyo fondo es blanco y símbolos negros.", new String[]{"Verdadero", "Falso"},
                1, new ImageIcon("data/2.jpg"));
        preguntas[3] = new Pregunta("Son marcas paralelas al sentido de circulación y pueden ser de color amarillo o blanco."
                + " Corresponde a las señales:", new String[]{"Reglamentarias", "Informativas", "Preventivas", "de piso"},
                3, new ImageIcon("data/3.gif"));
        preguntas[4] = new Pregunta("La Reducción simétrica de la calzada: advierte al conductor que se aproxima una reducción "
                + "\ndel ancho de la calzada. La reducción puede ser del número de carriles o simplemente de las dimensiones de la "
                + "calzada.", new String[]{"Verdadero", "Falso"}, 0, new ImageIcon("data/4.png"));
        preguntas[5] = new Pregunta("Señal que reglamenta el paso alternado de vehículos, cuando en una calzada de dos"
                + " carriles se cierra uno de ellos.", new String[]{"Uno a uno", "Espaciamiento", "Bandero"},
                0, new ImageIcon("data/5.png"));
        preguntas[6] = new Pregunta("Las siguientes señales: resalto, prevención, superficie rizada, curva peligrosa a la derecha,"
                + " curva peligrosa a la izquierda, intersección de vías corresponden a: ", new String[]{"Informativas", "De piso",
                    "Reglamentarias", "Preventivas"}, 3, new ImageIcon("data/6.gif"));
        preguntas[7] = new Pregunta("¿Cual es el nombre de la siguiente señal?", new String[]{"Camino en ZigZag",
            "Camino Sinuoso", "Calzada Resbaladiza", "Curva en S"}, 1, new ImageIcon("data/7.jpg"));
        preguntas[8] = new Pregunta("¿Cual es el nombre de la siguiente señal?", new String[]{"Gomeria", "Estacionamiento",
            "Estacion de servicio", "Servicio mecanico"}, 0, new ImageIcon("data/8.jpg"));
        preguntas[9] = new Pregunta("¿Cual es el nombre de la siguiente señal?", new String[]{"Burificacion", "Superficie Rizada",
            "Proximidad a resalto", "Depresion"}, 1, new ImageIcon("data/9.jpg"));
        preguntas[10] = new Pregunta("¿Cual es el nombre de la siguiente señal?", new String[]{"Peatones en la via",
            "Zona escolar", "Zona deportiva"}, 1, new ImageIcon("data/10.jpg"));
        preguntas[11] = new Pregunta("La señal de Ancho Libre no se emplea para advertir al conductor la proximidad a una "
                + "estructura cuyo ancho libre estálimitado al indicado en la señal, en metros.", new String[]{"Verdadero", "Falso"},
                1, new ImageIcon("data/11.jpg"));
        preguntas[12] = new Pregunta("Esta señal  se emplea para advertir al conductor la proximidad a un tramo de vía que "
                + "\ncontiene un separador central o isla que canaliza el tránsito en los dos sentidos",
                new String[]{"Verdadero", "Falso"}, 0, new ImageIcon("data/12.jpg"));
        preguntas[13] = new Pregunta("¿Cual es el nombre de la siguiente señal?", new String[]{"Prohibido avanzar",
            "Paso obligado", "Puesto de control"}, 2, new ImageIcon("data/13.jpg"));
        preguntas[14] = new Pregunta("Bifurcación escolanada: estas señales se emplearán para advertir al conductor la "
                + "\nproximidad a dos intersecciones, a uno y otro lado de la vía siendo primero la intersección por el costado "
                + "izquierdo o derecho y cuya distancia de escalonamiento es menor a 50 metros en zona urbana y 100 metros "
                + "\nen zona rural.", new String[]{"Falso", "Verdadero"}, 1, new ImageIcon("data/14.png"));
        preguntas[15] = new Pregunta("Prevención de ceda el paso: esta señal le indica al conductor que no es necesario "
                + "\ndisminuir la velocidad ya que está próximo a encontrarse con el signo. Este le obliga a las personas en "
                + "\nintersecciones o zonas de intersección vial a cederle el paso a los vehículos para evitar congestiones.",
                new String[]{"Falso", "Verdadero"}, 0, new ImageIcon("data/15.png"));
        preguntas[16] = new Pregunta("Badenes o baden: los badenes o baden son los desagotes de agua que atraviesan "
                + "\nlas rutas o calles. Es muy útil en zonas donde las lluvias son frecuentes. No se recomienda disminuir la velocidad.",
                new String[]{"Verdadero", "Falso"}, 1, new ImageIcon("data/16.jpg"));
        preguntas[17] = new Pregunta("Prohibido adelantarse: la solemos encontrar en calles o caminos donde estos son "
                + "\ndemasiado angostos o que son demasiado transitados.", new String[]{"Verdadero", "Falso"},
                0, new ImageIcon("data/17.jpg"));
        preguntas[18] = new Pregunta("Avance: señal que indica que hay que parar o detenerse.",
                new String[]{"Verdadero", "Falso"}, 1, new ImageIcon("data/18.jpg"));
        preguntas[19] = new Pregunta("Banderillero: esta señal la encontramos comúnmente en las rutas o caminos que están "
                + "\nsiendo pavimentos o arreglados.", new String[]{"Verdadero", "Falso"}, 0, new ImageIcon("data/19.jpg"));

    }
}
