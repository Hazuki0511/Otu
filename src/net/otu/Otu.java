package net.otu;

import net.otu.gui.Gui;
import org.newdawn.slick.*;

public class Otu extends BasicGame {

    public static final String TITLE = "Otu!";

    public static final String BUILD = "000001";

    private static final int WIDTH = 1920;

    private static final int HEIGHT = 1080;

    private static final boolean FULL_SCREEN = true;

    private static final int FPS = 60;

    public Otu(String title) {
        super(title);
    }

    public static void main(String[] args) throws SlickException {
        AppGameContainer container = new AppGameContainer(new Otu(TITLE));

        setupContainer(container);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gameContainer, Graphics g) throws SlickException {
        Gui.drawString(g, "Otu!", 100, 100, Color.red);
    }

    private static void setupContainer(AppGameContainer container) throws SlickException {
        container.setDisplayMode(WIDTH, HEIGHT, FULL_SCREEN);
        container.setTargetFrameRate(FPS);
        container.setShowFPS(false);
        container.start();
    }

}