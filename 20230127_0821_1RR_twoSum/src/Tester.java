import java.util.Arrays;

public class Tester {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));

        int[] nums2 = {3,2,4};
        int target2 = 6;
        Solution solution2 = new Solution();
        System.out.println(Arrays.toString(solution2.twoSum(nums2, target2)));
    }
}
