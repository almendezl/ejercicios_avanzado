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
import java.awt.Toolkit;
import java.util.ArrayList;

public class Auto {

    private final ArrayList<Point> largo = new ArrayList<>();
    private int autoX = 0;
    private int autoY = 0;
    private final Image auto;

    public Auto() {
        largo.add(new Point(30, 25));
        auto = Toolkit.getDefaultToolkit().getImage("data/icons/car3.png");
    }

    public ArrayList<Point> getLargo() {
        return largo;
    }

    public void dibujoAuto(Graphics g) {

        for (int n = 0; n < largo.size(); n++) {
            g.setColor(Color.GREEN);
            Point p = largo.get(n);
            g.drawImage(auto, p.x * 20, p.y * 20, 20, 20, null);
        }

    }

    public void moverAuto() {
        for (int n = largo.size() - 1; n > 0; n--) {
            largo.get(n).setLocation(largo.get(n - 1));
        }
        largo.get(0).x += autoX;
        largo.get(0).y += autoY;
    }

    public void tamanioAuto() {
        largo.add(new Point());
    }

    public void direccion(String d) {
        switch (d) {
            case "ARR":
                autoX = 0;
                autoY = -1;
                break;
            case "ABA":
                autoX = 0;
                autoY = 1;
                break;
            case "IZQ":
                autoX = -1;
                autoY = 0;
                break;
            case "DER":
                autoX = 1;
                autoY = 0;
                break;

        }
    }
}
