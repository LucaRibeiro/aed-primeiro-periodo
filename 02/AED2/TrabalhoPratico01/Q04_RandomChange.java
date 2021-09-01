import java.util.Random;

public class Q04_RandomChange {

	private static String swapChar(String str) {
		Random gerador = new Random();
		gerador.setSeed(4);

		char x = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
		char y = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));

		char charArray[] = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == x)
				charArray[i] = y;
		}

		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		String line = new String();

		while (true) {
			line = MyIO.readLine();

			if (line.equals("FIM"))
				return;

			MyIO.println(swapChar(line));
		}
	}
}
