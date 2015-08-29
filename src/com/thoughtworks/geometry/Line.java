package com.thoughtworks.geometry;

public class Line {
    private Point startPoint, endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double length() {
        return startPoint.distanceFromAnother(endPoint);
    }

    @Override
    public boolean equals(Object that) {
        if(that == null || !(that instanceof Line))
            return false;
        Line thatLine = (Line)that;
        if((this.startPoint.equals(thatLine.endPoint)) && (this.endPoint.equals(thatLine.startPoint)))
            return true;
        if(!(this.startPoint.equals(thatLine.startPoint)) || !(this.endPoint.equals(thatLine.endPoint)))
            return false;
        else
            return true;
    }
}