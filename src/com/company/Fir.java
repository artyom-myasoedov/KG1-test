package com.company;

import java.awt.*;

public class Fir extends DrawObject {

    public Fir(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setPaint(new Color(139, 69, 19));
        g.fillOval(x, y, 20, 40);
        g.setPaint(new Color(0, 139, 69));
        for (int i = 0; i < 3; i++) {
            int[] xPoints = {x - 30, x + 10, x + 50, x - 30};
            int[] yPoints = {y + 20 - 20 * i, y - 15 - 20 * i, y + 20 - 20 * i, y + 20 -20 * i};
            g.fillPolygon(xPoints, yPoints, 4);
        }

    }

    @Override
    public void replace(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
