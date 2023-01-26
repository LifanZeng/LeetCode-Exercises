import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 输出为课程顺序，不是依赖关系。
 * 拓扑排序箭头必定一致；如果有环箭头就不可能方向一致。
 * 拓扑排序结构就是上课顺序。
 * 后序遍历的结果进行反转，就是拓扑排序的结果。
 *
 */
public class Solution {
    //To record the postOrder traversal result
    List<Integer> postorder = new ArrayList<>();
    //To record whether there exist a circle or not
    boolean hasCycle = false;
    boolean[] visited, onPath;

    //main function
    public int[] findOrder(int numCourses, int[][] prerequisites){ //numCourses 课程的数量。
        List<Integer>[] graph = buildGraph(numCourses, prerequisites);
        visited = new boolean[numCourses];
        onPath = new boolean[numCourses];
        // To traverse the graph
        for(int i=0; i<numCourses; i++){
            traverse(graph, i);
        }
        //有环图无法进行拓扑排序
        if(hasCycle){
            return new int[]{};
        }
        //逆后序遍历结果即为拓扑排序结果。
        Collections.reverse(postorder);
        int[] res = new int[numCourses];
        for(int i=0; i<numCourses; i++){
            res[i] = postorder.get(i);
        }
        return res;
    }


    //Traversal Function of the Graph
    void traverse(List<Integer>[] graph, int s){
        if(onPath[s]){
            //found a cycle
            hasCycle = true;
        }
        if(visited[s] || hasCycle){
            return;
        }
        //preOrder position
        onPath[s] = true;
        visited[s] = true;
        for(int t: graph[s]){
            traverse(graph, t);
        }
        //postOrder position
        postorder.add(s);
        onPath[s] = false;
    }

    //Build Graph function
    List<Integer>[] buildGraph(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new LinkedList[numCourses];
        for(int i=0; i<numCourses; i++){
            graph[i] = new LinkedList<>();
        }
        for(int[] edge: prerequisites){
            int from = edge[1];
            int to = edge[0];
            //修完课程　from　才能修 to.　在图中添加一条从 from 指向 to 的有向边。
            graph[from].add(to); //箭头代表 “依赖“ 关系。如果是 ”被依赖“ 关系，则 graph[to].add(from), 不用反转。
        }
        return graph;
    }
}
