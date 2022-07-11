import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private TreeNode root;

    //preOrder Traversal
    public void preOrder(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //inOrder Traversal
    public void inOrder(TreeNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    //postOrder Traversal
    public void postOrder(TreeNode node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }

    //levelOrder Traversal
    public void levelOrder(TreeNode node){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            TreeNode presentNode = queue.remove();
            System.out.print(presentNode.val + " ");
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
    }

    //Search in levelOrder
    public void search(String value){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this.root);
        while(!queue.isEmpty()){
            TreeNode presentNode = queue.remove();
            if(presentNode.val == value){
                System.out.print("The value "+ value + " is found in the Tree.");
                return;
            }else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("The value "+ value + " is Not found in the Tree.");
    }

    public void setRoot(TreeNode node){
        this.root = node;
    }


    //Insert in levelOrder
    public void insert(String value){
        TreeNode newNode = new TreeNode(value);
        if(this.root == null){
            root = newNode;
            System.out.println("Inserted new node at root.");
            return;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(this.root);
        while(!queue.isEmpty()){
            TreeNode presentNode = queue.remove();
            if(presentNode.left == null){
                presentNode.left = newNode;
                System.out.println("Successfully inserted.");
                break;
            }
            else if(presentNode.right == null){
                presentNode.right = newNode;
                System.out.println("Successfully inserted.");
                break;
            }
            else{   // Means Not null
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }


    //Get deepest node, in levelOrder
    public TreeNode getDeepestNode(){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(this.root);
        TreeNode presentNode = null;
        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    //Delete deepest node, in levelOrder
    public void deleteDeepestNode(){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(this.root);
        TreeNode previousNode, presentNode = null;
        while(!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.left == null){
                previousNode.right = null;
                return;
            }
            else if(presentNode.right == null){
                presentNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    //Delete given node, in levelOrder
    public void deleteNode(String value){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(this.root);
        while(!queue.isEmpty()){
            TreeNode presentNode = queue.remove();
            if(presentNode.val == value){
                presentNode.val = getDeepestNode().val;
                deleteDeepestNode();
                System.out.println("The node "+ value +" is deleted");
                return;
            }
            else{
                if(presentNode.left != null)
                    queue.add(presentNode.left);
                if(presentNode.right != null)
                    queue.add(presentNode.right);
            }
        }
        System.out.println("The node does not exist in this BT.");
    }


    //Delete binary tree
    public void deleteBT(){
        this.root = null;
        System.out.println("Binary tree has been successfully deleted!");
    }
}
