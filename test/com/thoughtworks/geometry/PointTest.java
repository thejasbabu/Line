package com.thoughtworks.geometry;

import org.junit.Test;

import static org.junit.Assert.*;


public class PointTest {

    @Test
    public void theDifferenceBetweenXCoordinateOfSamePointIsZero(){
        Point point = new Point(1, 0);

        assertEquals(0, point.calculateDifferenceBetweenXCoordinate(point), 0.0);
    }

    @Test
    public void theDifferenceBetweenYCoordinateOfSamePointIsZero(){
        Point point = new Point(1, 0);

        assertEquals(0, point.calculateDifferenceBetweenYCoordinate(point), 0.0);
    }

    @Test
    public void theDifferenceBetweenXCoordinateOfTwoDifferentPointsIsLegit(){
        Point pointOne = new Point(1, 0);
        Point pointTwo = new Point(2, 0);

        assertEquals(1.0,pointOne.calculateDifferenceBetweenXCoordinate(pointTwo), 0.0);
    }
}