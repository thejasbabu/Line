package com.thoughtworks.geometry;

import org.junit.Assert;
import org.junit.Test;


public class LineTest {

    @Test
    public void linewithstartingindex00andendingindex00(){
        Line line = new Line(0,0,0,0);
        Assert.assertEquals(0.0f, line.length(),0.0);
    }

    @Test
    public void linewithstartingindex00andendingindex01() {
        Line line = new Line(0,0,0,1);
        Assert.assertEquals(1.0f, line.length(),0.0);
    }

    @Test
    public void linewithstartingindex12andendingindex35() {
        Line line = new Line(1,2,3,5);
        Assert.assertEquals(3.6, line.length(),0.05);
    }

    @Test
    public void linewithnegativeindex(){
        Line line= new Line(0,0,-1,0);
        Assert.assertEquals(1.0, line.length(),0.0);
    }
}