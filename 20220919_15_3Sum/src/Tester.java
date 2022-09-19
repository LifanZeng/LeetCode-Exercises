public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(solution.threeSum(nums));

        int[] nums2 = {0,1,1};
        System.out.println(solution.threeSum(nums2));

        int[] nums3 = {0,0,0};
        System.out.println(solution.threeSum(nums3));
    }

}
