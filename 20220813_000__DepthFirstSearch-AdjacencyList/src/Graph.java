import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

    public Graph(ArrayList<GraphNode> nodeList){
        this.nodeList = nodeList;
    }

    public void addUndirectedEdge(int i, int j){
        GraphNode first = nodeList.get(i);
        GraphNode second = nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        for(int i=0; i< nodeList.size(); i++){      //所有行
            s.append(nodeList.get(i).name + ": ");  //行首
            for(int j=0; j<nodeList.get(i).neighbors.size(); j++){         //第i行的所有元素
                if(j == nodeList.get(i).neighbors.size() - 1){
                    s.append((nodeList.get(i).neighbors.get(j).name));
                }else{
                    s.append((nodeList.get(i).neighbors.get(j).name) + " -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }

    //BFS internal
    private void bfsVisit(GraphNode node){
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            //ArrayList<GraphNode> neighbors = getNeighbors(node); XX
            //ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
            for(GraphNode neighbor: currentNode.neighbors){
                if(!neighbor.isVisited){
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    public void bfs(){
        for(GraphNode node: nodeList){
            if(!node.isVisited){
                bfsVisit(node);
            }
        }
    }

    //DFS internal
    private void dfsVisit(GraphNode node){
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            for(GraphNode neighbor: currentNode.neighbors){
                if(!neighbor.isVisited){
                    stack.push(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    public void dfs(){
        for(GraphNode node: nodeList){
            if(!node.isVisited){
                dfsVisit(node);
            }
        }
    }
}
