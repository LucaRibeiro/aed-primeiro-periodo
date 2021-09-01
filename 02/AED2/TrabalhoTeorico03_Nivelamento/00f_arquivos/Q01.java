public class Q01 {

    // Arquivo ExemploArq01Escrita.javaclass
    public void readArq(String[] args) {
        Arq.openWrite("exemplo.txt");
        Arq.println(1);
        Arq.println(5.3);
        Arq.println('X');
        Arq.println(true);
        Arq.println("Algoritmos");
        Arq.close();
    }

    public void writeArq(String[] args) {
        Arq.openRead("exemplo.txt");

        int inteiro = Arq.readInt();
        double real = Arq.readDouble();
        char caractere = Arq.readChar();
        boolean boleano = Arq.readBoolean();
        String str = Arq.readString();

        Arq.close();

        System.out.println("inteiro: " + inteiro);
        System.out.println("real: " + real);
        System.out.println("caractere: " + caractere);
        System.out.println("boleano: " + boleano);
        System.out.println("str: " + str);
    }

}
