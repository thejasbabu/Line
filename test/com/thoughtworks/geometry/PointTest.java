package com.thoughtworks.geometry;

import org.junit.Test;

import static org.junit.Assert.*;


public class PointTest {

    @Test
    public void theDifferenceBetweenXCoordinateOfSamePointIsZero() {
        Point point = new Point(1, 0);

        assertEquals(0, point.distanceFromAnother(point), 0.0);
    }

    @Test
    public void theDifferenceBetweenYCoordinateOfSamePointIsZero() {
        Point point = new Point(1, 0);

        assertEquals(0, point.distanceFromAnother(point), 0.0);
    }

    @Test
    public void theDifferenceBetweenXCoordinateOfTwoDifferentPointsIsLegit() {
        Point pointOne = new Point(1, 0);
        Point pointTwo = new Point(2, 0);

        assertEquals(1.0, pointOne.distanceFromAnother(pointTwo), 0.0);
    }

    @Test
    public void theDifferenceBetweenYCoordinateOfTwoDifferentPointsIsLegit() {
        Point pointOne = new Point(0, 1);
        Point pointTwo = new Point(0, 2);

        assertEquals(1.0, pointOne.distanceFromAnother(pointTwo), 0.0);
    }

    @Test
    public void isEqualToItself() {
        Point point = new Point(1, 1);

        assertEquals(point, point);
    }

    @Test
    public void isNotEqualToSomethingWhichIsNotAPoint() {
        Point point = new Point(1, 1);

        assertNotEquals(point, "Point");
    }

    @Test
    public void isNotEqualToNull() {
        Point point = new Point(1, 1);

        assertNotEquals(null, point);
    }

    @Test
    public void shouldNotBeEqualIfXCoordinatesOfPointsAreDifferent() {
        Point pointOne = new Point(0, 1);
        Point pointTwo = new Point(1, 2);

        assertNotEquals(pointOne, pointTwo);
    }

    @Test
    public void shouldNotBeEqualIfYCoordinatesOfPointsAreDifferent() {
        Point pointOne = new Point(1, 1);
        Point pointTwo = new Point(1, 2);

        assertNotEquals(pointOne, pointTwo);
    }

    @Test
    public void shouldBeEqualIfXAndYCoordinatesOfPointsAreTheSame() {
        Point pointOne = new Point(1, 1);
        Point pointTwo = new Point(1, 1);

        assertEquals(pointOne, pointTwo);
    }

    @Test
    public void hashcodeShouldBeEqualForSamePointObject() {
        Point pointOne = new Point(1, 1);

        assertEquals(pointOne.hashCode(), pointOne.hashCode());
    }

    @Test
    public void hashcodeShouldBeDifferentForDifferentPointObject() {
        Point pointOne = new Point(1, 1);
        Point pointTwo = new Point(2, 1);

        assertNotEquals(pointOne.hashCode(), pointTwo.hashCode());
    }
}