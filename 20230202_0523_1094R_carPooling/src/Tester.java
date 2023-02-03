import java.util.Arrays;

public class Tester {
    public static void main(String[] args){
        int[][] trips = {{2,1,5}, {3,3,7}};
        int capacity = 4;
        Solution solution = new Solution();
        System.out.println(solution.carPooling(trips, capacity));

        int[][] trips2 = {{2,1,5}, {3,3,7}};
        int capacity2 = 5;
        Solution solution2 = new Solution();
        System.out.println(solution2.carPooling(trips2, capacity2));
    }
}
