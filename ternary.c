// using ternary operator find the delivery charge for specific if the order amount is less than Rs1000, the delivery charge is 100,otherwise it is free . Assign the result 
#include <stdio.h>

int main()
{
    float order = 1000;
    int delivery;

    delivery = order > 1000 ? 100 : 0;

    printf("Delivery charge = Rs.%d", delivery);

    return 0;
}