package ru.vsu.cs.cg2021.g41.beshmelnicyna_d_yu.task1;

import java.awt.*;

import static ru.vsu.cs.cg2021.g41.beshmelnicyna_d_yu.task1.DrawUtil.drawWithColor;

public class Sky extends DrawingObject {

    public Sky(double cofX, double cofY, double cofW, double cofH, Color color) {
        super(cofX, cofY, cofW, cofH, color);
    }

    @Override
    public void draw(Graphics2D g, int panelWidth, int panelHeight) {
        drawWithColor(g, color, () -> {
            g.fillRect(
                    (int) (cofX * panelWidth),
                    (int) (cofY * panelHeight),
                    (int) (cofW * panelWidth),
                    (int) (cofH * panelHeight)
            );
        });
    }
}
