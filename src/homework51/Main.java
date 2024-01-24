package homework51;

import static java.lang.Character.toUpperCase;

/**
 * 22/01/2024 myCode * @author Boris Iurciuc (cohort36)
 */
public class Main {

  static boolean isPalindrome(String word){
    for (int i = 0; i < word.length() / 2; i++) {
      if (word.charAt(i) !=  word.charAt(word.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }
  static boolean isPangram(String sentence) {
    int[] count = new int[255];
    for (int i = 0; i < sentence.length(); i++) {
      if (sentence.charAt(i) != ' ') {
        count[sentence.charAt(i)]++;
      }
      if (count[sentence.charAt(i)] > 1) {
        return false;
      }
    }
    return true;
  }

  public static byte[] parseIp(String ip) {
    String[] numbers = ip.split("\\.");
    byte[] ipByte = new byte[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      ipByte[i] = (byte)Integer.parseInt(numbers[i]);
    }
    return ipByte;
  }

  public static String encrypt(String text) {
    char[] ch = new char[text.length()];
    for (int i = 0; i < text.length(); i++) {
      ch[i] = (char) ((int)text.charAt(i) + 2);
    }
    return String.valueOf(ch);
  }

  public static String decrypt(String data) {
    char[] ch = new char[data.length()];
    for (int i = 0; i < data.length(); i++) {
      ch[i] = (char) ((int)data.charAt(i) - 2);
    }
    return String.valueOf(ch);
  }

  public static int countOccurencies(String text, char letter) {
    int count = 0;
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == letter) {
        count++;
      }
    }
    return count;
  }

  public  static String reverse(String text){
    StringBuilder sb = new StringBuilder(text);
    return  String.valueOf(sb.reverse());
  }

  public static String wordReverse(String text){
    String[] split = text.split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = split.length - 1; i >= 0; i--) {
      text = String.valueOf(sb.append(split[i]).append(" "));
    }
    return text.trim();
  }

  public static String toCamelCase(String text){
    String[] splitText = text.toLowerCase().split(" ");
    StringBuilder sb = new StringBuilder(splitText[0]);
    for (int i = 1; i < splitText.length; i++) {
      sb.append(toUpperCase(splitText[i].charAt(0))).append(splitText[i].substring(1));
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    String word = "a12321a";
    System.out.print("isPalindrome '" + word + "' ? -> ");
    System.out.println(isPalindrome(word));

    String sentence = "123 45 67 89 abcde";
    System.out.print("isPangram '" + sentence + "' ? -> ");
    System.out.println(isPangram(sentence));

    String ip = "77.166.21.33";
    System.out.print("parseIp '" + ip + "'  -> ");
    for (int i = 0; i < 4; i++) {
      System.out.print(parseIp(ip)[i] + " ");
    }

    String text = "Hallo";
    System.out.print("\nencrypt '" + text + "'  -> ");
    System.out.println(encrypt(text));


    String data = "Jcnnq";
    System.out.print("decrypt '" + data + "'  -> ");
    System.out.println(decrypt(data));

    text = "executing post-compile tasks";
    char letter = 'e';
    System.out.println("Occurencies of letter " + letter + " is " + countOccurencies(text, letter));

    text = "Adding pattern assertions";
    System.out.print("reverse '" + text + "'  -> ");
    System.out.println(reverse(text));

    text = "Connected to the target";
    System.out.print("wordReverse '" + text + "'  -> ");
    System.out.println(wordReverse(text));

    text = "What a BEAUTIFUL day";
    System.out.print("wordReverse '" + text + "'  -> ");
    System.out.println(toCamelCase(text));
  }
}
