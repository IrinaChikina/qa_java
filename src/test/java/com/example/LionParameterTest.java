package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionParameterTest {
    final private String sex;
    final private boolean result;


    public LionParameterTest(String sex, boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters

    public static Object[][] sexLion() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Mock
    Predator predator;

    @Mock
    Feline feline;

    @Before
    public void open() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testLionSex() throws Exception {

        Lion lion = new Lion(predator, feline);
        Object actual = lion.lion(sex);

        Assert.assertEquals(result, actual);


    }

}