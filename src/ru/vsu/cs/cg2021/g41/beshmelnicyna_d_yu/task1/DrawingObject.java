package ru.vsu.cs.cg2021.g41.beshmelnicyna_d_yu.task1;

import java.awt.*;

public abstract class DrawingObject {
    protected final double cofX;
    protected final double cofY;
    protected final double cofW;
    protected final double cofH;
    protected final Color color;

    public double getCofX() {
        return cofX;
    }

    public double getCofY() {
        return cofY;
    }

    public double getCofW() {
        return cofW;
    }

    public double getCofH() {
        return cofH;
    }

    public DrawingObject(double cofX, double cofY, double cofW, double cofH, Color color) {
        this.cofX = cofX;
        this.cofY = cofY;
        this.cofW = cofW;
        this.cofH = cofH;
        this.color = color;
    }

    public DrawingObject(double cofX, double cofY, double cofW, double cofH) {
        this.cofX = cofX;
        this.cofY = cofY;
        this.cofW = cofW;
        this.cofH = cofH;
        color = null;
    }

    public DrawingObject(double cofX, double cofY, double cofW, Color color) {
        this.cofX = cofX;
        this.cofY = cofY;
        this.cofW = cofW;
        this.color = color;
        cofH = 0;
    }

    public DrawingObject(double cofX, double cofY) {
        this.cofX = cofX;
        this.cofY = cofY;
        color = null;
        cofW = 0;
        cofH = 0;
    }

    public abstract void draw(Graphics2D g, int panelWidth, int panelHeight);
}
