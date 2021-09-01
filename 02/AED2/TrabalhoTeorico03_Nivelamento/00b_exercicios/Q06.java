public class Q06 {
    /**
     * Converte caracteres para maiusculo
     * 
     * @param c caracter para ser convertido com vogais
     * @return caracter em maiúsculo
     */
    char toUpper(char c) {
        return (c >= 'a' && c <= 'z') ? ((char) (c - 32)) : c;
    }

    /**
     * Verifica se o caracter é uma vogal (A - E - I - O - U - a - e - i - o - u)
     * 
     * @param c caracter para comparar com vogais
     * @return se o caracter é uma vogal, retorna true, se não, false
     */
    boolean isVogal(char c) {
        c = toUpper(c);
        return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

    /**
     * Verifica se o caracter é uma letra
     * 
     * @param c caracter para verificar
     * @return se o caracter é uma letra, retorna true, se não, false
     */
    boolean isLetra(char c) {
        return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
    }

    /**
     * Verifica se o caracter é uma consoante
     * 
     * @param c caracter para comparar com vogais
     * @return se o caracter é uma vogal, retorna true, se não, false
     */
    boolean isConsoante(char c) {
        return (isLetra(c) == true && isVogal(c) == false);
    }

    /**
     * Verifica se a String só contém consoantes
     * @param s string para ser comparado
     * @param i posicao atual para ser verificada
     * @return se a String só contém consoantes, retorna true, se não, false
     */
    boolean isConsoante(String s, int i) {
        boolean resp = true;

        if (i == s.length()) {
            resp = true;
        } else if (isConsoante(s.charAt(i)) == false) {
            resp = false;
        }else {     
            resp = isConsoante(s, i + 1);
        }
        return resp;
    }
}
