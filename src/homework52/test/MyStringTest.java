package homework52.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import homework52.MyString;
import org.junit.jupiter.api.Test;

/**
 * 23/01/2024 myCode * @author Boris Iurciuc (cohort36)
 */
public class MyStringTest {

  @Test
  void isPalindromeWork() {
    String text = "12321";
    boolean actual = MyString.isPalindrome(text);
    String expected = "12321";
    assertTrue(actual, expected);

  }

  @Test
  void isPangramWork() {
    String text = "123456abc";
    boolean actual = MyString.isPangram(text);
    assertTrue(actual, text);
  }

  @Test
  void parseIpWork() {
    String text = "1.1.1.1";
    byte[] expected = {1, 1, 1, 1};
    byte[] actual = MyString.parseIp(text);
    assertArrayEquals(expected, actual);
  }

  @Test
  void parseIpWorkWithMinus() {
    try {
      String text = "1.1.290.-191";
      MyString.parseIp(text);
      fail("There is IP that IP Out Of Bounds < 1 or > 255");
    } catch (IndexOutOfBoundsException e) {
    }
  }

  @Test
  void encryptDecryptWork() {
    String text = "Hallo";
    String actual = MyString.decrypt(MyString.encrypt(text));
    String expected = "Hallo";
    assertEquals(actual, expected, "encrypt - decrypt");
  }

  @Test
  void countOccurrenceWork() {
    String text = "aba ada";
    int actual = MyString.countOccurencies(text, 'a');
    int expected = 4;
    assertEquals(expected, actual, "Occurrence");
  }

  @Test
  void reverseWork() {
    String text = "Hello";
    String actual = MyString.reverse(text);
    String expected = "olleH";
    assertEquals(expected, actual, "reverse");
  }

  @Test
  void wordReverseWork() {
    String text = "Process finished with exit code";
    String actual = MyString.wordReverse(text);
    String expected = "code exit with finished Process";
    assertEquals(expected, actual, "reverse");
  }

  @Test
  void toCamelCaseWork() {
    String text = "Process fINIshed wITH exit Code";
    String actual = MyString.toCamelCase(text);
    String expected = "processFinishedWithExitCode";
    assertEquals(expected, actual, "toCamelCaseWork");
  }
}
