package com.javarush.task.task22.task2213;

public class Figure {
    private int x;
    private int y;
    private int[][] matrix;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public Figure(int x, int y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
    }

    public void left() {

    }

    public void right() {

    }

    public void down() {

    }

    public void up() {

    }

    // для поворота фигурки вокруг главной диагонали.
    public void rotate() {

    }

    // падение фигурки вниз до дна.
    public void downMaximum() {

    }

    // проверка - может ли фигурка быть помещена в текущую позицию.
    public boolean isCurrentPositionAvailable() {
        return true;
    }

    // когда фигурка достигла дна или уперлась в другую фигурку
    public void landed() {

    }
}
