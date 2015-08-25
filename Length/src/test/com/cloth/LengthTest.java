package com.cloth;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {

    @Test
    public void totalLengthTest() {

        Length first = new Length(4, 20);
        Length second = new Length(2, 155);

        Length finalLength = first.addLengths(second);

        assertEquals(7, finalLength.getMeter());
        assertEquals(75, finalLength.getCentimeter());

    }

    @Test
    public void compareLength() {
        Length first = new Length(2, 30);
        Length second = new Length(0, 230);
        assertTrue(first.compareLengths(second));
    }


}