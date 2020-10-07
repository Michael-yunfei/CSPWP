#include <stdio.h>

void ColorConvert(double cyan, double magenta, double yellow, double black){
  int white, red, green, blue;
  white = (int)(1-black);
  red = (int)(255 * white * (1-cyan));
  green = (int)(255 * white * (1-magenta));
  blue = (int)(255 * white * (1-yellow));
  printf("red = %d\n", red);
  printf("green = %d\n", green);
  printf("blue = %d\n", blue);
}

int main(){
  ColorConvert(0.589, 1.0, 0.0, 0.0);
}
