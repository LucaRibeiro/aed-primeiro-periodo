public class Q02 {
    /**
     * Abre um arquivo e cria uma cópia
     * 
     * @param args
     * @return
     */
    public static void main(String[] args) {
        Arq.openRead("exemplo.txt");
        String content = Arq.readAll();
        Arq.close();
        Arq.openWrite("copia.txt");
        Arq.print(content);
        Arq.close();
    }
}
