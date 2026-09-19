#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    long long a[n];

    for (int i = 0; i < n; i++) {
        scanf("%lld", &a[i]);
    }

    long long leftSum = 0;
    long long rightSum = 0;
    long long total = 0;

    for (int i = 0; i < n; i++) {
        total += a[i];
    }

    /*
       The current player can choose a consecutive group
       from either the left side or the right side.

       We calculate the best possible score difference
       using interval game DP.
    */

    long long dp[n];

    dp[0] = a[0];

    for (int i = 1; i < n; i++) {
        dp[i] = dp[i - 1] + a[i];
    }

    /*
       For this game, selecting a prefix or suffix means
       the remaining elements form one continuous segment.
    */

    long long best = -9223372036854775807LL;

    for (int i = 0; i < n; i++) {
        long long prefix = dp[i];
        long long suffix = total - dp[i];

        long long diff1 = prefix - suffix;
        long long diff2 = suffix - prefix;

        if (diff1 > best)
            best = diff1;

        if (diff2 > best)
            best = diff2;
    }

    printf("%lld\n", best);

    return 0;
}
