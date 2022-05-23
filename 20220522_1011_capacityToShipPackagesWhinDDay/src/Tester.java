public class Tester {
    public static void main(String[] args){
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        Solution solution = new Solution();
        System.out.println(solution.shipWithinDays(weights, days));

        int[] weights2 = {3,2,2,4,1,4};
        int days2 = 3;
        System.out.println(solution.shipWithinDays(weights2, days2));

        int[] weights3 = {1,2,3,1,1};
        int days3 = 4;
        System.out.println(solution.shipWithinDays(weights3, days3));

    }
}
