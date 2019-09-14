package net.otu.font;

import org.newdawn.slick.TrueTypeFont;

import java.awt.*;

public class FontLoader {

    private static final boolean ANTI_ALIAS = true;

    public static TrueTypeFont ttf70;

    public static void loadFonts() {
        var font70 = new Font("Roboto", Font.PLAIN, 20);

        ttf70 = new TrueTypeFont(font70, ANTI_ALIAS);
    }

}