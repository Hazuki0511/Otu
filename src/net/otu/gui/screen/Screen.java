package net.otu.gui.screen;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public abstract class Screen {

    public abstract void initScreen();

    public abstract void renderScreen(Graphics g) throws SlickException;

    public abstract void updateScreen();

}
