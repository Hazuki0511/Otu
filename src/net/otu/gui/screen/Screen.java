package net.otu.gui.screen;

import net.otu.Otu;
import net.otu.font.Fonts;
import net.otu.gui.Gui;
import net.otu.gui.button.Button;
import net.otu.texture.Textures;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

import java.util.ArrayList;

public class Screen {

    public ArrayList<Button> buttons = new ArrayList<>();

    public void init() {
    }

    public void render(Graphics g) {
        var fpsText = "FPS: " + Otu.FPS;
        // 背景を描画
        Gui.drawImage(g, Textures.backgroundImg, 0, 0);

        if (this.renderFPS()) {
            // FPS値を描画
            Gui.drawString(Fonts.mainFont, fpsText, Otu.WIDTH - Fonts.mainFont.getWidth(fpsText) - 10.0F, Otu.HEIGHT - Fonts.mainFont.getHeight(fpsText) - 10.0F, Color.white);
        }
    }

    public void update() {
    }

    protected boolean renderFPS() {
        return true;
    }

}