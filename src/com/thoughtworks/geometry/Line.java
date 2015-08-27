package com.thoughtworks.geometry;

public class Line {
    private Point startPoint, endPoint;

    public Line(double x1, double y1, double x2, double y2) {
        startPoint = new Point(x1, y1);
        endPoint = new Point(x2, y2);

    }

    public double length() {
        return Math.sqrt(Math.pow(startPoint.calculateDifferenceBetweenXCoordinate(endPoint), 2) + Math.pow(startPoint.calculateDifferenceBetweenYCoordinate(endPoint), 2));
    }

    @Override
    public boolean equals(Object that) {
        if(that == null || !(that instanceof Line))
            return false;
        Line thatLine = (Line)that;
        if(!(this.startPoint.equals(thatLine.startPoint)) || !(this.endPoint.equals(thatLine.endPoint)))
            return false;
        else return true;
    }
}



