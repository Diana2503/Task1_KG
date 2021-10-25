package ru.vsu.cs.cg2021.g41.beshmelnicyna_d_yu.task1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class DrawPanel extends JPanel {
    private final World world;

    public DrawPanel() {
        Random rnd = new Random();
        List<Mushrooms> mushrooms = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            mushrooms.add(new Mushrooms(rnd.nextDouble() * 0.3, rnd.nextDouble() * 0.5 + 0.6, new Color(0x6E6E79), new Color(0xA10505)));
        }
        for (int i = 0; i < 15; i++) {
            mushrooms.add(new Mushrooms(rnd.nextDouble() * 0.5 + 0.65, rnd.nextDouble() * 0.5 + 0.6, new Color(0x6E6E79), new Color(0xA10505)));
        }

        mushrooms.sort(new Comparator<Mushrooms>() {
            @Override
            public int compare(Mushrooms o1, Mushrooms o2) {
                if (Math.abs(o1.getCofY() - o2.getCofY()) < 1e-10) {
                    return 0;
                }
                if (o1.getCofY() < o2.getCofY()) {
                    return -1;
                }
                return 1;
            }
        });

        world = new World(0, 0, 0, 0, Color.CYAN);
        world.addDrawingObject(new Sky(0, 0, 1, 1, Color.CYAN));
        world.addDrawingObject(new Sun(0.2, 0.25, 0.05, new Color(0xFADC03)));
        world.addDrawingObject(new Background(0, 0.6, 1, 0.4));
        world.addDrawingObject(new House(0.38, 0.4857, 0.25, 0.357, new Color(0xE31515), new Color(0xF3841B)));
        world.addDrawingObject(new Cloud(0.37, 0.0714, new Color(0xD9D9F8), new Color(0x0E99E8), new Color(0xEE38BF)));
        world.addDrawingObject(new Balloon(0.7, 0.0714, 0.2, 0.2857, new Color(0xA214A2), new Color(0x4D4D96)));
        for (Mushrooms mushroom : mushrooms) {
            world.addDrawingObject(mushroom);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D gr = (Graphics2D) g;
        this.world.draw(gr, this.getWidth(), this.getHeight());
    }
}
