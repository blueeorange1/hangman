public class Phrase {
    private static String[] words = { "test" };// { "apple", "eighteen", "super", "candle", "river", "giraffe",
                                               // "puzzle",
    // "button",
    // "lemon","rocket","bicyle","shadow","jacket","wry","jazz","jinx","buzz","fizz","fuzzy","jumpy","jumbo",};
    public String chosenWord;
    Game game = new Game();

    public Phrase() {
        randomizeWord();
    }

    public void randomizeWord() {
        chosenWord = words[(int) (Math.random() * words.length)];
    }

    public int[] checkGuess(String charGuess) {
        int[] correctPos = new int[0];
        int checkedLetters = 0;
        char[] letters = chosenWord.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            if (charGuess.equals(String.valueOf(letters[i]))) {
                checkedLetters++;
            }
        }

        if (checkedLetters > 0) {
            correctPos = new int[checkedLetters];
            int posIndex = 0;
            for (int i = 0; i < letters.length; i++) {
                if (charGuess.equals(String.valueOf(letters[i]))) {
                    correctPos[posIndex] = i;
                    posIndex++;
                }
            }
        }

        return correctPos;
    }
}
