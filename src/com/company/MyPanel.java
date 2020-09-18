package com.company;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    int[] xPointsAsphalt = {470, 520, 620, 670, 470};
    int[] yPointsAsphalt = {800, 500, 500, 800, 800};
    int[] xPointsRoof = {320, 570, 820, 320};
    int[] yPointsRoof = {300, 220, 300, 300};

    public MyPanel() {
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle r = getBounds();
        g2.setBackground(Color.white);
        g2.clearRect(0, 0, r.width, r.height);
        draw(g2);
        g2.dispose();
    }

    public void draw(Graphics2D g) {
        //рисуем траву
        g.setPaint(new Color(102, 205, 0));
        g.fillRect(0, 400, 1200, 400);
        //рисуем небо
        g.setPaint(Color.CYAN);
        g.fillRect(0, 0, 1200, 400);
        //рисуем асфальт
        g.setPaint(Color.DARK_GRAY);
        g.fillPolygon(new Polygon(xPointsAsphalt, yPointsAsphalt, 5));
        //рисуем облака
        Cloud cloud = new Cloud(0, 100);
        for (int i = 0; i < 4; i++) {
            cloud.replace(cloud.getX() + 250, cloud.getY() + (int) Math.pow(-1, i - 1) * 50);
            cloud.draw(g);
        }
        //рисуем деревья справа
        Tree tree = new Tree(100, 400);
        for (int i = 0; i < 3; i++) {
            tree.replace(tree.getX() + 150 * (int) Math.pow(-1, i), tree.getY() + 100);
            tree.draw(g);
        }
        //рисуем ёлки
        Fir fir = new Fir(900, 500);
        for (int i = 0; i < 3; i++) {
            fir.draw(g);
            fir.replace(fir.getX() + 150 * (int) Math.pow(-1, i), fir.getY() + 100);
        }
        //рисуем "цемент" дома
        g.setPaint(Color.LIGHT_GRAY);
        g.fillRect(320, 300, 500, 250);
        //рисуем кирпичи
        g.setPaint(new Color(255, 165, 79));
        int x = 320,
                y = 300;
        for (int j = 0; j < 21; j++) {
            int i;
            if (j % 2 == 1) {
                x += 10;
                i = 0;
            } else {
                x -= 10;
                i = 1;
            }
            for (; i < 21; i++) {
                g.fillRect(x + i * 24, y, 20, 10);
            }
            y += 12;
        }
        //рисуем боковые колонны
        g.setPaint(Color.GRAY);
        g.fillRect(810, 300, 14, 250);
        g.fillRect(320, 300, 14, 250);
        //рисуем крышу
        g.setPaint(new Color(205, 170, 125));
        g.fillPolygon(xPointsRoof, yPointsRoof, 4);
        //рисуем верхние окна
        Window window = new Window(360, 334, 60, 80);
        for (int i = 0; i < 5; i++) {
            window.draw(g);
            window.replace(window.getX() + 90, window.getY());
        }
        //рисуем нижние окна
        window.replace(window.getX() - 90, window.getY() + 120);
        for (int i = 0; i < 2; i++) {
            window.draw(g);
            window.replace(window.getX() - 360, window.getY());
        }
        //рисуем дверь
        g.setPaint(new Color(255, 185, 15));
        g.fillRect(510, 430, 120, 120);
        g.setPaint(new Color(139, 105, 20));
        for (int i = 0; i < 2; i++) {
            g.fillRect(515 + 60 * i, 435, 50, 110);
        }
        g.setPaint(Color.WHITE);
        for (int i = 0; i < 2; i++) {
            g.fillOval(550 + 30 * i, 490, 8, 10);
        }
        g.dispose();
    }
}
