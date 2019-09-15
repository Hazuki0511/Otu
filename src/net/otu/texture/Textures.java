package net.otu.texture;

import net.otu.utils.Logger;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Textures {

    public static Image backgroundImg;

    public static Image logoImg;

    public static Image buttonImg;

    public static void loadTextures() {
        try {
            // 画像をパスで取得
            // 背景
            backgroundImg = new Image("assets/Background.png");
            // ロゴ
            logoImg = new Image("assets/Logo.png");
            // ボタン
            buttonImg = new Image("assets/Button.png");
            // ログ
            Logger.getLogger().log(Logger.LogType.INFO, "Loaded textures");
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}