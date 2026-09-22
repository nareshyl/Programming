//rotate the array
#include <stdio.h>

int main()
{
    int n, k, i;
    int a[100], temp;

    scanf("%d", &n);

    for(i = 0; i < n; i++)
        scanf("%d", &a[i]);

    scanf("%d", &k);

    k = k % n;

    while(k > 0)
    {
        temp = a[n - 1];

        for(i = n - 1; i > 0; i--)
            a[i] = a[i - 1];

        a[0] = temp;

        k--;
    }

    for(i = 0; i < n; i++)
        printf("%d ", a[i]);

    return 0;
}