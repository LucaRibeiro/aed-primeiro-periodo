/**
 * Leia o nome de um arquivo e mostre seu conteúdo convertido para letras
 * maiúsculas
 */
public class Q06 {

    private static char toUpper(char c) {
        return (c >= 'a' && c <= 'z') ? ((char) (c - 32)) : c;
    }

    public static void main(String[] args) {
        String nameArq = s.nextLine();
        Arq.openRead(nameArq);
        String content = Arq.readAll();
        Arq.close();

        String out = "";

        for (char c : content.toCharArray())
            out += toUpper(c);

        System.out.print(out);
    }
}
