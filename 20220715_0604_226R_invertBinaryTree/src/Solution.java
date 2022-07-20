import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        if(root == null)
            return null;

        while(!queue.isEmpty()){
            TreeNode presentNode = queue.remove();
            TreeNode tmp;
            System.out.print(presentNode.val + " ");

            tmp = presentNode.left;
            presentNode.left = presentNode.right;
            presentNode.right = tmp;

            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
        return root;
    }

    //** Another way
    public TreeNode invertTree2(TreeNode root){
        if(root == null)
            return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree2(root.left);
        invertTree2(root.right);

        return root;
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
