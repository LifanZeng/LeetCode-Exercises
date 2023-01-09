import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }

        if(key < root.val){
            root.left = deleteNode(root.left, key);
        }
        else if(key > root.val){
            root.right = deleteNode(root.right, key);
        }
        else{
            if(root.left != null && root.right != null){
                TreeNode minInRight = minimumNode(root.right);
                TreeNode temp = root;
                root.val = minInRight.val;
                root.right = deleteNode(root.right, minInRight.val);
            }
            else if(root.left != null){   //右子树为空
                root = root.left;
            }
            else if(root.right != null){   //左子树为空
                root = root.right;
            }
            else{    //左右子树都为空，只有一个根节点。直接删除根节点。
                root = null;
            }
        }
        return root;
    }

    private TreeNode minimumNode(TreeNode root){
        if(root == null){
            return null;
        }

        if(root.left != null){
            return minimumNode(root.left);
        }
        else
            return root;  //if Left is null, smallest is the root.
    }
    //-------------------------------------------


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
