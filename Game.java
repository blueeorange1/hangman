
import java.util.Random;

public class Game {
    static Random random = new Random();
    static Player player = new Player();
    static String[] losingAskii = { "  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========",
            "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n=========" };

    public static int wrongGuesses = 0;

    public static void main(String[] args) {
        Phrase wordPicker = new Phrase();
        String blanks = "";
        System.out.println("Welcome to hangman. \n" + losingAskii[wrongGuesses] + "\n");
        System.out.print("Your word:  ");
        String[] initialState = wordPicker.blankFill("");
        System.out.println(String.join(" ", initialState));
        System.out.println();
        player.guess(wordPicker.chosenWord);
    }

}