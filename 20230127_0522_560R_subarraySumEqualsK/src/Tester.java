public class Tester {
    public static void main(String[] args){
        int[] nums = {1,1,1};
        int k = 2;
        Solution solution = new Solution();
        System.out.println(solution.subarraySum(nums, k));

        int[] nums2 = {1,2,3};
        int k2 = 3;
        System.out.println(solution.subarraySum(nums2, k2));
    }
}
