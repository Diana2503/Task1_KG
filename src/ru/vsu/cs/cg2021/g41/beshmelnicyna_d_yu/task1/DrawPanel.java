package ru.vsu.cs.cg2021.g41.beshmelnicyna_d_yu.task1;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private final World world;


    public DrawPanel(){
        world = new World(0, 0, 0, 0, Color.CYAN);
        world.addDrawingObject(new Sky(0, 0, 1, 1));
        world.addDrawingObject(new Sun(0.3, 0.3, 0.2, new Color(0xFADC03)));
        world.addDrawingObject(new Mushrooms(0.24, 0.886, Color.GRAY, Color.RED));
        world.addDrawingObject(new Mushrooms(0.8, 0.8286, Color.GRAY, Color.RED));
        world.addDrawingObject(new House(0.38, 0.4857, 0.25, 0.357, Color.RED, Color.ORANGE));
        world.addDrawingObject(new Cloud(0.37, 0.0714, Color.WHITE, Color.CYAN, Color.RED));


    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;
        this.world.draw(gr, this.getWidth(), this.getHeight());

        /*gr.setColor(Color.CYAN);
        gr.fillRect(0, 0, getWidth(), getHeight());
        gr.setColor(Color.GREEN);
        gr.fillRect(0, getWidth() / 2, getWidth(), getHeight() / 2);
        */


        /*Sun.drawSun(gr, getWidth() / 4, getHeight() / 4, 50, 40, 11, Color.YELLOW);
        Cedar.drawCedar(gr, 100, 520, 300, Color.GREEN);
        Balloon.drawBalloon(gr, 700, 50, 200, 200, Color.PINK, Color.GRAY);
        House.drawHouse(gr, 380, 340, 250, 250, Color.RED, Color.ORANGE);
        Mushrooms.drawMushrooms(gr, 240, 620, Color.GRAY, Color.RED);
        Mushrooms.drawMushrooms(gr, 800, 580, Color.GRAY, Color.RED);
        Cloud.drawCloud(gr, 370, 50, Color.WHITE, Color.CYAN, Color.RED);
        */
    }
}
