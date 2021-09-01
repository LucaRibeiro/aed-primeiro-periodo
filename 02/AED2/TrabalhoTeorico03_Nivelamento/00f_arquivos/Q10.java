
/**
 * Leia o nome de um arquivo e mostre na tela o conteúdo desse arquivo
 * criptografado usando o ciframento de César (k = 3)
 */
public class Q10 {
    public static void main(String[] args) {
        String nameArq = s.nextLine();
        Arq.openRead(nameArq);
        String content = Arq.readAll();
        Arq.close();

        String out = "";

        for (char c : content.toCharArray())
            out += (char) (content.charAt(i) + 3);

        System.out.printf(out);
    }
}
