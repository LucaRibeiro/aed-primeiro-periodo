/**
 * Leia o nome de um arquivo contendo uma mensagem criptografada com o
 * Ciframento de César (k = 3), descriptografe a mensagem e mostre-a na tela
 */
public class Q11 {
    public static void main(String[] args) {
        String nameArq = s.nextLine();
        Arq.openRead(nameArq);
        String content = Arq.readAll();
        Arq.close();

        String out = "";

        for (char c : content.toCharArray())
            out += (char) (content.charAt(i) - 3);

        System.out.printf(out);
    }
}
