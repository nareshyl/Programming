#include <stdio.h>

int isPrime(long long n) {
    if (n < 2)
        return 0;

    for (long long i = 2; i * i <= n; i++) {
        if (n % i == 0)
            return 0;
    }

    return 1;
}

int main() {
    int n;
    scanf("%d", &n);

    long long a[n];

    for (int i = 0; i < n; i++) {
        scanf("%lld", &a[i]);
    }

    // Find the smallest number q
    long long q = a[0];

    for (int i = 1; i < n; i++) {
        if (a[i] < q)
            q = a[i];
    }

    // If p % x = q, then p must be greater than q
    // Start searching from q + 1
    for (long long p = q + 1; p < 10000000000LL; p++) {

        // p must be prime
        if (!isPrime(p))
            continue;

        int valid = 1;

        for (int i = 0; i < n; i++) {

            // q itself is excluded
            if (a[i] == q)
                continue;

            if (p % a[i] != q) {
                valid = 0;
                break;
            }
        }

        if (valid) {
            printf("%lld\n", p);
            return 0;
        }
    }

    printf("None\n");

    return 0;
}