#include <stdio.h>

int main(){
  char name[100];
  printf("Enter two names: ");
  scanf("%[^\n]s", name);  /* scanf keeps storing all values until it meets \n*/
  printf("Hello %s\n", name);
  printf("Goodbye %s\n", name);
  return 0;
}
