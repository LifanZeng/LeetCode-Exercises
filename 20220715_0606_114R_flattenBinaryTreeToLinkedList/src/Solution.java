import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }

        TreeNode l = root.left;
        TreeNode r = root.right;



        root.left = null;
        root.right = l;

        //**********************
//        TreeNode p = root;
//        while(p.right != null){
//            p = p.right;
//        }
//        p.right = r;

        while(root.right != null){
            root = root.right;
        }
        root.right = r;
        //***********************

//        flatten(root.right);
//        flatten(root.left);
    }

    // preOrder traversal
    public void preOrder(TreeNode root){
        if(root == null)
            return;

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //level order traversal, just for output.
    public void levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        if(root == null)
            return;

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
