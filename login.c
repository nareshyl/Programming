// login Attempts 3
#include <stdio.h>
#include <string.h>

int main()
{
    char username[20], password[20];
    int attempts = 0;

    while (attempts < 3)
    {
        printf("Enter username: ");
        scanf("%s", username);

        printf("Enter password: ");
        scanf("%s", password);

        if (strcmp(username, "admin") == 0 &&
            strcmp(password, "1234") == 0)
        {
            printf("Login successful!\n");
            break;
        }
        else
        {
            attempts++;
            printf("Invalid login!\n");
        }
    }

    if (attempts == 3)
        printf("Account locked. Too many attempts.");

    return 0;
}