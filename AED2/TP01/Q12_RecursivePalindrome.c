#include <stdio.h>
#include <string.h>

int isPalindrome(char* str, int pos, int mirror) {

  if (pos >= mirror)
    return 1;
  else if (str[pos] != str[mirror])
    return 0;
  else if (pos < mirror + 1)
    return isPalindrome(str, pos + 1, mirror - 1);

  return 1;
}


int main() {
  char str[200];

  while (1) {
    fgets(str, sizeof str, stdin);
    str[strcspn(str, "\n")] = 0;

    if (strcmp(str, "FIM") == 0)
      return 0;

    int n = strlen(str) - 1;

    if (n = 0 || isPalindrome(str, 0, n - 1) == 1)
      printf("SIM\n");
    else
      printf("NAO\n");
  }

  return 0;
}
