public class Phrase {
    private static String[] words = { "apple",
            "beach",
            "cloud",
            "dance",
            "eagle",
            "flute",
            "grape",
            "house",
            "igloo",
            "joker",
            "koala",
            "lemon",
            "maple",
            "night",
            "orbit",
            "pizza",
            "queen",
            "river",
            "storm",
            "tiger" };
    public String chosenWord;
    Game game = new Game();
    private int[] correctPos = new int[0];
    private String[] currentState;

    public Phrase() {
        randomizeWord();
        currentState = new String[chosenWord.length()];
        for (int i = 0; i < chosenWord.length(); i++) {
            currentState[i] = "_";
        }
    }

    public void randomizeWord() {
        chosenWord = words[(int) (Math.random() * words.length)];
    }

    public int[] checkGuess(String charGuess) {
        int checkedLetters = 0;
        char[] letters = chosenWord.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            if (charGuess.equals(String.valueOf(letters[i]))) {
                checkedLetters++;
            }
        }

        correctPos = new int[checkedLetters];
        if (checkedLetters > 0) {
            int posIndex = 0;
            for (int i = 0; i < letters.length; i++) {
                if (charGuess.equals(String.valueOf(letters[i]))) {
                    correctPos[posIndex] = i;
                    currentState[i] = charGuess;
                    posIndex++;
                }
            }
        }

        return correctPos;
    }

    public String[] blankFill(String charGuess) {
        return currentState;
    }
}