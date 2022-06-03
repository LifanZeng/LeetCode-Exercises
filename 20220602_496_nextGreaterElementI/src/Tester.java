import java.util.Arrays;

public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums1 = {4,1,2};      //数组中选取的元素
        int[] nums2 = {1,3,4,2};    //原数组
        System.out.println(Arrays.toString(solution.nextGreaterElement(nums1, nums2)));//数组一对应next greater element的对应位置。

        int[] nums1_2 = {2, 4};      //数组中选取的元素
        int[] nums2_2 = {1,2,3,4};    //原数组
        System.out.println(Arrays.toString(solution.nextGreaterElement(nums1_2, nums2_2)));//数组一对应next greater element的对应位置。

    }
}
