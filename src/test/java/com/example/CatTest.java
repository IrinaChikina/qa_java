package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {

    @Mock
    private Feline feline;



    @Test
    public void testGetSound() {
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        Assert.assertEquals("Мяу", actual);
    }

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }
}
