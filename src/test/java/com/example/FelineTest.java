package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)

public class FelineTest {


    @Spy
    private Feline felineSpy;

    @Test
    public void testEatMeat() throws Exception {

        felineSpy.eatMeat();
        Mockito.verify(felineSpy, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void testGetFamily() {

        Assert.assertEquals("Кошачьи", felineSpy.getFamily());
    }

    @Test
    public void testGetKittens() {
        felineSpy.getKittens();
        Mockito.verify(felineSpy, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void testGetKittensWithKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens(1);
        Assert.assertEquals(1, actual);
    }
}