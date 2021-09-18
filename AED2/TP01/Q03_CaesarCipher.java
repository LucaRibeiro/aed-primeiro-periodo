public class Q03_CaesarCipher {
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
		String encodedMessage = new String();
		for (char c : message.toCharArray())
			encodedMessage += shift(c);

		return encodedMessage;
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
