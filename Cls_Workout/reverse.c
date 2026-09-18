//Write a C program to read an integer and print its reverse. Example: 12345 → 54321.
#include<stdio.h>
void main(){
    int n,rev=0,rem;
    printf("Enter a number: ");
    scanf("%d",&n);
    while(n!=0){
        rem = n%10;
        rev = rev*10 + rem;
        n = n/10;
    }
  
    printf("Reverse of the number is: %d\n",rev);
}