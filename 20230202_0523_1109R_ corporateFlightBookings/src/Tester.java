import java.util.Arrays;

public class Tester {
    public static void main(String[] args){
        int[][] bookings = {{1,2,10},{2,3,20},{2,5,25}};
        int n = 5;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.corpFlightBookings(bookings, n)));

        int[][] bookings2 = {{1,2,10}, {2,2,15}};
        int n2 = 2;
        Solution solution2 = new Solution();
        System.out.println(Arrays.toString(solution2.corpFlightBookings(bookings2, n2)));

    }
}
