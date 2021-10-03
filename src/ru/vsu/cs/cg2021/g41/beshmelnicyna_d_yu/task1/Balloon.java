package ru.vsu.cs.cg2021.g41.beshmelnicyna_d_yu.task1;

import java.awt.*;

public class Balloon extends DrawingObject{
    private final Color color1;
    private final Color color2;

    public Balloon(double cofX, double cofY, double cofW, double cofH, Color color1, Color color2) {
        super(cofX, cofY, cofW, cofH);
        this.color1 = color1;
        this.color2 = color2;

    }

    @Override
    public void draw(Graphics2D g, int panelWidth, int panelHeight) {
        Color oldColor = g.getColor();

        g.setStroke(new BasicStroke(6));
        g.setColor(color2.darker());
        g.drawLine(((int) ((cofX + 0.05) * panelWidth)), ((int) ((cofY + 0.214) * panelHeight)),
                ((int) ((cofX + 0.07) * panelWidth)), ((int) ((cofY + 0.357) * panelHeight)));
        g.drawLine(((int) ((cofX + 0.15) * panelWidth)), ((int) ((cofY + 0.214) * panelHeight)),
                ((int) ((cofX + 0.135) * panelWidth)), ((int) ((cofY + 0.357) * panelHeight)));

        g.setColor(color1.darker());
        g.drawOval((int) (cofX * panelWidth), (int) (cofY * panelHeight), (int) cofW * panelWidth, (int) (cofH * panelHeight));
        g.setColor(color1);
        g.fillOval((int) (cofX * panelWidth), (int) (cofY * panelHeight), (int) cofW * panelWidth, (int) (cofH * panelHeight));

        g.setColor(color2.darker());
        g.drawRect(((int) ((cofX + 0.05) * panelWidth)), ((int) ((cofY + 0.357) * panelHeight)),
                ((int) ((cofW - 0.095) * panelWidth)), ((int) ((cofH - 0.186) * panelHeight)));
        g.setColor(color2);
        g.fillRect(((int) ((cofX + 0.05) * panelWidth)), ((int) ((cofY + 0.357) * panelHeight)),
                ((int) ((cofW - 0.095) * panelWidth)), ((int) ((cofH - 0.186) * panelHeight)));

        g.setStroke(new BasicStroke(3));
        g.setColor(new Color(0xC513C5));
        g.drawLine(((int) ((cofX + 0.1) * panelWidth)), (int) (cofY * panelHeight),
                ((int) ((cofX + 0.1) * panelWidth)), ((int) ((cofY  + 0.286)* panelHeight)));
        g.drawLine(((int) ((cofX + 0.04) * panelWidth)), ((int) ((cofY + 0.0286) * panelHeight)),
                ((int) ((cofX + 0.04) * panelWidth)), ((int) ((cofY + 0.257) * panelHeight)));
        g.drawLine(((int) ((cofX + 0.16) * panelWidth)), ((int) ((cofY + 0.0286) * panelHeight)),
                ((int) ((cofX + 0.16) * panelWidth)), ((int) ((cofY + 0.257) * panelHeight)));

        g.setColor(oldColor);
    }
}


   /* public static void drawBalloon(Graphics2D g, int x, int y, int width, int height, Color c, Color color) {
        Color oldColor = g.getColor();

        g.setStroke(new BasicStroke(6));
        g.setColor(color.darker());
        g.drawLine(x + 50, y + 150, x + 70, y + 250);
        g.drawLine(x + 150, y + 150, x + 135, y + 250);

        g.setColor(c.darker());
        g.drawOval(x, y, width, height);
        g.setColor(c);
        g.fillOval(x, y, width, height);

        g.setColor(color.darker());
        g.drawRect(x + 50, y + 250, width - 95, height - 130);
        g.setColor(color);
        g.fillRect(x + 50, y + 250, width - 95, height - 130);

        g.setStroke(new BasicStroke(3));
        g.setColor(new Color(0xC513C5));
        g.drawLine(x + 100, y, x + 100, y + 200);
        g.drawLine(x + 40, y + 20, x + 40, y + 180);
        g.drawLine(x + 160, y + 20, x + 160, y + 180);

        g.setColor(oldColor);
    }
}
*/