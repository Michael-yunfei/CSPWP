/* A function that determines whether a triangle is a perpendicular one or not */

public class RightTriangle {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a > 0 & b > 0 & c > 0 & a * a + b * b == c * c){
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
