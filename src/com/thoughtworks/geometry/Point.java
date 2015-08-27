package com.thoughtworks.geometry;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculateDifferenceBetweenXCoordinate(Point that) {
        return Math.abs(this.x - that.x);
    }

    public double calculateDifferenceBetweenYCoordinate(Point that) {
        return Math.abs(this.y - that.y);
    }

    @Override
    public boolean equals(Object that) {
        if(!(that instanceof Point) || that == null)
            return false;
        Point thatPoint = (Point)that;
        if(!(this.x == thatPoint.x) || !(this.y == thatPoint.y))
            return false;
        else
            return true;
    }
}