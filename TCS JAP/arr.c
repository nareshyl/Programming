#include <stdio.h>

void main() {

    int numbers[5];
    int sum = 0;
    float average;
    int largest, smallest;

    // Input values
    printf("Enter 5 numbers:\n");

    for (int i = 0; i < 5; i++) {
        printf("Number %d: ", i + 1);
        scanf("%d", &numbers[i]);
        sum += numbers[i];
    }

    // Initialize largest and smallest
    largest = numbers[0];
    smallest = numbers[0];

    // Find largest and smallest
    for (int i = 1; i < 5; i++) {
        if (numbers[i] > largest) {
            largest = numbers[i];
        }

        if (numbers[i] < smallest) {
            smallest = numbers[i];
        }
    }

    // Calculate average
    average = (float)sum / 5;

    // Print the array
    printf("\nThe array elements are:\n");

    for (int i = 0; i < 5; i++) {
        printf("%d ", numbers[i]);
    }

    // Print results
    printf("\n\nSum = %d", sum);
    printf("\nAverage = %.2f", average);
    printf("\nLargest number = %d", largest);
    printf("\nSmallest number = %d\n", smallest);

    
}
    
    
