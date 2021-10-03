package ru.vsu.cs.cg2021.g41.beshmelnicyna_d_yu.task1;

import java.awt.*;

public class House extends DrawingObject{
    private final Color color1;
    private final Color color2;

    public House(double cofX, double cofY, double cofW, double cofH, Color color1, Color color2) {
        super(cofX, cofY, cofW, cofH);
        this.color1 = color1;
        this.color2 = color2;
    }

    @Override
    public void draw(Graphics2D g, int panelWidth, int panelHeight) {
        Color oldColor = g.getColor();

        g.setColor(color1.darker());
        g.setStroke(new BasicStroke(9));
        g.drawRect((int) (cofX * panelWidth), (int) (cofY * panelHeight), (int) cofW * panelWidth, (int) (cofH * panelHeight));
        g.setColor(color1);
        g.fillRect((int) (cofX * panelWidth), (int) (cofY * panelHeight), (int) cofW * panelWidth, (int) (cofH * panelHeight));

        g.setColor(color2.darker());
        g.fillRect(((int) ((cofX + 0.08) * panelWidth)), ((int) ((cofY + 0.157) * panelHeight)),
                ((int) ((cofW - 0.16) * panelWidth)), ((int) ((cofH - 0.157) * panelHeight)));
        int[] xPoints = {((int) ((cofX - 0.01) * panelWidth)), ((int) ((cofX + 0.12) * panelWidth)), ((int) ((cofX + 0.26) * panelWidth))};
        int[] yPoints = {((int) ((cofY + 0.0071) * panelHeight)), ((int) ((cofY - 0.2) * panelHeight)), ((int) ((cofY + 0.0071) * panelHeight))};
        g.setStroke(new BasicStroke(16));
        g.drawPolygon(xPoints, yPoints, 3);
        g.setColor(color2);
        g.fillPolygon(xPoints, yPoints, 3);

        g.setColor(color);
        g.fillOval(((int) ((cofX + 0.135) * panelWidth)), ((int) ((cofY + 0.243) * panelHeight)),
                ((int) ((cofW - 0.23) * panelWidth)), ((int) ((cofH - 0.3286) * panelHeight)));

        g.setColor(oldColor);
    }

}


   /* public static void drawHouse(Graphics2D g, int x, int y, int width, int height, Color c, Color color) {
        Color oldColor = g.getColor();

        g.setColor(color.darker());
        g.setStroke(new BasicStroke(9));
        g.drawRect(x, y, width, height);
        g.setColor(color);
        g.fillRect(x, y, width, height);

        g.setColor(c.darker());
        g.fillRect(x + 80, y + 110, width - 160, height - 110);
        int[] xPoints = {x - 10, x + 120, x + 260};
        int[] yPoints = {y + 5, y - 140, y + 5};
        g.setStroke(new BasicStroke(16));
        g.drawPolygon(xPoints, yPoints, 3);
        g.setColor(c);
        g.fillPolygon(xPoints, yPoints, 3);

        g.setColor(color);
        g.fillOval(x + 135, y + 170, width - 230, height - 230);

        g.setColor(oldColor);
    }
}*/
