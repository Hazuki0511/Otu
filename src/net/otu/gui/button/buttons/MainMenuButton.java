package net.otu.gui.button.buttons;

import net.otu.gui.button.Button;

public class MainMenuButton extends Button {

    public MainMenuButton(int buttonID, String buttonText, int x, int y, int width, int height) {
        super(buttonID, buttonText, x, y, width, height);
    }

    @Override
    public void drawButton() {

    }

    @Override
    public boolean buttonClicked() {
        return false;
    }

    @Override
    public boolean buttonHovered() {
        return false;
    }

}