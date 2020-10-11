// Question 3

public class RandomWalker {
    public static void main(String[] args){
        int r = Integer.parseInt(args[0]);
        int distance = 0;  // initialize the variable for measuring the distance
        int left_x = 0;  // initialize the coordinate variable
        int right_y = 0;
        int step = 0;
        while (distance < r){
            if (Math.random() < 0.5){
                if (Math.random() < 0.5) {
                    right_y = right_y + 1;
                }
                else {
                    left_x = left_x + 1;
                }
            }
            else {
                if (Math.random() < 0.5) {
                    right_y = right_y - 1;
                }
                else {
                    left_x = left_x - 1;
                }
            }
            distance = Math.abs(left_x) + Math.abs(right_y);
            System.out.println("(" + left_x + "," + " " + right_y + ")");
            step++;
        }
        System.out.println("steps = " + step);
    }
}
