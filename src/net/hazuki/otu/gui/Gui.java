package net.hazuki.otu.gui;

import org.lwjgl.opengl.GL11;

public class Gui {

    public static void drawRect(float x, float y, float width, float height, int color) {
        var r = Gui.getRedFromHex(color);
        var g = Gui.getGreenFromHex(color);
        var b = Gui.getBlueFromHex(color);
        var a = Gui.getAlphaFromHex(color);

        GL11.glEnable(GL11.GL_BLEND);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        // 色の指定
        GL11.glColor4f(r, g, b, a);
        GL11.glBegin(GL11.GL_QUADS);
        // 座標の設定
        // 左上
        GL11.glVertex2f(x, y);
        // 右上
        GL11.glVertex2f(x + width, y);
        // 右下
        GL11.glVertex2f(x + width, y + height);
        // 左下
        GL11.glVertex2f(x, y + height);
        GL11.glEnd();
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
    }

    private static float getRedFromHex(int color) {
        return (float) (color >> 16 & 0xFF) / 255F;
    }

    private static float getGreenFromHex(int color) {
        return (float) (color >> 8 & 0xFF) / 255F;
    }

    private static float getBlueFromHex(int color) {
        return (float) (color & 0xFF) / 255F;
    }

    private static float getAlphaFromHex(int color) {
        return (float) (color / 24 & 0xFF) / 255F;
    }

}
