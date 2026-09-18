#include <stdio.h>
#include <string.h>
#include <ctype.h>

// Function to input string
void inputString(char str[])
{
    printf("Enter a string: ");
    fgets(str, 100, stdin);

    // Remove newline
    str[strcspn(str, "\n")] = '\0';
}

// Function to display string
void displayString(char str[])
{
    printf("String: %s\n", str);
}

// Function to count vowels
int countVowels(char str[])
{
    int count = 0;

    for (int i = 0; str[i] != '\0'; i++)
    {
        char ch = tolower(str[i]);

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u')
        {
            count++;
        }
    }

    return count;
}

// Function to count consonants
int countConsonants(char str[])
{
    int count = 0;

    for (int i = 0; str[i] != '\0'; i++)
    {
        if (isalpha(str[i]))
        {
            char ch = tolower(str[i]);

            if (ch != 'a' && ch != 'e' && ch != 'i' &&
                ch != 'o' && ch != 'u')
            {
                count++;
            }
        }
    }

    return count;
}

// Function to reverse string
void reverseString(char str[])
{
    int i = 0;
    int j = strlen(str) - 1;
    char temp;

    while (i < j)
    {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;

        i++;
        j--;
    }
}

// Function to convert to uppercase
void toUpperCase(char str[])
{
    for (int i = 0; str[i] != '\0'; i++)
    {
        str[i] = toupper(str[i]);
    }
}

// Function to convert to lowercase
void toLowerCase(char str[])
{
    for (int i = 0; str[i] != '\0'; i++)
    {
        str[i] = tolower(str[i]);
    }
}

int main()
{
    char str[100];

    // Input
    inputString(str);

    // Display
    displayString(str);

    // Count vowels and consonants
    printf("Number of vowels = %d\n", countVowels(str));
    printf("Number of consonants = %d\n", countConsonants(str));

    // Reverse
    reverseString(str);
    printf("Reversed string: %s\n", str);

    // Uppercase
    toUpperCase(str);
    printf("Uppercase: %s\n", str);

    // Lowercase
    toLowerCase(str);
    printf("Lowercase: %s\n", str);

    return 0;
}