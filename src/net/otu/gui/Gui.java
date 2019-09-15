package net.otu.gui;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.UnicodeFont;

public class Gui {

    // 文字描画
    public static void drawString(UnicodeFont font, String text, float x, float y, Color color) {
        font.drawString(x, y, text, color);
    }

    public static void drawCenteredString(UnicodeFont font, String text, float x, float y, Color color) {
        // 座標xがテキストの真ん中に来るように描画
        font.drawString(x - (font.getWidth(text) / 2.0F), y - (font.getHeight(text) / 2.0F), text, color);
    }

    public static void drawRect(Graphics g, float x, float y, float width, float height, Color color) {
        g.setColor(color);
        g.drawRect(x, y, width, height);
    }

    // 矩形描画
    public static void drawFillRect(Graphics g, float x, float y, float width, float height, Color color) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    // 画像描画
    public static void drawImage(Graphics g, Image image, float x, float y) {
        g.drawImage(image, x, y);
    }

    // 画像描画（色追加）
    public static void drawImage(Graphics g, Image image, float x, float y, Color color) {
        g.drawImage(image, x, y, color);
    }

    public static void changeScale(Graphics g, float scaleX, float scaleY) {
        g.scale(scaleX, scaleY);
    }

}