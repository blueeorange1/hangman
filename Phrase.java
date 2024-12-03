public class Phrase {
    private static String[] words = { "apple", "eighteen", "super", "candle", "river", "giraffe", "puzzle", "button",
            "lemon",
            "rocket", "bicyle", "shadow", "jacket" };
    public String chosenWord;
    Game game = new Game();

    public Phrase() {
        randomizeWord();
    }

    public void randomizeWord() {
        chosenWord = words[(int) (Math.random() * words.length)];
    }

    public void checkGuess(String charGuess) {

        char[] letters = chosenWord.toCharArray();
        for (int i = 0; i < letters.length; i++) {

            System.out.println("Letter '" + letters[i] + "' is at position " + (i + 1));
            if (charGuess.equals(String.valueOf(letters[i]))) {
                System.out.println(letters[i]);

            } else {
                game.wrongGuesses++;
            }
        }
    }
}
