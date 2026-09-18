//total & average 
#include <stdio.h>

int main()
{
    int marks[] = {85, 92, 66, 78, 72};
    int total = 0;
    float average;

    for (int i = 0; i < 5; i++)
    {
        total += marks[i];
    }

    average = (float)total / 5;

    printf("Total = %d\n", total);
    printf("Average = %.2f\n", average);

    return 0;
}