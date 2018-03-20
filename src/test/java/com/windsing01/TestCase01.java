package com.windsing01;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCase01 {

    @Before
    public void test01(){
        System.out.println("@Before");
    }

    @Test
    public void test_02(){
        System.out.println("Hello");
    }



}
