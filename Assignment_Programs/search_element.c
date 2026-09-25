#include <stdio.h>

int main() {
    int n, i, search, found = 0;

    scanf("%d", &n);

    int a[n];

    for (i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    scanf("%d", &search);

    for (i = 0; i < n; i++) {
        if (a[i] == search) {
            printf("Element found at index %d", i);
            found = 1;
            break;
        }
    }

    if (found == 0) {
        printf("Element not found");
    }

    return 0;
}