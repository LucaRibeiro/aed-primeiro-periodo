import java.util.Scanner;

public class IntNumberSum {

	public static void main(String[] Args) {
		Scanner s = new Scanner(System.in);
		
		int x, y;
		System.out.printf("Informe o primeiro número (x): ");
		x = s.nextInt();
		System.out.printf("Informe o segundo número (y): ");
		y = s.nextInt();
		
		System.out.println(x+y);
		
		s.close();
	}
}
