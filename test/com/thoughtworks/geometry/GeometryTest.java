package com.thoughtworks.geometry;

import org.junit.Assert;
import org.junit.Test;


public class GeometryTest {

    @Test
    public void linewithstartingindex00andendingindex00(){
        Assert.assertEquals(0.0f, Geometry.getLength(0,0,0,0),0.0);
    }

    @Test
    public void linewithstartingindex00andendingindex01() {
        Assert.assertEquals(1.0f, Geometry.getLength(0, 0, 0, 1),0.0);
    }

    @Test
    public void linewithstartingindex12andendingindex35() {
        Assert.assertEquals(3.6, Geometry.getLength(1, 2, 3, 5),0.05);
    }
}