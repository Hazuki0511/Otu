package jp.hazuki.otu.display;

import jp.hazuki.otu.Otu;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class DisplayManager {

    public static final DisplayManager INSTANCE = new DisplayManager();

    public void createDisplay() {
        DisplayMode mode = new DisplayMode(Otu.INSTANCE.displayWidth, Otu.INSTANCE.displayHeight);

        try {
            Display.setTitle(Otu.INSTANCE.title);
            Display.setDisplayMode(mode);
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
        }
        GL11.glViewport(0, 0, Otu.INSTANCE.displayWidth, Otu.INSTANCE.displayHeight);
    }

    public void updateDisplay() {
        Display.sync(Otu.INSTANCE.fps);
        Display.update();
    }

    public void closeDisplay() {
        Display.destroy();
    }

}
