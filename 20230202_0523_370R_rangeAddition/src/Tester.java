import java.util.Arrays;

public class Tester {
    public static void main(String[] args){
        int length = 5;
        int[][] updates ={{1,3,2}, {2,4,3},{0,2,-2}};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.getModifiedArray(length, updates)));

        int length2 = 10;
        int[][] updates2 ={{2,4,6}, {5,6,8},{1,9,-4}};
        Solution solution2 = new Solution();
        System.out.println(Arrays.toString(solution2.getModifiedArray(length2, updates2)));

    }
}
