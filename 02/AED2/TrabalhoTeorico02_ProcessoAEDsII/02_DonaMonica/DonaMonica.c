#include <stdio.h>
#include <string.h>

int getAge(int x, int y, int z){
    if (x > y && x > z)
        return x;
    else if (y > x && y > z)
        return y;
    return z;
}

int calcAge(int m, int x, int y){
    return m - (x + y);
}

int main(char **args){
    char line[6];
    int m, x, y, z;

    while (1)
    {
        scanf("%d", &m);

        if (m == 0)
            return 1;

        scanf("%d %d", &x, &y);

        z = calcAge(m, x, y);
        printf("%d\n", getAge(x, y, z));
    }

    return 1;
}
