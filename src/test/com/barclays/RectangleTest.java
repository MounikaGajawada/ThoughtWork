package com.barclays;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class RectangleTest {

   @Test
    public void shouldCalculateParameter(){
        Rectangle rectangle = new Rectangle(5.5,7.2);
      assertEquals(25.4, rectangle.perimeter(),0);

    }

    @Test
     public void shouldCalculateArea(){
        Rectangle rectangle = new Rectangle(5,7.1);
        assertEquals(35.5, rectangle.area(),0);

    }





}