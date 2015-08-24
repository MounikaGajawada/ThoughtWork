package com.barclays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {


    @Test
    public void shouldCalculatePerimeter(){
        Square square = new Square(5);
        assertEquals(20, square.perimeter(),0);
    }

}