#include <stdio.h>

int main() {
    char cid[50];
    int units;

    scanf("%s", cid);
    scanf("%d", &units);

    if (units < 0) {
        printf("Invalid input\n");
        return 0;
    }

    double energy;

    if (units <= 100) {
        energy = units * 2;
    }
    else if (units <= 200) {
        energy = 200 + (units - 100) * 3;
    }
    else {
        energy = 500 + (units - 200) * 4;
    }

    double fixed = 100;

    double surcharge;
    if (energy + fixed > 1500) {
        surcharge = (energy + fixed) * 0.05;
    }
    else {
        surcharge = 0;
    }

    double discount;
    if (units < 50) {
        discount = (energy + fixed) * 0.02;
    }
    else {
        discount = 0;
    }

    double bill = energy + fixed + surcharge - discount;

    printf("Customer ID: %s\n", cid);
    printf("Units consumed: %d\n", units);
    printf("Energy charge: %.2f\n", energy);
    printf("Fixed charge: %.2f\n", fixed);
    printf("Surcharge: %.2f\n", surcharge);
    printf("Discount: %.2f\n", discount);
    printf("Final bill: %.2f\n", bill);

    return 0;
}