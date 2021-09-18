/**
 * Leia o nome de dois arquivos e copie o conteúdo do primeiro para o segundo
 * invertendo a ordem dos caracteres. O último caractere no arquivo de entrada
 * será o primeiro do de saída, o penúltimo caractere será o segundo, ...
 */
public class Q09 {
    public static void main(String[] args) {
        String nameArq = s.nextLine();
        Arq.openRead(nameArq);
        String content = Arq.readAll();
        Arq.close();

        String out = "";

        for (char c : content.toCharArray())
            out += c;

        nameArq = s.nextLine();
        Arq.openWrite(nameArq);
        Arq.print(out);
        Arq.close();
    }
}
