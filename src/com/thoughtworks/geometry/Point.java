package com.thoughtworks.geometry;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculateDifferenceBetweenXCoordinate(Point point) {
        return this.x - point.x;
    }

    public double calculateDifferenceBetweenYCoordinate(Point point) {
        return this.y - point.y;
    }
}