package net.otu;

import net.otu.font.Fonts;
import net.otu.gui.screen.Screen;
import net.otu.gui.screen.screens.MainMenuScreen;
import net.otu.texture.Textures;
import org.newdawn.slick.*;

public class Otu extends BasicGame {

    public static final String TITLE = "Otu!";

    public static final String BUILD = "000001";

    public static final int WIDTH = 1920;

    public static final int HEIGHT = 1080;

    private static final boolean FULL_SCREEN = true;

    private static final int TARGET_FPS = 60;

    public static int FPS;

    public Screen currentScreen = new MainMenuScreen();

    public Otu(String title) {
        super(title);
    }

    public static void main(String[] args) throws SlickException {
        var container = new AppGameContainer(new Otu(TITLE + " - " + BUILD));

        createWindow(container);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        // テクスチャの読み込み
        Textures.loadTextures();
        // フォントの読み込み
        Fonts.loadFonts();
        // 画面の初期化
        this.currentScreen.init();
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        // 画面を更新
        this.currentScreen.update();
        // FPS値を更新
        FPS = gameContainer.getFPS();
    }

    @Override
    public void render(GameContainer gameContainer, Graphics g) throws SlickException {
        // 画面を描画
        this.currentScreen.render(g);
    }

    private static void createWindow(AppGameContainer container) throws SlickException {
        // サイズ指定　フルスクリーンに設定
        container.setDisplayMode(WIDTH, HEIGHT, FULL_SCREEN);
        // フレームレートを設定
        container.setTargetFrameRate(TARGET_FPS);
        // FPS表示を無効化
        container.setShowFPS(false);
        // ウィンドウを作成
        container.start();
    }

    public void setScreen(Screen screen) {
        this.currentScreen = screen;
    }

}