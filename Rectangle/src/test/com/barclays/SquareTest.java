package com.barclays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {


    @Test
    public void shouldCalculatePerimeter() {
        Rectangle square = new Rectangle(5);
        assertEquals(20, square.perimeter(), 0);
    }


    @Test
    public void shouldCalculateArea() {
        Rectangle square = new Rectangle(10);
        assertEquals(100, square.area(), 0);
    }
}