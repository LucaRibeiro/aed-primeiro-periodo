/** Leia o nome de um arquivo e mostre seu conteúdo na tela */
public class Q05 {
    public static void main(String[] args) {
        String nameArq = s.nextLine();
        Arq.openRead(nameArq);
        System.out.println(Arq.readAll());
        Arq.close();
    }
}
