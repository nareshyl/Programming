//Write a C program using nested loops to print multiplication tables from 1 to 5, with each table containing values from 1 to 10.
#include<stdio.h>
void main() {
    int i, j;
    for(i = 1; i <= 5; i++) {
        printf("Multiplication Table for %d:\n", i);
        for(j = 1; j <= 10; j++) {
            printf("%d x %d = %d\n", i, j, i * j);
        }
        printf("\n"); // Print a new line after each table
    }
}