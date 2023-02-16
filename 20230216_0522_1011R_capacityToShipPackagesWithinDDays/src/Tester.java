public class Tester {
    public static void main(String[] args){
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        Solution solution = new Solution();
        System.out.println(solution.shipWithinDays(weights, days));

        int[] weights2 = {3,2,2,4,1,4};
        int days2 = 3;
        Solution solution2 = new Solution();
        System.out.println(solution2.shipWithinDays(weights2, days2));

        int[] weights3 = {1,2,3,1,1};
        int days3 = 4;
        Solution solution3 = new Solution();
        System.out.println(solution3.shipWithinDays(weights3, days3));
    }
}
