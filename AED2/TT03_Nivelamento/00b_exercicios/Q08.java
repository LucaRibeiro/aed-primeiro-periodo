public class Q08 {
    /**
     * Imprime todos os números possíveis para is tipos bytes, short, int e long
     * 
     * @param args parâmetros da linha de comando
     */
    public static void main(String[] args) {
        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0;
        while (true) {
            b++;
            s++;
            i++;
            l++;
            System.out.println(b + " " + s + " " + i + " " + l);
        }
    }
}
