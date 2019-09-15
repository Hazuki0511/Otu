package net.otu.font;

import net.otu.utils.Logger;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;

import java.awt.*;

public class Fonts {

    public static UnicodeFont buttonFont;

    public static UnicodeFont mainFont;

    public static void loadFonts() throws SlickException {
        // フォントを作成
        buttonFont = new UnicodeFont("assets/fonts/Roboto-Regular.ttf", 70, false, false);
        mainFont = new UnicodeFont("assets/fonts/Roboto-Regular.ttf", 20, false, false);
        // エフェクトを追加
        buttonFont.getEffects().add(new ColorEffect(Color.white));
        mainFont.getEffects().add(new ColorEffect(Color.white));
        // Ascii文字を追加
        buttonFont.addAsciiGlyphs();
        mainFont.addAsciiGlyphs();
        // 追加したAscii文字を読み込む
        buttonFont.loadGlyphs();
        mainFont.loadGlyphs();
        // ログ
        Logger.getLogger().log(Logger.LogType.INFO, "Loaded fonts");
    }

}