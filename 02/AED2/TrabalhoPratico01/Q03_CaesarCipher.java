public class Q03_CaesarCipher {
	/** Shift char 3 positions to right */
   	private static char shift(char c){
   		return (char) ((int)c + 3);
	}

    	/** Receive a message and return it encoded with Caesar Cipher */
    	public static String caesarEncode(String message){
		String encodedMessage = new String();
	    	/** Call shift function to each char in string */
	    	for(char c: message.toCharArray())
        		encodedMessage += shift(c);
        
	    	return encodedMessage;
    	}	

    	public static void main(String args[]) {
    	    	while(true){
        		String message = MyIO.readLine();
			
			/** End program if message is FIM */
        		if (message.equals("FIM"))
          			return;
		       	
			MyIO.println(caesarEncode(message));
		}
	}
}

