public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {3,4,5,1,2};
        System.out.println(solution.findMin(nums));

        int[] nums2 = {4,5,6,7,0,1,2};
        System.out.println(solution.findMin(nums2));

        int[] nums3 = {11,13,15,17};
        System.out.println(solution.findMin(nums3));
    }

}
