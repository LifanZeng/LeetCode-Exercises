import java.util.Arrays;

public class Tester {
    public static void main(String[] args){
        int[][] updates = {{2,4,6},{5,6,8},{1,9,-4}};
        int length = 10;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.getModifiedArray(length, updates)));

        int[][] updates2 = {{1,3,2},{2,4,3},{0,2,-2}};
        int length2 = 5;
        System.out.println(Arrays.toString(solution.getModifiedArray(length2, updates2)));

    }
}
