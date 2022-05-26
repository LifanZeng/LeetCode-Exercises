import java.util.Arrays;

public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(solution.removeElement(nums, val));

        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        System.out.println(solution.removeElement(nums2, val2));
    }
}
