package net.otu.gui.button;

import org.newdawn.slick.Graphics;

public abstract class Button {

    public String buttonText;

    public float x;

    public float y;

    public float width;

    public float height;

    public boolean hovered;

    public Button(String buttonText, float x, float y, float width, float height) {
        this.buttonText = buttonText;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public abstract void render(Graphics g);

    public abstract void clicked();

}