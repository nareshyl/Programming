#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/* Swap two elements */
void swap(void *a, void *b, size_t size)
{
    void *temp = malloc(size);

    memcpy(temp, a, size);
    memcpy(a, b, size);
    memcpy(b, temp, size);

    free(temp);
}

/* Generic QuickSort */
void quickSort(void *arr, int low, int high, size_t size,
               int (*compare)(const void *, const void *))
{
    if (low >= high)
        return;

    int i = low;
    int j = high;

    void *pivot = malloc(size);
    memcpy(pivot, (char *)arr + ((low + high) / 2) * size, size);

    while (i <= j)
    {
        while (compare((char *)arr + i * size, pivot) < 0)
            i++;

        while (compare((char *)arr + j * size, pivot) > 0)
            j--;

        if (i <= j)
        {
            swap((char *)arr + i * size,
                 (char *)arr + j * size, size);

            i++;
            j--;
        }
    }

    free(pivot);

    if (low < j)
        quickSort(arr, low, j, size, compare);

    if (i < high)
        quickSort(arr, i, high, size, compare);
}

/* Compare integers */
int compareInt(const void *a, const void *b)
{
    int x = *(int *)a;
    int y = *(int *)b;

    return (x > y) - (x < y);
}

/* Compare floats */
int compareFloat(const void *a, const void *b)
{
    float x = *(float *)a;
    float y = *(float *)b;

    return (x > y) - (x < y);
}

/* Main function */
int main()
{
    int numbers[] = {50, 20, 40, 10, 30};
    int n = 5;

    float values[] = {3.5, 1.2, 5.6, 2.1, 4.8};
    int m = 5;

    /* Sort integer array */
    quickSort(numbers, 0, n - 1,
              sizeof(int), compareInt);

    printf("Sorted integers:\n");

    for (int i = 0; i < n; i++)
        printf("%d ", numbers[i]);

    /* Sort float array */
    quickSort(values, 0, m - 1,
              sizeof(float), compareFloat);

    printf("\n\nSorted floats:\n");

    for (int i = 0; i < m; i++)
        printf("%.1f ", values[i]);

    return 0;
}