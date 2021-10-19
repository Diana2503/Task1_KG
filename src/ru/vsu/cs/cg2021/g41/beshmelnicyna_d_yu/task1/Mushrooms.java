package ru.vsu.cs.cg2021.g41.beshmelnicyna_d_yu.task1;

import java.awt.*;

public class Mushrooms extends DrawingObject {
    private final Color color1;
    private final Color color2;
    private final Double y;

    public Double getY() {
        return y;
    }

    public Mushrooms(double cofX, double cofY, Color color1, Color color2) {
        super(cofX, cofY);
        this.color1 = color1;
        this.color2 = color2;
        this.y = cofY;
    }

    @Override
    public void draw(Graphics2D g, int panelWidth, int panelHeight) {
        int width = 35;
        Color oldColor = g.getColor();

        g.setStroke(new BasicStroke(25));
        g.setColor(color1);
        //g.drawLine((int) (cofX * panelWidth), (int) (cofY * panelHeight), (int) (cofX * panelWidth),
        //        (int) ((cofY * panelHeight) - width));
        g.fillRect((int) (cofX * panelWidth), (int) (cofY * panelHeight), width,
                width);
        g.setStroke(new BasicStroke(2));
        g.setColor(new Color(1));
        g.drawRect((int) (cofX * panelWidth), (int) (cofY * panelHeight), width,
                width);

        g.setColor(color2);
        g.fillArc(((int) ((cofX - 0.017) * panelWidth)), ((int) ((cofY - 0.05) * panelHeight)),
                width * 2, width * 2, 0, 180);

        g.setColor(oldColor);
    }
}
