public class Q01_Palindromo{ 
  /** if string is Palindrome return true, else return false; */
  private static boolean isPalindrome(String str) { 
      int len = str.length() - 1;     
      for(int i =0; i < len; i++){
        /** If char at position isnt equal its mirror return false*/
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
