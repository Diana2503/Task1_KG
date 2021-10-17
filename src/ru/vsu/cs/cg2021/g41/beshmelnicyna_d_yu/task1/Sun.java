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
        g.fillOval((int) ((cofX * avg(panelWidth, panelHeight)) - (cofW * avg(panelWidth, panelHeight))),
                (int) ((cofY * avg(panelWidth, panelHeight)) - (cofW * avg(panelWidth, panelHeight))),
                (int) (2 * cofW * avg(panelWidth, panelHeight)), (int) (2 * cofW * avg(panelWidth, panelHeight)));
        double da = 2 * Math.PI / n;

        for (int i = 0; i < n; i++) {
            double a = i * da;
            double x1 = cofX + avg(cofW, cofH) * Math.cos(a);
            double y1 = cofY + avg(cofW, cofH) * Math.sin(a);
            double x2 = cofX + (avg(cofW, cofH) + l) * Math.cos(a);
            double y2 = cofY + (avg(cofW, cofH) + l) * Math.sin(a);
            g.drawLine((int) (x1 * avg(panelWidth, panelHeight)), (int) (y1 * avg(panelWidth, panelHeight)),
                    (int) (x2 * avg(panelWidth, panelHeight)), (int) (y2 * avg(panelWidth, panelHeight)));
        }
        g.setColor(oldColor);
    }

    double avg(double a, double b)
    {
        return (a + b) / 2;
    }

    int avg(int a, int b)
    {
        return (a + b) / 2;
    }
}
