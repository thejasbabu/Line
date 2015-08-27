package com.thoughtworks.geometry;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculateDifferenceBetweenXCoordinate(Point point) {
        return Math.abs(this.x - point.x);
    }

    public double calculateDifferenceBetweenYCoordinate(Point point) {
        return Math.abs(this.y - point.y);
    }

    @Override
    public boolean equals(Object that) {
        if(!(that instanceof Point) || that == null)
            return false;
        else
            return true;
    }
}
