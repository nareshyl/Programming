// swap two numbers using function
#include<stdio.h>
void swap(int a,int b) {
    int temp;
    temp = a;
    a = b;
    b = temp;
}
int main() {
    int a, b;
    printf("Enter two numbers: ");  
    scanf("%d %d", &a, &b);
    printf("Before swapping: a = %d, b = %d\n", a, b); 
    
    return 0;
}
