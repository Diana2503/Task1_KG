package ru.vsu.cs.cg2021.g41.beshmelnicyna_d_yu.task1;

import java.awt.*;

public class Sun extends DrawingObject {
    private final int n = 11;
    private final double l = 0.2;

    public Sun(double cofX, double cofY, double cofW, Color color) {
        super(cofX, cofY, cofW, color);
    }

    @Override
    public void draw(Graphics2D g, int panelWidth, int panelHeight) {
        Color oldColor = g.getColor();
        g.setColor(color);
        g.setStroke(new BasicStroke(4));
        g.fillOval((int) ((cofX * panelWidth) - (cofW * panelWidth)),
                (int) ((cofY * panelHeight) - (cofW * panelWidth)),
                (int) (2 * cofW * panelWidth), (int) (2 * cofW * panelWidth));
        double da = 2 * Math.PI / n;

        for (int i = 0; i < n; i++) {
            double a = i * da;
            double x1 = cofX + cofW * Math.cos(a);
            double y1 = cofY + cofW * Math.sin(a);
            double x2 = cofX + (cofW + l) * Math.cos(a);
            double y2 = cofY + (cofW + l) * Math.sin(a);
            g.drawLine((int) (x1 * panelWidth), (int) (y1 * panelHeight), (int) (x2 * panelWidth), (int) (y2 * panelHeight));
        }
        g.setColor(oldColor);
    }
}
