package com.javarush.task.task24.task2413;

public class Ball extends BaseObject {
    //скорость шарика
    private double speed;
    //направление движения шарика (в градусах от 0 до 360)
    private double direction;
    // расстояние по x, которое проходит шарик за один шаг.
    // вычисляется на основе speed и direction
    private double dx;
    // расстояние по y, которое проходит шарик за один шаг.
    // вычисляется на основе speed и direction)
    private double dy;
    // "истина" если шарик "заморожен" - не двигается)
    private boolean isFrozen;

    public Ball(double x, double y, double radius) {
        super(x, y, radius);
    }

    public Ball(double x, double y, double speed, double direction) {
        super(x, y, 1);
        this.speed = speed;
        this.direction = direction;
        this.isFrozen = true;
    }

    @Override
    public void draw(Canvas canvas) {
    }

    @Override
    public void move() {
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }
}
