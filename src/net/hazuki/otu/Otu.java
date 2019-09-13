package net.hazuki.otu;

import net.hazuki.otu.gui.screen.Screen;
import net.hazuki.otu.gui.screen.screens.MainMenuScreen;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class Otu {

    public static final Otu INSTANCE = new Otu();

    public final String title = "Otu!";

    public final int displayWidth = 1080;

    public final int displayHeight = 720;

    private final int fps = 60;

    public Screen currentScreen = new MainMenuScreen();

    public static void main(String[] args) {
        new Otu().run();
    }

    private void run() {
        // 画面の作成
        try {
            Display.setTitle(Otu.INSTANCE.title);
            Display.setDisplayMode(new DisplayMode(Otu.INSTANCE.displayWidth, Otu.INSTANCE.displayHeight));
            Display.setInitialBackground(1.0F, 1.0F, 1.0F);
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
        }
        while (!Display.isCloseRequested()) {
            // GLを初期化
            this.initGL();
            // 描画
            this.render();
            // 画面の更新
            Display.sync(this.fps);
            Display.update();
        }
        // 画面を閉じる
        Display.destroy();
    }

    private void initGL() {
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glLoadIdentity();

        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0F, this.displayWidth, this.displayHeight, 0.0F, -1.0F, 1.0F);

        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glLoadIdentity();
    }

    private void render() {
        // 描画処理
        // 現在の画面の描写
        this.currentScreen.drawScreen();
    }

}