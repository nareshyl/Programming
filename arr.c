#include <stdio.h>

int main() {
    // Declaration and initialization of an array
    int numbers[5] = {10, 20, 30, 40, 50};
    
    // Accessing elements (O(1) time complexity)
    printf("First element: %d\n", numbers[0]); // Outputs 10
    printf("Third element: %d\n", numbers[2]); // Outputs 30
    
    // Modifying an element
    numbers[1] = 25; 
    
    return 0;
}