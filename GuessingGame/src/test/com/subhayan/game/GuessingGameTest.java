package com.subhayan.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessingGameTest {

    public static final int GAME_RANDOMNESS_RETRIES = 60;
    private GuessingGame game;

    @BeforeEach
    void setUp() {
        game = new GuessingGame();
    }

    @Test
    public void testSimpleWinSituation() {
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum);
        assertEquals("You got it in 1 try", message);
    }

    @Test
    public void testOneWrongNegGuessSituation() {
        String message = game.guess(-5);
        assertEquals("You guessed wrong. You're too low.", message);
    }

    @Test
    public void testOneWrongPosGuessSituation() {
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum + 1);
        assertEquals("You guessed wrong. You're too high.", message);
    }

    @Test
    public void testRandomNumberGeneration() {
        int[] randomNumbers = new int[11];
        for (int i = 1; i <= GAME_RANDOMNESS_RETRIES; i++) {
            int randomNum = new GuessingGame().getRandomNumber();
            randomNumbers[randomNum] = 1;
        }
        int sum = 0;
        for (int j = 0; j < 11; j++) {
            sum += randomNumbers[j];
        }
        assertEquals(10, sum);
    }

    @Test
    public void testFourWrongGuesses() {
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        String message = game.guess(-3);
        assertEquals("You guessed wrong! And you've had 4 tries. GAME OVER!!", message);
    }

    @Test
    public void testTenWrongGuesses() {
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        String message = game.guess(-3);
        assertEquals("Sorry you're limited to 4 tries. Your game is over!", message);
    }

    @Test
    public void testThreeWrongGuessesAndOneCorrect() {
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        int correctNumber = game.getRandomNumber();
        String message = game.guess(correctNumber);
        assertEquals("You got it in 4 tries", message);
    }

    @Test
    public void testTwoWrongGuessesAndOneCorrect() {
        game.guess(-3);
        game.guess(-3);
        int correctNumber = game.getRandomNumber();
        String message = game.guess(correctNumber);
        assertEquals("You got it in 3 tries", message);
    }
}
