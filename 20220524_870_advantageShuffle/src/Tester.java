import java.util.Arrays;

public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums1 = {2,7,11,15};
        int[] nums2 = {1,10,4,11};
        System.out.println(Arrays.toString(solution.advantageCount(nums1, nums2)));

        int[] nums1_2 = {12,24,8,32};
        int[] nums2_2 = {13,25,32,11};
        System.out.println(Arrays.toString(solution.advantageCount(nums1_2, nums2_2)));

    }
}
