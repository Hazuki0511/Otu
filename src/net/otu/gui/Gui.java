package net.otu.gui;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class Gui {

    public static void drawString(Graphics g, String text, int x, int y, Color color) {
        g.setColor(color);
        g.drawString(text, x, y);
    }

}