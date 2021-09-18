public class Q06_Is {
    /**
     * Convert char to upper case
     * 
     * @param c char to be converted
     * @return character in upper case
     */
    private static char toUpper(char c) {
        return (c >= 'a' && c <= 'z') ? ((char) (c - 32)) : c;
    }

    /**
     * Verify if string has only vowels
     * 
     * @param str string to be verified
     * @return if is String only has vowels return true, else return false
     */
    private static boolean isVowels(String str) {

        for (char c : str.toCharArray()) {
            char tmp = toUpper(c);
            if (tmp != 'A' && tmp != 'E' && tmp != 'I' && tmp != 'O' && tmp != 'U') {
                return false;
            }
        }

        return true;
    }

    /**
     * Verify if string has only consonant
     * 
     * @param string to be verified
     * @return if is String only has consonant return true, else return false
     */
    private static boolean isConsonant(String str) {
        for (char c : str.toCharArray()) {
            char tmp = toUpper(c);
            if (c < 'A' || c > 'Z' || c < 'a' || c > 'z') {
                return false;
            } else if (tmp != 'A' && tmp != 'E' && tmp != 'I' && tmp != 'O' && tmp != 'U') {
                return false;
            }
        }

        return true;
    }

    /**
     * Verify if string is a integer
     * 
     * @param string to be verified
     * @return if is String is integer return true, else return false
     */
    private static boolean isInteger(String str) {
        for (char c : str.toCharArray()) {
            if (c < '0' || c > '9') {
                return false;
            }
        }

        return true;
    }

    /**
     * Verify if string is a number
     * 
     * @param string to be verified
     * @return if is string is a number return true, else return false
     */
    private static boolean isNumber(String str) {
        for (char c : str.toCharArray()) {
            if ((c < '0' || c > '9') && c != '.' ) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String line = new String();

        while (true) {
            line = MyIO.readLine();

            if (line.equals("FIM"))
                return;

            MyIO.print((isConsonant(line) ? "SIM" : "NAO"));
            MyIO.print(' ');
            MyIO.print((isVowels(line) ? "SIM" : "NAO"));
            MyIO.print(' ');
            MyIO.print((isInteger(line) ? "SIM" : "NAO"));
            MyIO.print(' ');
            MyIO.print((isNumber(line) ? "SIM" : "NAO"));
            MyIO.print('\n');
        }
    }
}
