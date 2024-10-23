package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

import java.util.List;

public class LionAlexTest {

    @Mock
    Predator predator;

    @Mock
    Feline feline;

    LionAlex lionAlex = new LionAlex(predator, feline);


    @Test
    public void lionTest() throws Exception {
        Object actual = lionAlex.lion("Самец");
        Assert.assertEquals(true, actual);
    }

    @Test
    public void getKittensTest() {
        int actual = lionAlex.getKittens();
        Assert.assertEquals(0, actual);
    }

    @Test
    public void doesHaveManeTest() {
        boolean actual = lionAlex.doesHaveMane();
        Assert.assertTrue(actual);
    }

    @Test
    public void getFriendsTest() {
        List<String> actual = lionAlex.getFriends();
        Assert.assertEquals(List.of("Marty", "Gloria", "Melman"), actual);
    }

    @Test
    public void getPlaceOfLivingTest() {
        String actual = lionAlex.getPlaceOfLiving();
        Assert.assertEquals("New York Zoo", actual);
    }

    @Test(expected = Exception.class)
    public void testLion() throws Exception {
        lionAlex.lion("Самка");
    }
}

