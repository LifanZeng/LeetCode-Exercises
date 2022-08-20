public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] prerequisites = {{1,0}, {0,1}};
        System.out.println(solution.canFinish(2, prerequisites));

        Solution solution2 = new Solution();
        int[][] prerequisites2 = {{1,0}};
        System.out.println(solution2.canFinish(2, prerequisites2));
    }
}
