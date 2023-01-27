/**
 * Bipartite 二分图：二分图的顶点集可分割为互不相交的子集，图中每条边依附的两个顶点都分属于这两个子集，而且两个子集内的顶点互不相邻。
 *
 */

public class Solution {
    //记录图是否符合二分图性质
    private boolean ok = true;
    //记录图中节点的颜色，　false　和　true　代表不同的颜色
    private boolean[] color;
    //记录图中节点是否被访问过
    private boolean[] visited;

    //主函数，输入邻接表，判断是否是二分图
    public boolean isBipartite(int[][] graph){
        int n = graph.length;
        color = new boolean[n];
        visited = new boolean[n];

        //因为图不一定是联通的，可能存在多个子图
        //所以要把每个节点都作为起点进行一次遍历
        //如果发现任何一个子图不是二分图，整幅图都不算二分图
        for(int v=0; v<n; v++){
            if(!visited[v]){
                traverse(graph, v);
            }
        }
        return ok;
    }

    //ＤＦＳ　遍历框架
    private void traverse(int[][] graph, int v){
        //如果已经确定不是二分图了，就不用浪费时间再递归遍历
        if(!ok)
            return;

        visited[v] = true;
        for(int w: graph[v]){
            if(!visited[w]){
                //相邻节点ｗ已经被访问过
                //那么应该给节点ｗ涂上和节点ｖ不同的颜色
                color[w] = !color[v];
                //继续遍历ｗ
                traverse(graph, w);
            }
            else{
                //相邻节点ｗ已经被访问过
                //根据v和ｗ的颜色判断是否是二分图
                if(color[w] == color[v]){
                    //若相同，此图不是二分图
                    ok = false;
                }
            }
        }
    }
}
