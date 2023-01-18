import java.util.LinkedList;
import java.util.List;

//　图的遍历。　（有向无环图）
//　graph 就是"邻接表"表示的一幅图，graph[i] 存储这个节点 i 的所有邻居节点
public class Solution {
    private List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph){
        // 维护递归过程中经过的路径
        LinkedList<Integer> path = new LinkedList<>();
        traverse(graph, 0, path);
        return res;
    }

    /* 图的遍历框架 */
    void traverse(int[][] graph, int s, LinkedList<Integer> path){
        //添加节点 s 到路径　(s是遍历的起始节点, start)
        path.addLast(s);
        int n = graph.length; // n 等于 graph 的行数，等于节点的个数
        if(s == n-1){ //到达终点
            //path 是　LinkedList<Integer> 类型. 满足条件就把路径记下来，path作为参数必须清空，所以要path.removeLast()。
            res.add(new LinkedList<>(path));
            path.removeLast(); //从路径移出节点 s
            return;
        }

        //递归每个相邻节点
        for(int v : graph[s]){ //graph[s] 存储这个节点 s 的所有邻居节点
            traverse(graph, v, path);
        }

        path.removeLast(); //从路径移出节点 s
    }
}
