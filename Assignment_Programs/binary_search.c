//Binary Search
#include <stdio.h>

int main()
{
    int n, a[100], key;
    int low, high, mid;
    int found = 0;

    scanf("%d", &n);

    for(int i = 0; i < n; i++)
        scanf("%d", &a[i]);

    scanf("%d", &key);

    low = 0;
    high = n - 1;

    while(low <= high)
    {
        mid = (low + high) / 2;

        if(a[mid] == key)
        {
            printf("Element found at index %d", mid);
            found = 1;
            break;
        }
        else if(a[mid] < key)
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }

    if(found == 0)
        printf("Element not found");

    return 0;
}