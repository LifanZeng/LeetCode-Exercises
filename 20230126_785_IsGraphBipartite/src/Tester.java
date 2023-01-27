public class Tester {
    public static void main(String[] args){
        int[][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
        Solution solution = new Solution();
        System.out.println(solution.isBipartite(graph));

        int[][] graph2 = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        Solution solution2 = new Solution();
        System.out.println(solution2.isBipartite(graph2));
    }
}
