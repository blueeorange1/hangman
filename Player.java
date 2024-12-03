import java.util.Scanner;

public class Player {
    Scanner usrInput = new Scanner(System.in);

    public void go(String chosenWord) {
        Game game = new Game();

        char[] letters = chosenWord.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            System.out.println("Letter '" + letters[i] + "' is at position " + (i + 1));
        }
    }
}
