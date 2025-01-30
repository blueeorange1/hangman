import java.util.Scanner;

public class Player {
    Scanner usrInput = new Scanner(System.in);

    public void guess(String chosenWord) {
        System.out.println("Guess a letter: ");
        String charGuess = usrInput.nextLine();
        Phrase wordPicker = new Phrase();
        boolean hasWon = false;

        while (Game.wrongGuesses < 7 && !hasWon) {
            int[] positions = wordPicker.checkGuess(charGuess);
            String[] currentDisplay = wordPicker.blankFill(charGuess);

            if (positions.length > 0) {
                System.out.println("Correct guess!");

            } else if (Game.wrongGuesses < 5) {
                System.out.println("Wrong guess!");
                Game.wrongGuesses++;
                System.out.println(Game.losingAskii[Game.wrongGuesses]);
            } else {
                System.out.println(Game.losingAskii[6]);
                System.out.println("Game ovr! The word was: " + chosenWord);
                break;
            }

            for (String letter : currentDisplay) {
                if (letter.equals("_")) {
                    hasWon = false;
                    break;
                } else {
                    hasWon = true;
                }
            }
            System.out.println("Word: " + String.join(" ", currentDisplay)); // This is slick

            System.out.println("Guess a letter: ");
            charGuess = usrInput.nextLine();
        }
        if (hasWon) {
            System.out.println("You won!");
        }
    }
}