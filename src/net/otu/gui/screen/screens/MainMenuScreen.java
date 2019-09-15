package net.otu.gui.screen.screens;

import net.otu.font.Fonts;
import net.otu.gui.Gui;
import net.otu.gui.screen.Screen;
import net.otu.texture.Textures;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class MainMenuScreen implements Screen {

    @Override
    public void initScreen() {

    }

    @Override
    public void renderScreen(Graphics g) {
        // 背景を描画
        Gui.drawImage(g, Textures.backgroundImg, 0, 0);
        // ロゴを描画
        Gui.drawImage(g, Textures.logoImg, 250, 200);
        // 文字描画
        Gui.drawString(Fonts.ttf70, "osu!", 1000, 1000, Color.white);
    }

    @Override
    public void updateScreen() {

    }

}