import java.util.LinkedList;
import java.util.List;

class Solution {
    boolean[] onPath;           //记录一次 traverse 递归经过的节点
    boolean[] visited;          //记录遍历过的节点，防止走回头路
    boolean hasCycle = false;   //记录图中是否有环

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = buildGraph(numCourses, prerequisites);

        visited = new boolean[numCourses];
        onPath = new boolean[numCourses];

        for(int i=0; i<numCourses; i++){
            traverse(graph, i); //遍历图中的所有节点
        }
        return !hasCycle;       //只要没有循环依赖，可以完成所有课程
    }

    public void traverse(List<Integer>[] graph, int s){
        if(onPath[s]){
            hasCycle = true;    //出现环
        }

        if(visited[s] || hasCycle){
            return;             //如果已经找到了环，就不用再遍历了
        }

        //前序遍历代码位置
        visited[s] = true;
        onPath[s] = true;
        for(int t: graph[s]){
            traverse(graph, t);
        }
        //后序遍历代码位置
        onPath[s] = false;
    }

    public List<Integer>[] buildGraph(int numCourses, int[][] prerequisites){   //图中共有 numCourses 个节点
        List<Integer>[] graph = new LinkedList[numCourses];
        for(int i=0; i<numCourses; i++){
            graph[i] = new LinkedList<>();
        }
        for(int[] edge: prerequisites){
            int from = edge[1];
            int to = edge[0];
            //修完课程 from 才能修 to
            //在图中添加一条从 from 到 to 的有向边
            graph[from].add(to);
        }
        return graph;
    }
}