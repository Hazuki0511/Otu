package net.otu.gui;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.TrueTypeFont;

public class Gui {

    public static void drawString(TrueTypeFont ttf, String text, int x, int y, Color color) {
        ttf.drawString(x, y, text, color);
    }

    public static void drawImage(Graphics g, Image image, int x, int y) {
        g.drawImage(image, x, y);
    }

    public static void drawImage(Graphics g, Image image, int x, int y, Color color) {
        g.drawImage(image, x, y, color);
    }

}