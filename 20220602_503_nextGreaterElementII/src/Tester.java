import java.util.Arrays;

public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(solution.nextGreaterElements(nums)));

        int[] nums2 = {1,2,3,4,3};
        System.out.println(Arrays.toString(solution.nextGreaterElements(nums2)));

    }
}
