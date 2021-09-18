public class Q13_RecursiveCaesarCipher {
	/**
	 * Shift char to 3 position right
	 * 
	 * @param c char to shif
	 * @return char before shift
	 */
	private static char shift(char c) {
		return (char) ((int) c + 3);
	}

	/**
	 * Encode message in Caesar Cipher with 3 shifts
	 * 
	 * @param message string to encode
	 * @return encoded message
	 */
	public static String caesarEncode(String message) {
		StringBuffer messageEncode = new StringBuffer();

		char c = shift(message.charAt(0));
		messageEncode.append(c);

		if (message.length() > 1) {
			messageEncode.append(caesarEncode(message.substring(1)));
		}

		return messageEncode.toString();
	}

	public static void main(String args[]) {
		while (true) {
			String message = MyIO.readLine();

			if (message.equals("FIM"))
				return;

			MyIO.println(caesarEncode(message));
		}
	}
}
