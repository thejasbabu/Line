package com.thoughtworks.geometry;

import static org.junit.Assert.*;

import org.junit.Test;

public class LineTest {

    @Test
    public void lineWithStartingIndex00AndEndingIndex00() {
        Point pointOne = new Point(0, 0);
        Point pointTwo = new Point(0, 0);
        Line line = new Line(pointOne, pointTwo);

        assertEquals(0.0, line.length(), 0.0);
    }

    @Test
    public void lineWithStartingIndex00AndEndingIndex01() {
        Point pointOne = new Point(0, 0);
        Point pointTwo = new Point(0, 1);
        Line line = new Line(pointOne, pointTwo);

        assertEquals(1.0, line.length(), 0.0);
    }

    @Test
    public void lineWithStartingIndex12AndEndingIndex35() {
        Point pointOne = new Point(1, 2);
        Point pointTwo = new Point(3, 5);
        Line line = new Line(pointOne, pointTwo);

        assertEquals(3.6, line.length(), 0.05);
    }

    @Test
    public void lineWithNegativeIndex() {
        Point pointOne = new Point(0, 0);
        Point pointTwo = new Point(-1, 0);
        Line line = new Line(pointOne, pointTwo);

        assertEquals(1.0, line.length(), 0.0);
    }

    @Test
    public void shouldBeEqualToItself() {
        Point pointOne = new Point(0, 0);
        Point pointTwo = new Point(1, 1);
        Line line= new Line(pointOne, pointTwo);

        assertEquals(line, line);
    }

    @Test
    public void shouldNotBeEqualToNull() {
        Point pointOne = new Point(0, 0);
        Point pointTwo = new Point(1, 0);
        Line line=new Line(pointOne, pointTwo);

        assertNotEquals(null, line);
    }

    @Test
    public void shouldNotBeEqualToSomethingThatIsNotALine() {
        Point pointOne = new Point(0, 0);
        Point pointTwo = new Point(0, 0);
        Line line=new Line(pointOne, pointTwo);

        assertNotEquals(line, "line");
    }

    @Test
    public void shouldNotBeEqualIfStartingPointsOfLinesAreDifferent() {
        Point startPointOfLineOne = new Point(1, 0);
        Point endPointOfLineOne=new Point(2, 0);
        Point startPointOfLineTwo = new Point(2, 0);
        Point endPointOfLineTwo = new Point(3, 0);
        Line lineOne = new Line(startPointOfLineOne, endPointOfLineOne);
        Line lineTwo = new Line(startPointOfLineTwo, endPointOfLineTwo);

        assertNotEquals(lineOne, lineTwo);
    }

    @Test
    public void shouldNotBeEqualIfEndingPointsOFLinesAreDifferent() {
        Point startPointOfLineOne = new Point(1, 0);
        Point endPointOfLineOne=new Point(2, 0);
        Point startPointOfLineTwo = new Point(2, 0);
        Point endPointOfLineTwo = new Point(3, 0);
        Line lineOne = new Line(startPointOfLineOne, endPointOfLineOne);
        Line lineTwo = new Line(startPointOfLineTwo, endPointOfLineTwo);

        assertNotEquals(lineOne, lineTwo);
    }

    @Test
    public void shouldBeEqualIfStartingAndEndingPointsOfLinesAreSame() {
        Point startPointOfLineOne = new Point(1, 0);
        Point endPointOfLineOne=new Point(2, 0);
        Point startPointOfLineTwo = new Point(1, 0);
        Point endPointOfLineTwo = new Point(2, 0);
        Line lineOne = new Line(startPointOfLineOne, endPointOfLineOne);
        Line lineTwo = new Line(startPointOfLineTwo, endPointOfLineTwo);

        assertEquals(lineOne, lineTwo);
    }

    @Test
    public void shouldBeEqualIfStaringAndEndingPointsOfTwoLinesAreInterchangedAndAreSame() {
        Point startPointOfLineOne = new Point(1, 0);
        Point endPointOfLineOne=new Point(2, 0);
        Point startPointOfLineTwo = new Point(2, 0);
        Point endPointOfLineTwo = new Point(1, 0);
        Line lineOne = new Line(startPointOfLineOne, endPointOfLineOne);
        Line lineTwo = new Line(startPointOfLineTwo, endPointOfLineTwo);
        assertEquals(lineOne, lineTwo);
    }

    @Test
    public void hashcodeShouldBeEqualForTheSameLineObject() {
        Point startPointOfLineOne = new Point(1, 0);
        Point endPointOfLineOne=new Point(2, 0);
        Line lineOne = new Line(startPointOfLineOne, endPointOfLineOne);

        assertEquals(lineOne.hashCode(), lineOne.hashCode());
    }
}