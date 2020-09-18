package com.company;

import java.awt.*;

public class Tree extends DrawObject{

    private int width;
    private int height;

    public Tree(int x, int y) {
        super(x, y);
        width = (int) (Math.random() * 20) + 70;
        height = (int) (Math.random() * 20) + 100;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setPaint(new Color(139, 69, 19));
        g.fillOval(x, y, 20, 70);
        g.setPaint(new Color(105, 139, 34));
        g.fillOval(x - width / 2 + 10, y - height + 35, width, height);
    }

    @Override
    public void replace(int x, int y) {
        this.x = x;
        this.y = y;
        width = (int) (Math.random() * 20) + 70;
        height = (int) (Math.random() * 20) + 100;
    }
}
