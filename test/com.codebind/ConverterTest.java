package com.codebind;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {

    private static Converter math;

5
    @BeforeClass
    public static void setUp(){
       math = new Converter();
    }

    @AfterClass
    public static void tearDown(){
        math=null;
    }

    @Test
    public void testHexToBin(){


    }

}


