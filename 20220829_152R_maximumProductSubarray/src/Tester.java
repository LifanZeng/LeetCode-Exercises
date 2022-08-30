public class Tester {
    public static void main(String[] args){
        int[] nums = {2,3,-2,4};
        Solution solution = new Solution();
        System.out.println(solution.maxProduct(nums));

        int[] nums2 = {-2,0,-1};
        System.out.println(solution.maxProduct(nums2));
    }
}
