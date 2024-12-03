
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
    static String[] words = { "apple", "eighteen", "super", "candle", "river", "giraffe", "puzzle", "button", "lemon",
            "rocket", "bicyle", "shadow", "jacket" };

    public static void main(String[] args) {
        String chosenWord = words[random.nextInt(13)];
        System.out.println("Welcome to hangman. \n" + losingAskii[0] + "\n");
        System.out.print("Your word:  ");
        for (int i = 0; i < chosenWord.length(); i++) {
            System.out.print("_ ");
        }
        System.out.println();
        player.go(chosenWord);
    }
}