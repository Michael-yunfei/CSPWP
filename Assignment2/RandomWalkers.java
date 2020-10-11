// Question 4

public class RandomWalkers {
    public static void main(String[] args){
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double steps_sum = 0.0;
        for (int t = 0; t < trials; t++){
            int distance = 0;  // initialize the disantce variable
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
                step++;
            }
            steps_sum = steps_sum + step;

        }
        System.out.println("average number of steps = " + steps_sum/trials);
    }
}
