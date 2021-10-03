package ru.vsu.cs.cg2021.g41.beshmelnicyna_d_yu.task1;

import java.awt.*;

public class Cedar extends DrawingObject{
    public Cedar(double cofX, double cofY, double cofH, Color color) {
        super(cofX, cofY, cofH, color);
    }

    @Override
    public void draw(Graphics2D g, int panelWidth, int panelHeight) {
        Color oldColor = g.getColor();
        BasicStroke oldS = (BasicStroke) g.getStroke();
        g.setStroke(new BasicStroke(23));
        g.setColor(color.darker());
        g.drawLine((int) (cofX * panelWidth), (int) (cofY * panelHeight), (int) (cofX * panelWidth),
                (int) (cofY * panelHeight) - (int) (cofH * panelHeight));

        g.setStroke(oldS);
        g.setColor(color.darker());
        g.drawOval((int) (cofX * panelWidth) - (int) (cofH * panelHeight) * 5 / 18,
                (int) (cofY * panelHeight) - (int) (cofH * panelHeight) * 2 / 3,
                (int) (cofH * panelHeight) * 5 / 9, (int) (cofH * panelHeight) * 5 / 9);
        g.drawOval((int) (cofX * panelWidth) - (int) (cofH * panelHeight) * 3 / 14,
                (int) (cofY * panelHeight) - (int) (cofH * panelHeight) * 6 / 7,
                (int) (cofH * panelHeight) * 3 / 7, (int) (cofH * panelHeight) * 3 / 7);
        g.drawOval((int) (cofX * panelWidth) - (int) (cofH * panelHeight) / 6,
                (int) (cofY * panelHeight) - (int) (cofH * panelHeight) * 26 / 25,
                (int) (cofH * panelHeight) / 3, (int) (cofH * panelHeight) / 3);
        g.setColor(color);
        g.fillOval((int) (cofX * panelWidth) - (int) (cofH * panelHeight) * 5 / 18,
                (int) (cofY * panelHeight) - (int) (cofH * panelHeight) * 2 / 3,
                (int) (cofH * panelHeight) * 5 / 9, (int) (cofH * panelHeight) * 5 / 9);
        g.fillOval((int) (cofX * panelWidth) - (int) (cofH * panelHeight) * 3 / 14,
                (int) (cofY * panelHeight) - (int) (cofH * panelHeight) * 6 / 7,
                (int) (cofH * panelHeight) * 3 / 7, (int) (cofH * panelHeight) * 3 / 7);
        g.fillOval((int) (cofX * panelWidth) - (int) (cofH * panelHeight) / 6,
                (int) (cofY * panelHeight) - (int) (cofH * panelHeight) * 26 / 25,
                (int) (cofH * panelHeight) / 3, (int) (cofH * panelHeight) / 3);

        g.setColor(oldColor);
    }
}


    /*public static void drawCedar(Graphics2D g, int x, int y, int height, Color c) {
        Color oldColor = g.getColor();
        BasicStroke oldS = (BasicStroke) g.getStroke();
        g.setStroke(new BasicStroke(23));
        g.setColor(c.darker());
        g.drawLine(x, y, x, y - height);

        g.setStroke(oldS);
        g.setColor(c.darker());
        g.drawOval(x - height * 5 / 18, y - height * 2 / 3, height * 5 / 9, height * 5 / 9);
        g.drawOval(x - height * 3 / 14, y - height * 6 / 7, height * 3 / 7, height * 3 / 7);
        g.drawOval(x - height / 6, y - height * 26 / 25, height / 3, height / 3);
        g.setColor(c);
        g.fillOval(x - height * 5 / 18, y - height * 2 / 3, height * 5 / 9, height * 5 / 9);
        g.fillOval(x - height * 3 / 14, y - height * 6 / 7, height * 3 / 7, height * 3 / 7);
        g.fillOval(x - height / 6, y - height * 26 / 25, height / 3, height / 3);

        g.setColor(oldColor);
    }
}*/
