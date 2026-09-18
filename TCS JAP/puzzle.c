#include <stdio.h>

int main()
{
    int x = 2, y = 2;
    char direction;
    int steps;

    // Number of commands
    for (int i = 1; i <= 5; i++)
    {
        printf("Enter command %d (U/D/L/R and steps): ", i);
        scanf(" %c %d", &direction, &steps);

        int newX = x;
        int newY = y;

        switch (direction)
        {
            case 'U':
                newX = x - steps;
                break;

            case 'D':
                newX = x + steps;
                break;

            case 'L':
                newY = y - steps;
                break;

            case 'R':
                newY = y + steps;
                break;

            default:
                printf("Invalid direction!\n");
                continue;
        }

        // Check grid boundaries
        if (newX >= 0 && newX <= 4 &&
            newY >= 0 && newY <= 4)
        {
            x = newX;
            y = newY;
        }
        else
        {
            printf("Movement ignored - out of bounds.\n");
        }
    }

    printf("\nFinal position: (%d, %d)\n", x, y);

    return 0;
}