import java.util.Arrays;

public class Tester {
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.searchRange(nums, target)));

        int[] nums2 = {5,7,7,8,8,10};
        int target2 = 6;
        Solution solution2 = new Solution();
        System.out.println(Arrays.toString(solution2.searchRange(nums2, target2)));

        int[] nums3 = {};
        int target3 = 0;
        Solution solution3 = new Solution();
        System.out.println(Arrays.toString(solution3.searchRange(nums3, target3)));
    }
}
