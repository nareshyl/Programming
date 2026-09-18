//Write a C program to read an integer and count the number of digits in the number using a while loop.
#include<stdio.h>
void main(){
    int n,count=0;
    printf("Enter a number: ");
    scanf("%d",&n);
    while(n!=0){
        n = n/10;
        count++;
    }
    printf("Number of digits in the number is: %d",count);
}  
