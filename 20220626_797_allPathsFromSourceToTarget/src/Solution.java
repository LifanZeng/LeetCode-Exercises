import java.util.LinkedList;
import java.util.List;

class Solution {
    List<List<Integer>> res = new LinkedList<>();   //记录所有路径

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        //维护递归过程中经过的路径
        LinkedList<Integer> path = new LinkedList<>();
        traverse(graph, 0, path);
        return res;
    }

    //图的遍历框架
    public void traverse(int[][] graph, int s, LinkedList<Integer> path){
        path.addLast(s);    //添加节点 s 到路径。

        int n = graph.length;
        if(s == n-1){       //到达终点
            res.add(new LinkedList<>(path));
            path.removeLast();
            return;
        }

        for(int v : graph[s]){  //递归每个相邻节点
            traverse(graph, v, path);
        }

        path.removeLast();      //从路径移出节点 s
    }
}