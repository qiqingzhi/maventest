package com.java;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class testTest {
/*
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main() {
    }
*/
    @Test
    public void testMD5() {
        test tes=new test();
        String a="123456abc+";
        assertEquals("ce356c9af7dc5afbc8b22685edade098",tes.testMD5(a));
    }

    @Test
    public void str_long() {
        test tes=new test();
        String a="asfsdfvs";
        assertEquals(8,tes.str_long(a));
    }

    @Test
    public void str_add() {
        test tes=new test();
        String a="asfsdfvs";
        String b="12345";
        assertEquals("asfsdfvs12345",tes.str_add(a,b));
    }

    @Test
    public void str_ch1() {
    }

    @Test
    public void str_ch2() {
    }
}