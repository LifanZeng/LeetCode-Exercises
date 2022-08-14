import java.util.ArrayList;

public class Tester {
    public static void main(String[] args){
        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
        nodeList.add(new GraphNode("A", 0));
        nodeList.add(new GraphNode("B", 1));
        nodeList.add(new GraphNode("C", 2));
        nodeList.add(new GraphNode("D", 3));
        nodeList.add(new GraphNode("E", 4));
        nodeList.add(new GraphNode("F", 5));
        nodeList.add(new GraphNode("G", 6));

//        nodeList.add(new GraphNode("A", 0));
//        nodeList.add(new GraphNode("B", 1));
//        nodeList.add(new GraphNode("C", 2));
//        nodeList.add(new GraphNode("D", 3));
//        nodeList.add(new GraphNode("E", 4));

        Graph g = new Graph(nodeList);   //构造一个 Graph
        g.addUndirectedEdge(0, 1);  //A->B, B->A
        g.addUndirectedEdge(0, 2);  //A->C..
        g.addUndirectedEdge(1, 3);  //B->D..
        g.addUndirectedEdge(1, 6);  //B->G..
        g.addUndirectedEdge(2, 3);  //C->D..
        g.addUndirectedEdge(2, 4);  //C->E..
        g.addUndirectedEdge(3, 5);  //D->F..
        g.addUndirectedEdge(4, 5);  //E->F..
        g.addUndirectedEdge(5, 6);  //F->G..

//        g.addUndirectedEdge(0, 1);
//        g.addUndirectedEdge(0, 2);
//        g.addUndirectedEdge(0, 3);
//        g.addUndirectedEdge(1, 4);
//        g.addUndirectedEdge(2, 3);
//        g.addUndirectedEdge(3, 4);

        System.out.print(g.toString());

        //g.bfs();
        g.dfs();    //A。。。G 结果跟297视频不一样，为：ACEFGDB（而不是ACEFDBG）？？
    }
}
