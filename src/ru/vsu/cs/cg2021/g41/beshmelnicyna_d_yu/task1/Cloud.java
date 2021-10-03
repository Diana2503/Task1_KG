package ru.vsu.cs.cg2021.g41.beshmelnicyna_d_yu.task1;

import java.awt.*;

public class Cloud extends DrawingObject{
    private final Color color1;
    private final Color color2;
    private final Color color3;

    public Cloud(double cofX, double cofY, Color color1, Color color2, Color color3) {
        super(cofX, cofY);
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
    }

    @Override
    public void draw(Graphics2D g, int panelWidth, int panelHeight) {
        int width = 100;
        int height = 100;

        Color oldColor = g.getColor();
        g.setStroke(new BasicStroke(5));

        g.setColor(color1.darker());
        g.drawOval((int) (cofX * panelWidth), (int) (cofY * panelHeight), width, height);
        g.drawOval(((int) ((cofX + 0.06) * panelWidth)), ((int) ((cofY - 0.0286) * panelHeight)), width, height);
        g.drawOval(((int) ((cofX + 0.12) * panelWidth)), (int) (cofY * panelHeight), width, height);
        g.setColor(color1);
        g.fillOval((int) (cofX * panelWidth), (int) (cofY * panelHeight), width, height);
        g.fillOval(((int) ((cofX + 0.06) * panelWidth)), ((int) ((cofY - 0.0286) * panelHeight)), width, height);
        g.fillOval(((int) ((cofX + 0.12) * panelWidth)), (int) (cofY * panelHeight), width, height);


       /* for(int i = 0; i++; i < 2) {
            g.drawOval((int) (cofX * panelWidth), (int) (cofY * panelHeight), width, height);
            g.drawOval(((int) ((cofX + 0.06) * panelWidth)), ((int) ((cofY - 0.0286) * panelHeight)), width, height);
            g.drawOval(((int) ((cofX + 0.12) * panelWidth)), (int) (cofY * panelHeight), width, height);
            g.setColor(color1.darker());
        }*/

        g.setColor(color2);
        g.fillArc(((int) ((cofX + 0.08) * panelWidth)), ((int) ((cofY + 0.0286) * panelHeight)),
                width - 80, width - 80, 0, 180);
        g.fillArc(((int) ((cofX + 0.12) * panelWidth)), ((int) ((cofY + 0.0286) * panelHeight)),
                width - 80, width - 80, 0, 180);

        g.setColor(color3);
        g.fillArc(((int) ((cofX + 0.1) * panelWidth)), ((int) ((cofY + 0.043) * panelHeight)),
                width - 80, width - 80, 180, 180);

        g.setColor(oldColor);
    }
}


    /*public static void drawCloud(Graphics2D g, int x, int y, Color color, Color c, Color col) {
        int width = 100;
        int height = 100;

        Color oldColor = g.getColor();
        g.setStroke(new BasicStroke(5));
        g.setColor(color.darker());
        g.drawOval(x, y, width, height);
        g.drawOval(x + 60, y - 20, width, height);
        g.drawOval(x + 120, y, width, height);
        g.setColor(color);
        g.fillOval(x, y, width, height);
        g.fillOval(x + 60, y - 20, width, height);
        g.fillOval(x + 120, y, width, height);

        g.setColor(c);
        g.fillArc(x + 80, y + 20, width - 80, width - 80, 0, 180);
        g.fillArc(x + 120, y + 20, width - 80, width - 80, 0, 180);

        g.setColor(col);
        g.fillArc(x + 100, y + 30, width - 80, width - 80, 180, 180);

        g.setColor(oldColor);
    }
}*/
/*
        g.setColor(color1.darker());
                g.drawOval((int) (cofX * panelWidth), (int) (cofY * panelHeight), width, height);
                g.drawOval(((int) ((cofX + 0.06) * panelWidth)), ((int) ((cofY - 0.0286) * panelHeight)), width, height);
                g.drawOval(((int) ((cofX + 0.12) * panelWidth)), (int) (cofY * panelHeight), width, height);
                g.setColor(color1);
                g.fillOval((int) (cofX * panelWidth), (int) (cofY * panelHeight), width, height);
                g.fillOval(((int) ((cofX + 0.06) * panelWidth)), ((int) ((cofY - 0.0286) * panelHeight)), width, height);
                g.fillOval(((int) ((cofX + 0.12) * panelWidth)), (int) (cofY * panelHeight), width, height);
*/
