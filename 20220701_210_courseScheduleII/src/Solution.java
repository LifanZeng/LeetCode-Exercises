import java.util.*;

//class Solution {
//    List<Integer> postorder = new ArrayList<>();
//    boolean hasCycle = false;
//    boolean[] visited, onPath;
//
//    public int[] findOrder(int numCourses, int[][] prerequisites) {
//        if(numCourses <= 0)
//            return null;
//
//        List<Integer>[] graph = buildGraph(numCourses, prerequisites);
//        visited = new boolean[numCourses];
//        onPath = new boolean[numCourses];
//
//        for(int i=0; i<numCourses; i++){
//            traverse(graph, i);
//        }
//
//        if(hasCycle){
//            return new int[]{};
//        }
//
//        Collections.reverse(postorder);
//        int[] res = new int[numCourses];
//        for(int i=0; i<numCourses; i++){
//            res[i] = postorder.get(i);
//        }
//        return res;
//    }
//
//    public void traverse(List<Integer>[] graph, int s){
//        if(onPath[s]){
//            hasCycle = true;    //出现环
//        }
//
//        if(visited[s] || hasCycle){
//            return;             //如果已经找到了环，就不用再遍历了
//        }
//
//        //前序遍历代码位置
//        visited[s] = true;
//        onPath[s] = true;
//        for(int t: graph[s]){
//            traverse(graph, t);
//        }
//        //后序遍历代码位置
//        onPath[s] = false;
//    }
//
//    public List<Integer>[] buildGraph(int numCourses, int[][] prerequisites){   //图中共有 numCourses 个节点
//        List<Integer>[] graph = new LinkedList[numCourses];
//        for(int i=0; i<numCourses; i++){
//            graph[i] = new LinkedList<>();
//        }
//        for(int[] edge: prerequisites){
//            int from = edge[1];
//            int to = edge[0];
//            //修完课程 from 才能修 to
//            //在图中添加一条从 from 到 to 的有向边
//            graph[from].add(to);
//        }
//        return graph;
//    }
//}

//Using Depth First Search.
class Solution {
    static int WHITE = 1;
    static int GRAY = 2;
    static int BLACK = 3;

    boolean isPossible;
    Map<Integer, Integer> color;
    Map<Integer, List<Integer>> adjList;
    List<Integer> topologicalOrder;

    private void init(int numCourses) {
        this.isPossible = true;
        this.color = new HashMap<Integer, Integer>();
        this.adjList = new HashMap<Integer, List<Integer>>();
        this.topologicalOrder = new ArrayList<Integer>();

        // By default all vertces are WHITE
        for (int i = 0; i < numCourses; i++) {
            this.color.put(i, WHITE);
        }
    }

    private void dfs(int node) {

        // Don't recurse further if we found a cycle already
        if (!this.isPossible) {
            return;
        }

        // Start the recursion
        this.color.put(node, GRAY);

        // Traverse on neighboring vertices
        for (Integer neighbor : this.adjList.getOrDefault(node, new ArrayList<Integer>())) {
            if (this.color.get(neighbor) == WHITE) {
                this.dfs(neighbor);
            } else if (this.color.get(neighbor) == GRAY) {
                // An edge to a GRAY vertex represents a cycle
                this.isPossible = false;
            }
        }

        // Recursion ends. We mark it as black
        this.color.put(node, BLACK);
        this.topologicalOrder.add(node);
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        this.init(numCourses);

        // Create the adjacency list representation of the graph
        for (int i = 0; i < prerequisites.length; i++) {
            int dest = prerequisites[i][0];
            int src = prerequisites[i][1];
            List<Integer> lst = adjList.getOrDefault(src, new ArrayList<Integer>());
            lst.add(dest);
            adjList.put(src, lst);
        }

        // If the node is unprocessed, then call dfs on it.
        for (int i = 0; i < numCourses; i++) {
            if (this.color.get(i) == WHITE) {
                this.dfs(i);
            }
        }

        int[] order;
        if (this.isPossible) {
            order = new int[numCourses];
            for (int i = 0; i < numCourses; i++) {
                order[i] = this.topologicalOrder.get(numCourses - i - 1);
            }
        } else {
            order = new int[0];
        }

        return order;
    }
}