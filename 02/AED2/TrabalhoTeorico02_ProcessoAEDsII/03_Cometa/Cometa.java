import java.util.Scanner;

public class Cometa {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int year, next, term = 75;

		while (true) {
			year = s.nextInt();
			if (year == 0)
				break;
			for (next = 1986; next <= year; next += term)
				;
			System.out.println(next + 2);
		}
	}
}
