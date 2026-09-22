//2. String + Linear Search
#include <stdio.h>

int main()
{
    char str[100], ch;
    int i, found = 0;

    scanf("%s", str);
    scanf(" %c", &ch);

    for(i = 0; str[i] != '\0'; i++)
    {
        if(str[i] == ch)
        {
            printf("Character found at index %d", i);
            found = 1;
            break;
        }
    }

    if(found == 0)
        printf("Character not found");

    return 0;
}