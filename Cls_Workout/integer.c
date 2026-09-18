#include<stdio.h>
void main(){
   int n;
    printf("Enter the integer : ");
    scanf("%d",&n);
    if(n>0){
      printf("%d is a positive integer\n",n);
    }
    else if(n<0){
      printf("%d is a negative integer \n",n);
    }
    else{
      printf("The number is zero\n");
    }
}