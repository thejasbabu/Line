//Point class  calculates the distance between two points in a plane
package com.thoughtworks.geometry;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFromAnother(Point that) {
       return Math.sqrt(Math.pow(that.x - this.x, 2) + Math.pow(that.y - this.y, 2));
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
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