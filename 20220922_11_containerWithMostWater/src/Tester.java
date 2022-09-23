public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(solution.maxArea(height));

        int[] height2 = {1,1};
        System.out.println(solution.maxArea(height2));
    }
}
