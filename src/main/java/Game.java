public class Game {
  private String mWord;

  public Game(String word) {
    mWord = word;
  }

  public String showWord() {
    return mWord;
  }

  public boolean guessLetter(String letter) {
    if (mWord.indexOf(letter) == -1) {
      return false;
    } else {
      return true;
    }
  }

  public String replaceLetter(String letter) {
    String hiddenWord = "";
    for (int i = 0; i < mWord.length(); i++) {
      hiddenWord = mWord.replaceAll(".", "-");
      if (hiddenWord.indexOf(letter) != -1) {
        hiddenWord = hiddenWord.replaceAll("-", letter);
      }
    }
    return hiddenWord;
  }

}
