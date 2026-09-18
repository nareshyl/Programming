//Write a C program to read a number and print its multiplication table from 1 to 10.
#include<stdio.h>
void main(){
    int n;
    printf("Enter a number: ");
    scanf("%d",&n);
    for(int i=1;i<=10;i++){
        printf("%d x %d = %d\n",n,i,n*i);
    }
}           