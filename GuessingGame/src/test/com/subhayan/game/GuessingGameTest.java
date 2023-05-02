package com.subhayan.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessingGameTest {

    private GuessingGame game;

    @BeforeEach
    void setUp() {
        game = new GuessingGame();
    }

    @Test
    public void testSimpleWinSituation() {
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum);
        assertEquals("You got it", message);
    }

    @Test
    public void testOneWrongNegGuessSituation() {
        String message = game.guess(-5);
        assertEquals("You got it wrong", message);
    }

    @Test
    public void testOneWrongPosGuessSituation() {
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum + 1);
        assertEquals("You got it wrong", message);
    }

    @Test
    public void testRandomNumberGeneration() {
        int[] randomNumbers = new int[11];
        for (int i = 1; i <= 60; i++) {
            int randomNum = new GuessingGame().getRandomNumber();
            randomNumbers[randomNum] = 1;
        }
        int sum = 0;
        for (int j = 0; j < 11; j++) {
            sum += randomNumbers[j];
        }
        assertEquals(10, sum);
    }
}
