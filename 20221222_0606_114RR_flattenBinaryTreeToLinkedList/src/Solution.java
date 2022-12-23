import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public void flatten(TreeNode root) {
        if(root == null)
            return;
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        TreeNode p = root;
        while(p.right != null){
            p = p.right;
        }
        p.right = temp;
//        flatten(root);
        flatten(root.left);
        flatten(root.right);
    }


    //level order traversal, just for output invertTree2().
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
