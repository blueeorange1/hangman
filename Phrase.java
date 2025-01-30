public class Phrase {
    private static String[] words = { "test" };
    public String chosenWord;
    Game game = new Game();
    private int[] correctPos;

    public Phrase() {
        randomizeWord();
    }

    public void randomizeWord() {
        chosenWord = words[(int) (Math.random() * words.length)];
    }

    public int[] checkGuess(String charGuess) {
        correctPos = new int[0];
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

    public String[] blankFill(String charGuess) {
        String[] blanks = new String[chosenWord.length()];

        for (int i = 0; i < chosenWord.length(); i++) {
            blanks[i] = "_";
        }

        for (int pos : correctPos) { // Just learned this :)
            blanks[pos] = charGuess;
        }

        return blanks;
    }
}