
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
        System.out.println("Welcome to hangman. \n" + losingAskii[wrongGuesses] + "\n");
        System.out.print("Your word:  ");
        for (int i = 0; i < wordPicker.chosenWord.length(); i++) {
            System.out.print("_ ");
        }
        System.out.println();
        player.guess(wordPicker.chosenWord);
    }
}