public class Q09 {
    /**
     * Os operadores shift right e left (>> e <<) deslocam os bits para direita e
     * esquerda e inserem um zero na posição vazia. Na prática, temos, uma divisão
     * ou multiplicação por dois.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int x = 23, y = 23;

        /**
         * 23 = 00010111 23 >> = 00001011 = 11 23 << = 00101110 = 46
         */
        x = x << 1;
        y = y >> 1;
        /** Immprime [46 - 11] */
        System.out.println("[" + x + " - " + y + "]");
    }
}
