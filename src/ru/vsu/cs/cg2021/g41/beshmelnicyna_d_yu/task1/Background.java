package ru.vsu.cs.cg2021.g41.beshmelnicyna_d_yu.task1;

import java.awt.*;

public class Background extends DrawingObject{
    public Background(double cofX, double cofY, double cofW, double cofH) {
        super(cofX, cofY, cofW, cofH);
    }

    @Override
    public void draw(Graphics2D g, int panelWidth, int panelHeight) {
        Color oldColor = g.getColor();

        g.setColor(new Color(0x55B223));
        g.fillRect((int) (cofX * panelWidth), (int) (cofY * panelHeight), (int) (cofW * panelWidth), (int) (cofH * panelHeight));

        g.setColor(oldColor);
    }
}
