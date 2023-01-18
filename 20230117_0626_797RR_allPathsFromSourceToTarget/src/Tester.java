public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[][] graph = new int[][]{{1, 2}, {3}, {3}, {}};
        System.out.println(solution.allPathsSourceTarget(graph));

        Solution solution2 = new Solution();
        int[][] graph2 = new int[][]{{4,3,1},{3,2,4},{3},{4},{}};
        System.out.println(solution2.allPathsSourceTarget(graph2));
    }
}
