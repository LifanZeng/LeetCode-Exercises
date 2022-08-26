import java.util.Arrays;

public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(solution.productExceptSelf(nums)));

        int[] nums2 = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(solution.productExceptSelf(nums2)));
    }
}
