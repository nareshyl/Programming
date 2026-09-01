// pointers example
/*#include <stdio.h>
int main() {
    int a = 10;
    int *ptr = &a; // pointer to a  
    printf("Value of a: %d\n", a);
    printf("Address of a: %p\n", (void*)&a);
    printf("Value of ptr: %p\n", (void*)ptr);
    printf("Value pointed by ptr: %d\n", *ptr);
    return 0;
}
*/
#include <stdio.h>
int main() {
    int x=10;
    int *ptr = &x;
    printf("Value of x: %d\n", *ptr);
}