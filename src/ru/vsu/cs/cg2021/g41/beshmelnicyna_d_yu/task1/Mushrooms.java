package ru.vsu.cs.cg2021.g41.beshmelnicyna_d_yu.task1;

import java.awt.*;

public class Mushrooms extends DrawingObject{
    public Mushrooms(double cofX, double cofY, Color color) {
        super(cofX, cofY, color);
    }

    @Override
    public void draw(Graphics2D g, int panelWidth, int panelHeight) {
        int width = 35;
        Color oldColor = g.getColor();

        g.setStroke(new BasicStroke(25));
        g.setColor(color);
        g.drawLine((int) (cofX * panelWidth), (int) (cofY * panelHeight), (int) (cofX * panelWidth),
                (int) (cofY * panelHeight) - width);

        g.setColor(color.darker());
        g.fillArc(((int) ((cofX - 0.035) * panelWidth)) , ((int) ((cofY - 0.0928) * panelHeight)),
                width * 2, width * 2, 0, 180);

        g.setColor(oldColor);
    }
}


   /* public static void drawMushrooms(Graphics2D g, int x, int y, Color c, Color color) {
        int width = 35;
        Color oldColor = g.getColor();

        g.setStroke(new BasicStroke(25));
        g.setColor(c);
        g.drawLine(x, y, x, y - width);

        g.setColor(color.darker());
        g.fillArc(x - 35, y - 65, width * 2, width * 2, 0, 180);

        g.setColor(oldColor);
    }
}*/
