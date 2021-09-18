import java.util.Scanner;

public class Palindromo{ 

  public static boolean isPalindrome(String str) {
      return isPalindrome(str,0);
  }

  private static boolean isPalindrome(String str, int pos) {      
      if (pos >= str.length()-1-pos)
	      return true;
      else if(str.charAt(pos) == str.charAt(str.length()-1-pos))
	     return isPalindrome(str, pos+1);
      
      return false;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str;
    
    while(true){
      str = s.nextLine();
      
      if (str.equals("FIM"))
        return;
        
      System.out.println((isPalindrome(str) ? "SIM": "NAO"));
    }
  }
}
