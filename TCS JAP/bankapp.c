#include <stdio.h>

int main()
{
    int choice;
    float balance = 1000;
    float amount;

    do
    {
        printf("\n--- Banking App ---\n");
        printf("1. Check Balance\n");
        printf("2. Deposit Money\n");
        printf("3. Withdraw Money\n");
        printf("4. Exit\n");

        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice)
        {
            case 1:
                printf("Balance = %.2f\n", balance);
                break;

            case 2:
                printf("Enter deposit amount: ");
                scanf("%f", &amount);

                balance += amount;
                printf("Money deposited successfully.\n");
                break;

            case 3:
                printf("Enter withdrawal amount: ");
                scanf("%f", &amount);

                if (amount <= balance)
                {
                    balance -= amount;
                    printf("Money withdrawn successfully.\n");
                }
                else
                {
                    printf("Insufficient balance.\n");
                }
                break;

            case 4:
                printf("Thank you for using the banking app.\n");
                break;

            default:
                printf("Invalid choice.\n");
        }

    } while (choice != 4);

    return 0;
}