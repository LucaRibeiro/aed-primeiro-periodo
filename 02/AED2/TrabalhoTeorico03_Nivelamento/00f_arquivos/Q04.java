
/** Leia o nome de um arquivo e uma frase e salve essa frase nesse arquivo */

import java.util.Scanner;
import java.io.*;

public class Q04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nameArq = s.nextLine();
        String str = s.nextLine();
        Arq.openWrite(nameArq);
        Arq.print(str);
        Arq.close();
    }
}
