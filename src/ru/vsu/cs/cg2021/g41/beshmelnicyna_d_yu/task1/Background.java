package ru.vsu.cs.cg2021.g41.beshmelnicyna_d_yu.task1;

import java.awt.*;

public class Background extends DrawingObject{
    public Background(double cofX, double cofY, double cofW, double cofH, Color color) {
        super(cofX, cofY, cofW, cofH, color);
    }

    @Override
    public void draw(Graphics2D g, int panelWidth, int panelHeight) {
        Color oldColor = g.getColor();

        g.setColor(new Color(0x5CAAFC));
        g.fillRect(0, 0, panelWidth, panelHeight / 2);

        g.setColor(new Color(0x55B223));
        g.fillRect(0, panelHeight / 2, panelWidth, panelHeight / 2);

        g.setColor(oldColor);
    }
}
