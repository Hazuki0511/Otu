package jp.hazuki.otu;

import jp.hazuki.otu.display.DisplayManager;
import org.lwjgl.opengl.Display;

public class Otu {

    public static final Otu INSTANCE = new Otu();

    public final String title = "Otu!";

    public final int displayWidth = 1080;

    public final int displayHeight = 720;

    public final int fps = 60;

    public static void main(String[] args) {
        DisplayManager.INSTANCE.createDisplay();

        while (!Display.isCloseRequested()) {
            DisplayManager.INSTANCE.updateDisplay();
        }
        DisplayManager.INSTANCE.closeDisplay();
    }

}