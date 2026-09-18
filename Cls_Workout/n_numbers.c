//Write a C program to read N and print all numbers from 1 to N using a for loop.
#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
        printf("%d ",i);
    }   

}