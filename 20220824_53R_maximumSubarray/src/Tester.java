public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution.maxSubArray(nums));

        int[] nums2 = {5,4,-1,7,8};
        System.out.println(solution.maxSubArray(nums2));
    }
}
