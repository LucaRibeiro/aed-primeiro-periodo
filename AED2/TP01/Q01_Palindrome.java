public class Q01_Palindrome{
  /**
   * Verify if string is Palindrome
   * @param str string to verify
   * @return if string is palindrome return true, else return false
   */
  private static boolean isPalindrome(String str) { 
      int len = str.length() - 1;     
      for(int i =0; i < len; i++){
        if (str.charAt(i) != str.charAt(len - i))
	        return false;
      }
      return true;
  }

  public static void main(String[] args) {
    String str = new String(); 
    
    while(true){
      str = MyIO.readLine();
      
      if (str.equals("FIM"))
        return;
        
      MyIO.println((isPalindrome(str) ? "SIM": "NAO"));
    }
  }
}
