package com.company;

import java.awt.*;

public class Window extends DrawObject {

    int width;
    int height;

    public Window(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setPaint(new Color(139, 105, 20));
        g.fillRect(x, y, width, height);

        g.setPaint(new Color(141, 238, 238));
        g.fillRect(x + 5, y + 5, width - 10, height - 10);

        g.setPaint(new Color(139, 105, 20));
        g.fillRect(x, y + height / 2 - 10, width, 10);
    }

    @Override
    public void replace(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
