package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)

public class LionTest {

    @Mock
    Feline feline;

    @Mock
    Predator predator;

    Lion lion = new Lion(predator, feline);

    @Test
    public void testGetKittens() {
        Lion lion = new Lion(predator, feline);
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void testDoesHaveMane()  {

        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(lion.hasMane, actual);
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(predator, feline);
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test (expected = Exception.class)
    public void testLion() throws Exception {
        lion.lion("Другой");

    }
}
