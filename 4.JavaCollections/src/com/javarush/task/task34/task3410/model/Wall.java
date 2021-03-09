package com.javarush.task.task34.task3410.model;

import java.awt.*;

public class Wall extends CollisionObject {
    public Wall(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics graphics) {
        int width = getWidth();
        int height = getHeight();
        int x = getX() - width / 2;
        int y = getY() - height / 2;

        graphics.setColor(new Color(140, 69, 40));
        graphics.fillOval(x, y, width, height);
    }
}