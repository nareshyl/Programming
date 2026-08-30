// Exercise 1
// Integrated Control Structures

#include <stdio.h>
#include <stdlib.h>

int is_prime(int num)
{
    if (num <= 1)
        return 0;

    for (int i = 2; i * i <= num; i++)
    {
        if (num % i == 0)
            return 0;
    }

    return 1;
}

void fibonacci_series(int n)
{
    int t1 = 0, t2 = 1, nextTerm;

    printf("Fibonacci Series: ");

    for (int i = 1; i <= n; ++i)
    {
        printf("%d ", t1);

        nextTerm = t1 + t2;
        t1 = t2;
        t2 = nextTerm;
    }

    printf("\n");
}

int is_palindrome(int num)
{
    int reversed = 0, original = num;

    while (num != 0)
    {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
    }

    return original == reversed;
}

int main()
{
    int choice, num, n;

    while (1)
    {
        printf("\nMenu:\n");
        printf("1. Check if a number is prime\n");
        printf("2. Generate Fibonacci series upto n terms\n");
        printf("3. Check if a number is palindrome\n");
        printf("4. Exit the program\n");

        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
            case 1:
                printf("Enter a number: ");
                scanf("%d", &num);

                if (is_prime(num))
                    printf("%d is a prime number.\n", num);
                else
                    printf("%d is not a prime number.\n", num);

                break;

            case 2:
                printf("Enter number of terms: ");
                scanf("%d", &n);

                fibonacci_series(n);
                break;

            case 3:
                printf("Enter a number: ");
                scanf("%d", &num);

                if (is_palindrome(num))
                    printf("%d is a palindrome.\n", num);
                else
                    printf("%d is not a palindrome.\n", num);

                break;

            case 4:
                printf("Exiting the program...\n");
                exit(0);

            default:
                printf("Invalid choice! Please try again.\n");
        }
    }

    return 0;
}