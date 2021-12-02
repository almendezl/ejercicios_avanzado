
package mundo;

import javax.swing.ImageIcon;

public class Pregunta {
    private final String pregunta;
    private final String[] opciones;
    private final int respuestaC;
    private final ImageIcon icon;
    
    public Pregunta(String pregunta, String[] opciones, int respuestaC, ImageIcon icon){
        this.pregunta = pregunta;
        this.opciones = opciones;
        this.respuestaC=respuestaC;
        this.icon = icon;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public int getRespuestaC() {
        return respuestaC;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    
}
