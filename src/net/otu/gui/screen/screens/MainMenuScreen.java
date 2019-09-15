package net.otu.gui.screen.screens;

import net.otu.gui.Gui;
import net.otu.gui.button.buttons.MainMenuButton;
import net.otu.gui.screen.Screen;
import net.otu.texture.Textures;
import org.newdawn.slick.Graphics;

public class MainMenuScreen extends Screen {

    @Override
    public void init() {
        // ボタンを消去
        this.buttons.clear();
        // ボタンを追加
        this.buttons.add(new MainMenuButton("PLAY", 850.0F, 200.0F));
        this.buttons.add(new MainMenuButton("OPTIONS", 850.0F, 390.0F));
        this.buttons.add(new MainMenuButton("EXIT", 850.0F, 580.0F));
    }

    @Override
    public void render(Graphics g) {
        super.render(g);
        // ロゴを描画
        Gui.drawImage(g, Textures.logoImg, 250, 200);
        // ボタンを描画
        this.buttons.forEach(button -> button.render(g));
    }

    @Override
    public void update() {
    }

}