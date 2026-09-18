#include <stdio.h>
void main()
{

int myNumbers[4] = {25, 50, 75, 100};
int i;

for (i = 0; i < 4; i++) {
  printf("%ls\n", &myNumbers[1]);
  printf("%d\n", myNumbers[i]);
 
}
}