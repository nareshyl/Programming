#include <stdio.h>

void circularShift(int arr[], int n, int shift)
{
    int temp;

    for (int s = 0; s < shift; s++)
    {
        temp = arr[n - 1];

        for (int i = n - 1; i > 0; i--)
        {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;
    }
}

int main()
{
    int arr[100], n, shift;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter elements:\n");
    for (int i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    printf("Enter shift value: ");
    scanf("%d", &shift);

    circularShift(arr, n, shift);

    printf("Array after circular shift:\n");
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);

    return 0;
}