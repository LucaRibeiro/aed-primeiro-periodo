public class Q11_RecursivePalindrome {
  /**
   * Verify if string is Palindrome
   * 
   * @param str string to verify
   * @return if string is palindrome return true, else return false
   */
  public static boolean isPalindrome(String str) {
    return isPalindrome(str, 0);
  }

  /**
   * Verify recursively if string is Palindrome
   * 
   * @param str string to verify
   * @param pos position
   * @return if string is palindrome return true, else return false
   */
  private static boolean isPalindrome(String str, int pos) {
    if (pos >= str.length() - 1 - pos)
      return true;
    else if (str.charAt(pos) == str.charAt(str.length() - 1 - pos))
      return isPalindrome(str, pos + 1);

    return false;
  }

  public static void main(String[] args) {
    String str = new String();

    while (true) {
      str = MyIO.readLine();
      if (str.equals("FIM"))
        return;

      System.out.println((isPalindrome(str) ? "SIM" : "NAO"));
    }
  }
}
