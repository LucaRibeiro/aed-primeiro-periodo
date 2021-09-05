import java.io.RandomAccessFile;
import java.io.IOException;

public class Q09_Arquivo {
    public static void main(String[] args) throws IOException {
        String fileName = "Arq.txt";

        RandomAccessFile writer = new RandomAccessFile(fileName, "rw");
        int n = MyIO.readInt();

        for (int i = 0; i < n; i++) {
            writer.seek(i * 8);
            writer.writeDouble(MyIO.readDouble());
        }
        writer.close();

        RandomAccessFile reader = new RandomAccessFile(fileName, "r");

        for (int i = n - 1; i > -1; i--) {
            reader.seek(i * 8);
            double num = reader.readDouble();
            if (num % 1 != 0) {
                MyIO.println(num);
            } else
                MyIO.println((int) num);
        }
        reader.close();
    }
}