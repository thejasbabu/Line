package com.thoughtworks.geometry;

import static org.junit.Assert.*;

import org.junit.Test;

public class LineTest {

    @Test
    public void lineWithStartingIndex00AndEndingIndex00() {
        Line line = new Line(0, 0, 0, 0);

        assertEquals(0.0, line.length(), 0.0);
    }

    @Test
    public void lineWithStartingIndex00AndEndingIndex01() {
        Line line = new Line(0, 0, 0, 1);

        assertEquals(1.0, line.length(), 0.0);
    }

    @Test
    public void lineWithStartingIndex12AndEndingIndex35() {
        Line line = new Line(1, 2, 3, 5);

        assertEquals(3.6, line.length(), 0.05);
    }

    @Test
    public void lineWithNegativeIndex() {
        Line line = new Line(0, 0, -1, 0);

        assertEquals(1.0, line.length(), 0.0);
    }

    @Test
    public void shouldBeEqualToItself() {
        Line line= new Line(0, 0, 0, 0);

        assertEquals(line, line);
    }

    @Test
    public void shouldNotBeEqualToNull() {
        Line line=new Line(0 , 0, 0, 0);

        assertNotEquals(null, line);
    }

    @Test
    public void shouldNotBeEqualToSomethingThatIsNotALine() {
        Line line=new Line(0, 0, 0, 0);

        assertNotEquals(line, "line");
    }

    @Test
    public void shouldNotBeEqualIfStartingPointsOfLinesAreDifferent() {
        Line lineOne = new Line(1, 1, 1, 1);
        Line lineTwo = new Line(2, 2, 1, 2);

        assertNotEquals(lineOne, lineTwo);
    }

    @Test
    public void shouldNotBeEqualIfEndingPointsOFLinesAreDifferent() {
        Line lineOne = new Line(1, 1, 1, 1);
        Line lineTwo = new Line(1, 1, 2, 2);

        assertNotEquals(lineOne,lineTwo);
    }

    @Test
    public void shouldBeEqualIfStartingAndEndingPointsOfLinesAreSame() {
        Line lineOne = new Line(1, 1, 1, 1);
        Line lineTwo = new Line(1, 1, 1, 1);

        assertEquals(lineOne, lineTwo);
    }

    @Test
    public void shouldBeEqualIfStaringAndEndingPointsOfTwoLinesAreInterchangedAndAreSame() {
        Line lineOne = new Line(1, 0, 2, 0);
        Line lineTwo = new Line(2, 0, 1, 0);

        assertEquals(lineOne,lineTwo);
    }
}