package com.example;

import org.example.Threescanf;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Three {
    @Test
    public void threeTest(){
        Threescanf threeTest = new Threescanf();
        String relult = threeTest.Triangle(5);
        assertEquals("   *" +"  ***" +" *****" +"*******",relult);

    }
}
