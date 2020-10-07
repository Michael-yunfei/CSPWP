#include <stdio.h>

/* RightTriangle that takes three int command-line arguments and determines whether they constitute the side lengths of some right triangle. */

int RightTriangle(int a, int b, int c){
  if (a > 0 & b > 0 & c > 0 & a * a + b * b == c * c){
    return 1;  /* true */
  } else {
    return 0;  /* false */
  }

}

int main(){
  int ra = RightTriangle(13, 12, 15);
  if(ra == 1){
    printf("true");
  } else {
    printf("false");
  }
}
