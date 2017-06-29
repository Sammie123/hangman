import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {

  @Test
  public void showWord_returnTheWord_word() {
    Game hangman = new Game("lincoln");
    assertEquals("lincoln", hangman.showWord());
  }

  @Test
  public void showLetter_ifLetterIsCorrect_true() {
    Game hangman = new Game("lincoln");
    assertEquals(true, hangman.guessLetter("l"));
  }

  @Test
  public void showLetter_ifLetterIsNotCorrect_false(){
    Game hangman = new Game("lincoln");
    assertEquals(false, hangman.guessLetter("z"));
  }

  @Test
  public void showLetter_replaceLettersWithDash_dash(){
    Game hangman = new Game("lincoln");
    assertEquals("-------", hangman.replaceLetter(" "));
  }

  @Test
  public void showLetter_replaceDashWithLetter_letter(){
    Game hangman = new Game("lincoln");
    assertEquals("l----l-", hangman.replaceLetter("l"));
  }


}
