package com.windsing01;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestCase02 {

    private double a;
    private double b;
    private double c;

    @Parameterized.Parameters
    public static Collection<Integer[]> getTestParameters(){

        return Arrays.asList(new Integer[][]{
                {2,1,1},
                {3,2,1},
                {4,3,1},
        });
    }

}
