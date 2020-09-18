package com.company;

import java.awt.*;

public abstract class DrawObject {
    protected int x;
    protected int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public DrawObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics2D g);

    public abstract void replace(int x, int y);
}
