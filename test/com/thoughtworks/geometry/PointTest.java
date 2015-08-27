package com.thoughtworks.geometry;

import org.junit.Test;

import static org.junit.Assert.*;


public class PointTest {

    @Test
    public void theDifferenceBetweenXCoordinateOfSamePointIsZero(){
        Point point = new Point(1, 0);

        assertEquals(0, point.calculateDifferenceBetweenXCoordinate(point), 0.0);
    }
}