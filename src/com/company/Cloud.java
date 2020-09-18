package com.company;

import java.awt.*;

public class Cloud extends DrawObject {
    private int bunches;
    private int minRadius;
    private int maxRadius;

    public Cloud(int x, int y) {
        super(x, y);
        minRadius = (int) (Math.random() * 10) + 35;
        maxRadius = (int) (Math.random() * 5) + 55;
        bunches = (int) (Math.random() * 7) + 4;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setPaint(Color.WHITE);
        int i;
        g.fillOval(x, y, i = (int) (Math.random() * (maxRadius - minRadius)) + minRadius, i);
        for (int j = 0; j < bunches; j++) {
            switch (i % 4) {
                case 0 -> g.fillOval(x + (int) (Math.random() * 50), y + (int) (Math.random() * 20), i = (int) (Math.random() * (maxRadius - minRadius)) + minRadius, i);
                case 1 -> g.fillOval(x - (int) (Math.random() * 50), y - (int) (Math.random() * 20), i = (int) (Math.random() * (maxRadius - minRadius)) + minRadius, i);
                case 2 -> g.fillOval(x - (int) (Math.random() * 50), y + (int) (Math.random() * 20), i = (int) (Math.random() * (maxRadius - minRadius)) + minRadius, i);
                case 3 -> g.fillOval(x + (int) (Math.random() * 50), y - (int) (Math.random() * 20), i = (int) (Math.random() * (maxRadius - minRadius)) + minRadius, i);
            }
        }
    }

    @Override
    public void replace(int x, int y) {
        this.x = x;
        this.y = y;
        minRadius = (int) (Math.random() * 10) + 35;
        maxRadius = (int) (Math.random() * 5) + 55;
        bunches = (int) (Math.random() * 7) + 4;
    }
}
