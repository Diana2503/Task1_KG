package ru.vsu.cs.cg2021.g41.beshmelnicyna_d_yu.task1;

import java.awt.*;

public class DrawUtil {
    public static void drawWithColor(Graphics2D g, Color color, Runnable drawAction) {
        Color oldC = g.getColor();
        g.setColor(color);
        drawAction.run();
        g.setColor(oldC);
    }
}
