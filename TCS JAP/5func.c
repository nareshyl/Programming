//5 functions 
#include <stdio.h>

// Function to find maximum
int findMax(int arr[], int n)
{
    int max = arr[0];

    for (int i = 1; i < n; i++)
    {
        if (arr[i] > max)
            max = arr[i];
    }

    return max;
}

// Function to find minimum
int findMin(int arr[], int n)
{
    int min = arr[0];

    for (int i = 1; i < n; i++)
    {
        if (arr[i] < min)
            min = arr[i];
    }

    return min;
}

// Function to find sum
int findSum(int arr[], int n)
{
    int sum = 0;

    for (int i = 0; i < n; i++)
        sum += arr[i];

    return sum;
}

// Function for binary search
int binarySearch(int arr[], int n, int key)
{
    int low = 0;
    int high = n - 1;

    while (low <= high)
    {
        int mid = (low + high) / 2;

        if (arr[mid] == key)
            return mid;

        if (arr[mid] < key)
            low = mid + 1;
        else
            high = mid - 1;
    }

    return -1;
}

// Function to reverse array
void reverseArray(int arr[], int n)
{
    int temp;

    for (int i = 0; i < n / 2; i++)
    {
        temp = arr[i];
        arr[i] = arr[n - 1 - i];
        arr[n - 1 - i] = temp;
    }
}

// Function for bubble sort
void bubbleSort(int arr[], int n)
{
    int temp;

    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

// Function to display array
void display(int arr[], int n)
{
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);

    printf("\n");
}

int main()
{
    int arr[100], n, key;
    int sum, position;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter array elements:\n");

    for (int i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    // Task 1
    printf("\nMaximum = %d", findMax(arr, n));
    printf("\nMinimum = %d", findMin(arr, n));

    // Task 2
    sum = findSum(arr, n);

    printf("\nSum = %d", sum);
    printf("\nAverage = %.2f", (float)sum / n);

    // Task 5 - Sort first because binary search needs sorted array
    bubbleSort(arr, n);

    printf("\n\nSorted array: ");
    display(arr, n);

    // Task 3
    printf("Enter element to search: ");
    scanf("%d", &key);

    position = binarySearch(arr, n, key);

    if (position != -1)
        printf("Element found at index %d", position);
    else
        printf("Element not found");

    // Task 4
    reverseArray(arr, n);

    printf("\nReversed array: ");
    display(arr, n);

    return 0;
}