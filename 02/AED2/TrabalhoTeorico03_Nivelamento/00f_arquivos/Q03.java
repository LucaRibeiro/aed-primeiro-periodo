import java.io.*;

public class Q03 {
    /**
     * 
     * @throws Exception Prevent exceptions in file operations
     */
    public void ExemploRAF03Cabecote() throws Exception {
        RandomAccessFile raf = new RandomAccessFile("exemplo.txt", "rw");
        raf.writeInt(1);
        raf.writeDouble(5.3);
        raf.writeChar('X');
        raf.writeBoolean(true);
        raf.writeBytes("Algoritmos");
        raf.seek(0); // Return the file pointr to position 0
        System.out.println(raf.readInt()); // Priting the integer
        raf.seek(12); // Setando the file pointer in position 12
        System.out.println(raf.readChar());
        raf.seek(12); // Set file pointer in position 12
        raf.writeChar('@'); // Change the char X to @
        System.out.println(raf.readChar());
        raf.close();
    }

    /**
     * Open file with Random Access then read data
     * 
     * @throws Exception Prevent exceptions in file operations
     */
    public void ExemploArq02Leitura() throws Exception {
        RandomAccessFile raf = new RandomAccessFile("exemplo.txt", "rw");
        int inteiro = raf.readInt();
        double real = raf.readDouble();
        char caractere = raf.readChar();
        boolean boleano = raf.readBoolean();
        String str = raf.readLine();
        raf.close();
        System.out.println(inteiro + " " + real + " " + caractere + " " + boleano + " " + str);
    }

    /**
     * Open file with Random Access then write data
     * 
     * @throws Exception Prevent exceptions in file operations
     */
    public void ExemploRAF01Escrita() throws Exception {
        RandomAccessFile raf = new RandomAccessFile("exemplo.txt", "rw");
        raf.writeInt(1);
        raf.writeDouble(5.3);
        raf.writeChar('X');
        raf.writeBoolean(true);
        raf.writeBytes("Algoritmos");
        raf.close();
    }
}