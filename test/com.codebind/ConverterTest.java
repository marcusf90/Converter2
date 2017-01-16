package com.codebind;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ConverterTest {

    private static Converter math;


    @BeforeClass
    public static void setUp(){
       math = new Converter();
    }

    @AfterClass
    public static void tearDown(){
        math=null;
    }

    @Test
    public void testBinToHex(){

    }

}


