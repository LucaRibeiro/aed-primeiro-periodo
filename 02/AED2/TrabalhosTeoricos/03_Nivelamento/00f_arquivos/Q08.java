/**
 * Leia o nome de dois arquivos, abra o primeiro, converta seu conteúdo para
 * letra maiúscula e salve o no segundo
 */
public class Q08 {

    private static char toUpper(char c) {
        return (c >= 'a' && c <= 'z') ? ((char) (c - 32)) : c;
    }

    public static void main(String[] args) {
        String nameArq = s.nextLine();
        Arq.openRead(nameArq);
        String content = Arq.readAll();
        Arq.close();

        for (char c : content.toCharArray())
            out += toUpper(c);

        Arq.openWrite(nameArq);
        Arq.print(out);
        Arq.close();

    }
}
