package net.otu.gui.screen;

import org.newdawn.slick.Graphics;

public interface Screen {

    void initScreen();

    void renderScreen(Graphics g);

    void updateScreen();

}
