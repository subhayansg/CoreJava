package com.subhayan.game;

import java.util.Random;

public class GuessingGame {

    private final int randomNumber = new Random().nextInt(10) + 1;
    public String guess(int guessedNumber) {
        return guessedNumber == getRandomNumber() ? "You got it" : "You got it wrong";
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}
