package net.otu.gui.screen.screens;

import net.otu.font.FontLoader;
import net.otu.gui.Gui;
import net.otu.gui.screen.Screen;
import net.otu.texture.TextureLoader;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class MainMenuScreen extends Screen {

    @Override
    public void initScreen() {

    }

    @Override
    public void renderScreen(Graphics g) throws SlickException {
        // 背景を描画
        Gui.drawImage(g, TextureLoader.backgroundImg, 0, 0);
        // ロゴを描画
        Gui.drawImage(g, TextureLoader.logoImg, 250, 200);
        // 文字描画
        Gui.drawString(FontLoader.ttf70, "osu!", 1000, 1000, Color.white);
    }

    @Override
    public void updateScreen() {

    }

}