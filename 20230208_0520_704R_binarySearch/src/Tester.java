public class Tester {
    public static void main(String[] args){
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        Solution solution = new Solution();
        System.out.println(solution.search(nums, target));

        int[] nums2 = {-1,0,3,5,9,12};
        int target2 = 2;
        Solution solution2 = new Solution();
        System.out.println(solution2.search(nums2, target2));
    }
}
