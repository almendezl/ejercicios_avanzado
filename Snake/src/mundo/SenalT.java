/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.util.Random;

public class SenalT {

    private Image imagen;
    private Random random;
    private Point senal;

    public SenalT(Image icon) {
        random = new Random();
        senal = new Point();
        imagen = icon;
    }

    public void nuevaSenal() {
        senal.x = random.nextInt(39);
        senal.y = random.nextInt(28) + 1;
    }

    public void dibujoSenal(Graphics g) {

        g.setColor(Color.BLUE);
        g.drawImage(imagen, senal.x * 20, senal.y * 20, null);
        //g.drawString("prueba", frutita.x*20, frutita.y*20);
        //g.fillOval(frutita.x*20, frutita.y*20, 20, 20);
    }

    public Point getSenal() {
        return senal;
    }


}
