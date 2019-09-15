package net.otu.gui.button.buttons;

import net.otu.font.Fonts;
import net.otu.gui.Gui;
import net.otu.gui.button.Button;
import net.otu.texture.Textures;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

public class MainMenuButton extends Button {

    public MainMenuButton(String buttonText, float x, float y) {
        super(buttonText, x, y, Textures.buttonImg.getWidth(), Textures.buttonImg.getHeight());
    }

    @Override
    public void render(Graphics g) {
        // ボタンの外枠を描画
        Gui.drawImage(g, Textures.buttonImg, this.x, this.y);
        // ボタンのテキストを描画
        Gui.drawCenteredString(Fonts.buttonFont, this.buttonText, this.x + (this.width / 2.0F), this.y + (this.height / 2.0F) - 5.0F, Color.white);
    }

    @Override
    public void clicked() {
    }

}