#include <stdio.h>
#include <string.h>
#include <ctype.h>

/**
 * Convert char to upper case
 *
 * @param c char to be converted
 * @return character in upper case
 */
char toUpper(char c) {
    if (c >= 'a' && c <= 'z')
        return (char)(c - 32);

    return c;
}


int isVogal(char* str) {
    int ret = 1;

    for (int i = 0; i < strlen(str) - 1; i++) {
        char c = toUpper(str[i]);
        if (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
            ret = 0;
        }
    }
    return ret;
}

/**
 * Verify if string has only consonant
 *
 * @param string to be verified
 * @return if is String only has consonant return true, else return false
 */
int isConsoante(char* str) {
    int ret = 1;

    for (int i = 0; i < strlen(str) - 1; i++) {
        int c = (int)toUpper(str[i]);
        if (c < 48 || c > 'Z') {
            ret = 0;
        }
        else if (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
            ret = 0;
        }
    }
    return ret;
}

/**
 * Verify if string is a integer
 *
 * @param string to be verified
 * @return if is String is integer return true, else return false
 */
int isInteger(char* str) {
    int ret = 1;
    for (int i = 0; i < strlen(str) - 1; i++) {
        if ((int)str[i] < 47 || (int)str[i] > 57)
            ret = 0;
    }
    return ret;
}

/**
 * Verify if string is a number
 *
 * @param string to be verified
 * @return if is string is a number return true, else return false
 */
int isNumber(char* str) {
    int ret = 1;
    int cnt = 0;

    for (int i = 0; i < strlen(str) - 1; i++) {
        if (((int)str[i] < 47 && (int)str[i] != ',' && (int)str[i] != '.') || (int)str[i] > 57)
            ret = 0;
        if ((int)str[i] == '.' || (int)str[i] == ',')
            ++cnt;
    }
    if (cnt > 1)
        ret = 0;

    return ret;
}

int main(char argc, char* argv[]) {
    char line[100];

    while (1) {
        fgets(line, sizeof line, stdin);

        if (line[0] == 'F' && line[1] == 'I' & line[2] == 'M')
            return 0;

        if (isConsoante(line) == 1)
            printf("SIM ");
        else
            printf("NAO ");

        if (isVogal(line) == 1)
            printf("SIM ");
        else
            printf("NAO ");

        if (isInteger(line) == 1)
            printf("SIM ");
        else
            printf("NAO ");

        if (isNumber(line) == 1)
            printf("SIM\n");
        else
            printf("NAO\n");

    }
    return 1;
}