package com.subhayan.game;

import java.util.Random;

public class GuessingGame {

    private final int randomNumber = new Random().nextInt(10) + 1;
    private int counter = 0;

    public String guess(int guessedNumber) {
        counter++;
        String tryText = counter == 1 ? "try" : "tries";
        String winningMsg = String.format("You got it in %d %s", counter, tryText);
        String loosingMsg = "You guessed wrong.";
        String response = null;
        String tooLowHighText = null;

        if ((counter == 4) && (guessedNumber != getRandomNumber()))
            response = String.format("You guessed wrong! And you've had %d %s. GAME OVER!!", counter, tryText);
        else if (counter > 4) {
            response = "Sorry you're limited to 4 tries. Your game is over!";
        }
        else {
            if (guessedNumber < getRandomNumber())
                tooLowHighText = " You're too low.";
            else if (guessedNumber > getRandomNumber())
                tooLowHighText = " You're too high.";
            else
                tooLowHighText = "";
            response = guessedNumber == getRandomNumber() ? winningMsg : loosingMsg + tooLowHighText;
        }

        return response;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        boolean loopContinue = true;
        do {
            String input = System.console().readLine("Enter a number: ");
            if ("q".equals(input)) {
                return;
            }
            String output = game.guess(Integer.parseInt(input));
            System.out.println(output);
            if (output.contains("You got it") || output.contains("over") || output.contains("OVER")) {
                loopContinue = false;
            }
        } while (loopContinue);
    }
}
