package com.thoughtworks.geometry;

import org.junit.Assert;
import org.junit.Test;

public class LineComparatorTest {

    @Test
    public void forLinesWithSameCoordinates0000(){
        Line lineOne = new Line(0,0,0,0);
        Line lineTwo = new Line(0,0,0,0);
        LineComparator comparator = new LineComparator(lineOne,lineTwo);
        Assert.assertEquals(true,comparator.compareTwoLines());
    }

    @Test
    public void forLinesWithSameXAndYCoordinates(){
        Line lineOne = new Line(1,0,0,0);
        Line lineTwo = new Line(1,0,0,0);
        LineComparator comparator = new LineComparator(lineOne,lineTwo);
        Assert.assertEquals(true, comparator.compareTwoLines());
    }



}