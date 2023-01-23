import java.util.LinkedList;
import java.util.List;

/*这道题的本质就是判断有向图是否存在环*/
public class Solution {
    private boolean[] onPath; //记录一次 traverse 递归经过的节点
    private boolean[] visited; //记录遍历过的节点，防止走回头路。 防止重复遍历同一个节点。
    private boolean hasCycle = false; //记录图中是否有环

    public boolean canFinish(int numCourses, int[][] prerequisites){
        List<Integer>[] graph = buildGraph(numCourses, prerequisites);

        visited = new boolean[numCourses];
        onPath = new boolean[numCourses];

        for(int i=0; i<numCourses; i++){
            traverse(graph, i); //遍历图中的所有节点
        }
        return !hasCycle; //只要没有循环依赖，可以完成所有课程
    }

    private List<Integer>[] buildGraph(int numCourses, int[][] prerequisites){ //图中共有 numCourses 个节点
        List<Integer>[] graph = new LinkedList[numCourses];//构建一个数组graph，定义数组的类型是List<Integer>，实现办法就是让其类型为LinkedList。
        for(int i=0; i<numCourses; i++){
            graph[i] = new LinkedList<>(); //初始赋值为 空链表
        }

        for(int[] edge: prerequisites){ //edge 是一维数组，它是二维数组 prerequisites 的元素。如 prerequisites = [[1,0],[0,1]]， 则 edge=[1,0]， edge=[0,1].
            int from = edge[1];         //from 是数组 edge 的左数第二个元素。如 edge=[1,0]，from = edge[1] = 0
            int to = edge[0];           //to 是数组 edge 的左数第一个元素。如 edge=[1,0]，to = edge[0] = 1
            //修完课程 from 才能修 to
            //在图中添加一条从 from 到 to 的有向边
            graph[from].add(to);    // 如 edge=[1,0]，graph[from].add(to) --> graph[0].add(1) --> graph[0] = 1.
        }
        return graph;
    }

    //从节点s开始DFS遍历，将遍历过的节点标记为 true 。
    private void traverse(List<Integer>[] graph, int s){
        if(onPath[s]){
            hasCycle = true; //发现环
        }

        if(visited[s] || hasCycle){
            return;          //如果已经找到了环，就不用再遍历了
        }

        //前序遍历代码位置
        //将当前节点 s 标记为已遍历
        visited[s] = true;
        onPath[s] = true;    //开始遍历节点 s
        for(int t: graph[s]){
            traverse(graph, t);
        }
        //后序遍历代码位置
        onPath[s] = false;  //节点 s 遍历完成。在进入节点s的时候将onPath[s]标记为true，离开时标记为false。如果发现onPath[s]已经被标记，说明出现了环。
    }
}
