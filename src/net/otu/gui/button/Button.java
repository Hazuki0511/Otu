package net.otu.gui.button;

public abstract class Button {

    public int buttonID;

    public String buttonText;

    public int x;

    public int y;

    public int width;

    public int height;

    public Button(int buttonID, String buttonText, int x, int y, int width, int height) {
        this.buttonID = buttonID;
        this.buttonText = buttonText;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public abstract void drawButton();

    public abstract boolean buttonClicked();

    public abstract boolean buttonHovered();

}