package net.otu.texture;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class TextureLoader {

    public static Image backgroundImg;

    public static Image logoImg;

    public static void loadTextures() {
        try {
            // 画像をパスで取得
            backgroundImg = new Image("assets/Background.png");
            logoImg = new Image("assets/Logo.png");
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}