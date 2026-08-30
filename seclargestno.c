#include <stdio.h>

int secondLargest(int arr[], int n)
{
    int largest, second;

    largest = arr[0];
    second = arr[1];

    if (second > largest)
    {
        int temp = largest;
        largest = second;
        second = temp;
    }

    for (int i = 2; i < n; i++)
    {
        if (arr[i] > largest)
        {
            second = largest;
            largest = arr[i];
        }
        else if (arr[i] > second && arr[i] != largest)
        {
            second = arr[i];
        }
    }

    return second;
}

int main()
{
    int arr[100], n;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter elements:\n");
    for (int i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    printf("Second largest element = %d", secondLargest(arr, n));

    return 0;
}