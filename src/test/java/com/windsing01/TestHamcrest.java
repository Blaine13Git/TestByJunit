package com.windsing01;

import org.junit.Before;
import org.junit.Test;
import org.omg.SendingContext.RunTime;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;

public class TestHamcrest {

    private List<String> values;

    @Before
    public void setUpList() {
        values = new ArrayList<String>();
        values.add("x");
        values.add("y");
        values.add("z");
    }

    @Test(expected = RuntimeException.class)
    public void testHamcrest_01() throws Exception {
        throw new RuntimeException();

//        assertThat("没有", values, hasItem(anyOf(equalTo("one"), equalTo("two"), equalTo("three"))));
    }

    @Test
    public void test_02() throws Exception{
        throw new RuntimeException();
    }
}
