package ru.vsu.cs.cg2021.g41.beshmelnicyna_d_yu.task1;

import java.awt.*;

public class Sun extends DrawingObject{
    private final int n = 11;
    private final int l = 40;

    public Sun(double cofX, double cofY, double cofW, Color color) {
        super(cofX, cofY, cofW, color);
    }

    @Override
    public void draw(Graphics2D g, int panelWidth, int panelHeight) {
        Color oldColor = g.getColor();
        g.setColor(color);
        g.setStroke(new BasicStroke(4));
        g.fillOval((int) (cofX * panelWidth) - (int) (cofW * panelWidth), //правильно ли заменила r?
                (int) (cofY * panelHeight) - (int) (cofW * panelWidth),
                2 * (int) (cofW * panelWidth), 2 * (int) (cofW * panelWidth));
        double da = 2 * Math.PI / n;

        for (int i = 0; i < n; i++) {
            double a = i * da;
            double x1 = cofX + cofW * Math.cos(a);
            double y1 = cofY + cofW * Math.sin(a);
            double x2 = cofX + (cofW + l) * Math.cos(a);
            double y2 = cofY + (cofW + l) * Math.sin(a);
            g.drawLine((int) x1 * panelWidth, (int) y1 * panelHeight, (int) x2 * panelWidth, (int) y2 * panelHeight);
        }
        g.setColor(oldColor);
    }
}


    /*public static void drawSun(Graphics2D g, int x, int y, int r, int l, int n, Color c) {
        Color oldColor = g.getColor();
        g.setColor(c);
        g.setStroke(new BasicStroke(4));
        g.fillOval(x - r, y - r, 2 * r, 2 * r);
        double da = 2 * Math.PI / n;

        for (int i = 0; i < n; i++) {
            double a = i * da;
            double x1 = x + r * Math.cos(a);
            double y1 = y + r * Math.sin(a);
            double x2 = x + (r + l) * Math.cos(a);
            double y2 = y + (r + l) * Math.sin(a);
            g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
        }
        g.setColor(oldColor);
    }
}*/
