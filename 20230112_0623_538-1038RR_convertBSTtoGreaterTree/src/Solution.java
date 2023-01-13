import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public TreeNode convertBST(TreeNode root){
        traverse(root);
        return root;
    }

    private int sum = 0;
    public void traverse(TreeNode root){
        if(root==null){
            return;
        }
        traverse(root.right);
        sum = sum + root.val;
        root.val = sum;   //
        traverse(root.left);
    }
    //--------------------------------


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
}
