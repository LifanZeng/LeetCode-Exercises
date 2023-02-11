public class Tester {
    public static void main(String[] args){
        int[] piles = {3,6,7,11};
        int h = 8;
        Solution solution = new Solution();
        System.out.println(solution.minEatingSpeed(piles, h));

        int[] piles2 = {30,11,23,4,20};
        int h2 = 5;
        Solution solution2 = new Solution();
        System.out.println(solution2.minEatingSpeed(piles2, h2));

        int[] piles3 = {30,11,23,4,20};
        int h3 = 6;
        Solution solution3 = new Solution();
        System.out.println(solution3.minEatingSpeed(piles3, h3));
    }
}
