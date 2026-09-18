//Write a C program to read N and print all the prime numbers between 1 and N. Use loops and conditional statements to check whether each number is prime.
#include <stdio.h>
void main() {
    int N, i, j, isPrime;

    printf("Enter a positive integer N: ");
    scanf("%d", &N);

    printf("Prime numbers between 1 and %d are:\n", N);
    
    for (i = 2; i <= N; i++) {
        isPrime = 1; // Assume the number is prime

        // Check if i is prime
        for (j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                isPrime = 0; // Not prime
                break;
            }
        }

        if (isPrime) {
            printf("%d ", i);
        }
    }
    
    printf("\n");
}