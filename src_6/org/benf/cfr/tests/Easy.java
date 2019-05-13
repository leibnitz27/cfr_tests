package org.benf.cfr.tests;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

// Abe Crannaford
class Easy {

    public static void main(String[] args) {
        String fontName = Font.MONOSPACED;
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = ge.getAvailableFontFamilyNames();
        for(String s : fontNames) {
            if(s.equals("Unifont")) {
                fontName = s;
                break;
            }
        }
        /* CFR decompiles as String[], instead of Font */
        Font font = new Font(fontName, Font.PLAIN, 16);
    }

}
