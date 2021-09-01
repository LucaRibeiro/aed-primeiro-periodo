public class Q05 {
    /**
     * Verifica se o caracter é uma vogal (A - E - I - O - U - a - e - i - o - u)
     * @param c caracter para comparar com vogais
     * @return se o caracter é uma vogal, retorna true, se não, false
     */
    boolean doidao(char c) {
        boolean resp = false;
        int v = (int) c;
        if (v == 65 || v == 69 || v == 73 || v == 79 || v == 85 || v == 97 || v == 101 || v == 105 || v == 111
                || v == 117) {
            return resp = true;
        }
        return resp;
    }
}
