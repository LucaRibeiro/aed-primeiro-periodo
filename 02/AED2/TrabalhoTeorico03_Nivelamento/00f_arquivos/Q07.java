/** Leia o nome de dois arquivos e copie o conteúdo do primeiro para o último */
public class Q07 {
    public static void main(String[] args) {
        String nameArq = s.nextLine();
        Arq.openRead(nameArq);
        String content = Arq.readAll();
        Arq.close();

        nameArq = s.nextLine();
        Arq.openWrite(nameArq);
        Arq.print(content);
        Arq.close();
    }
}
