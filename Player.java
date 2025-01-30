import java.util.Scanner;

public class Player {
    Scanner usrInput = new Scanner(System.in);

    public void guess(String chosenWord) {
        System.out.println("Guess a letter: ");
        String charGuess = usrInput.nextLine();
        Phrase wordPicker = new Phrase();

        while (Game.wrongGuesses < 7) {
            int[] positions = wordPicker.checkGuess(charGuess);

            if (positions.length > 0) {
                System.out.println("Correct guess!");
                // Add correct guess
            } else {
                System.out.println("Wrong guess!");
                Game.wrongGuesses++;
                System.out.println(Game.losingAskii[Game.wrongGuesses]);
            }

            if (Game.wrongGuesses < 7) {
                System.out.println("Guess a letter: ");
                charGuess = usrInput.nextLine();
            }
        }
    }
}