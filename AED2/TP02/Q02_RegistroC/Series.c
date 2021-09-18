#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Series {
    char name[80];
    char format[80];
    char duration[80];
    char initialCountry[80];
    char originalLang[80];
    char broadcasterInitial[80];
    char streamingInitial[80];
    int numberSeasons;
    int numberEpisodes;
};

void printSerie(struct Series serie) {
    printf("%s %s %s %s %s %s %s %d %d", serie.name, serie.format, serie.duration, serie.initialCountry, serie.originalLang, serie.broadcasterInitial, serie.streamingInitial, serie.numberSeasons, serie.numberEpisodes);
}

void removeTags(char* line) {
    char newLine[80];
    int i = 0, j = 0;
    while (i < strlen(line)) {
        if (line[i] == '<') {
            i++;
            while (line[i] != '>')
                i++;
        }
        else {
            newLine[j] = line[i];
            j++;
        }
        i++;
    }
    while (newLine[j] == ' ' || newLine[j] == '\n')
        j--;
    newLine[--j] == '\0';
    printf("%i\n", newLine[j]);
}

struct Series readData(char* filePath) {
    struct Series serie;

    FILE* fp = fopen(filePath, "r");
    char line[500];


    if (fp == NULL) {
        printf("File not fount.\n");
        exit(EXIT_FAILURE);
    }


    char tmp = ' ';
    int j = 0;
    for (int i = 0; tmp != '\0'; tmp = filePath[++i]) {
        // printf("%d - %c\n", i, tmp);
        if (tmp == '/') {
            j = 0;
        }
        else {
            serie.name[j] = tmp;
            serie.name[j + 1] = '\0';
            j++;
        }
    }
    printf("%s\n", serie.name);

    while (fgets(line, 500, fp)) {
        if (strstr(line, "Formato") != NULL) {
            fgets(line, 500, fp);
            removeTags(line);
            break;
        }
    }

    while (fgets(line, 500, fp)) {
        if (strstr(line, "Duração") != NULL) {
            fgets(line, 500, fp);
            removeTags(line);
            break;
        }
    }

    while (fgets(line, 500, fp)) {
        if (strstr(line, "País de origem") != NULL) {
            fgets(line, 500, fp);
            removeTags(line);
            break;
        }
    }

    while (fgets(line, 500, fp)) {
        if (strstr(line, "Idioma original") != NULL) {
            fgets(line, 500, fp);
            removeTags(line);
            break;
        }
    }

    while (fgets(line, 500, fp)) {
        if (strstr(line, "Emissora de televisão original") != NULL) {
            fgets(line, 500, fp);
            removeTags(line);
        }
    }

    // while (fgets(line, 500, fp)) {
    //     if (strstr(line, "temporadas") != NULL) {
    //         fgets(line, 500, fp);
    //     }
    // }

    // while (fgets(line, 500, fp)) {
    //     if (strstr(line, "episódios") != NULL) {
    //         fgets(line, 500, fp);
    //         printf("%s\n", line);
    //         break;
    //     }
    //     // serie.numberEpisodes = (int)serie.removeTags(file.readLine()).split(" ")[0]);
    // }

    fclose(fp);

    return serie;
}

int main(int argc, char const* argv[]) {
    struct Series seriesList[100];

    char input[80];
    fgets(input, 100, stdin);
    input[strcspn(input, "\r\n")] = 0;

    int count = 0;
    while (strcmp(input, "FIM") != 0) {
        char filePath[100];
        strcpy(filePath, "/tmp/series/");
        strcat(filePath, input);

        seriesList[count] = readData(filePath);

        count++;
        fgets(input, 100, stdin);
        input[strcspn(input, "\r\n")] = 0;
    }

    for (int i = 0; i < count; i++)
        printSerie(seriesList[i]);

    return 0;
}
