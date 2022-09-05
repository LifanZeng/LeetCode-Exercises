public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(solution.search(nums, 0));

        int[] nums2 = {4,5,6,7,0,1,2};
        System.out.println(solution.search(nums2, 3));

        int[] nums3 = {1};
        System.out.println(solution.search(nums3, 0));
    }
}
