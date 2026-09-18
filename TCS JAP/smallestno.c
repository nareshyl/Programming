#include <stdio.h>

int findSmallest(int arr[], int n)
{
    int small = arr[0];

    for (int i = 1; i < n; i++)
    {
        if (arr[i] < small)
            small = arr[i];
    }

    return small;
}

int main()
{
    int arr[100], n;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter elements:\n");
    for (int i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    printf("Smallest element = %d", findSmallest(arr, n));

    return 0;
}