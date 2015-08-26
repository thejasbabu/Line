package com.thoughtworks.geometry;

import org.junit.Assert;
import org.junit.Test;

public class LineComparatorTest {

    @Test
    public void forLinesWithSameCoordinate0000(){
        Line lineOne = new Line(0,0,0,0);
        Line lineTwo = new Line(0,0,0,0);
        LineComparator comparator = new LineComparator(lineOne,lineTwo);
        Assert.assertEquals(true,comparator.compareTwoLines());
    }

}