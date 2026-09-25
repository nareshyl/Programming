#include <stdio.h>

int main() {
    char str[100];
    int i, length = 0, palindrome = 1;

    scanf("%s", str);

    while (str[length] != '\0') {
        length++;
    }

    for (i = 0; i < length / 2; i++) {
        if (str[i] != str[length - 1 - i]) {
            palindrome = 0;
            break;
        }
    }

    if (palindrome)
        printf("Palindrome");
    else
        printf("Not Palindrome");

    return 0;
}