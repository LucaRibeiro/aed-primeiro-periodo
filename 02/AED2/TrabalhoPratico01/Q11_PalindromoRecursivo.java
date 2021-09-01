public class Q11_PalindromoRecursivo{ 
  /** Call isPalindrome setting initial position */
  public static boolean isPalindrome(String str) {
      return isPalindrome(str,0);
  }

/** if string is Palindrome return true, else return false; */
  private static boolean isPalindrome(String str, int pos) {      
      /** Check if position is equal or greather than center of string*/
      if (pos >= str.length()-1-pos)
	      return true;
      /** if char in position is equal its mirrot check next position, else return false*/
      else if(str.charAt(pos) == str.charAt(str.length()-1-pos))
	     return isPalindrome(str, pos+1);

      return false;
  }

  public static void main(String[] args) {
    String str = new String();
    
    while(true){
      str =  MyIO.readLine();
      /** Finish program if input is "FIM" */
      if (str.equals("FIM"))
        return;
        
      System.out.println((isPalindrome(str) ? "SIM": "NAO"));
    }
  }
}
