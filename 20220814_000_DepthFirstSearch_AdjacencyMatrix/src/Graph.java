import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    private int[][] adjacencyMatrix;
    private ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

    public Graph(ArrayList<GraphNode> nodeList){
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int i, int j){
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for(int i=0; i< nodeList.size(); i++){
            s.append(nodeList.get(i).name + " ");   //第一行
        }
        s.append("\n");

        for(int i=0; i< nodeList.size(); i++){      //所有行
            s.append(nodeList.get(i).name + ": ");  //行首
            for(int j: adjacencyMatrix[i]){         //第i行的所有元素
                s.append((j) + " ");
            }
            s.append("\n");
        }

        return s.toString();
    }

    //get Neighbors
    public ArrayList<GraphNode> getNeighbors(GraphNode node){
        ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();
        int nodeIndex = node.index;
        for(int i=0; i< adjacencyMatrix.length; i++){
            if(adjacencyMatrix[nodeIndex][i] == 1){
                neighbors.add(nodeList.get(i));
            }
        }
        return neighbors;
    }


    /*
    //LevelOrder Traversal. Time: O(N)
    public void levelOrder(TreeNode root){
        if(root==null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode presentNode = queue.remove();
            System.out.print(presentNode.val + " ");

            if(presentNode.left!=null)
                queue.add(presentNode.left);
            if(presentNode.right!=null)
                queue.add(presentNode.right);
        }
    }
    */

    //BFS internal
    private void bfsVisit(GraphNode node){
        //LinkedList<GraphNode> queue = new LinkedList<>();ok1
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            //GraphNode currentNode = queue.remove(0);ok2
            GraphNode currentNode = queue.remove();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
            for(GraphNode neighbor: neighbors){
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

    private void dfsVisit(GraphNode node){
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name + " ");
            ArrayList<GraphNode> neighbors = getNeighbors(currentNode);
            for(GraphNode neighbor: neighbors){
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
