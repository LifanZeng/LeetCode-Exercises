import java.util.LinkedList;
import java.util.Queue;

/**
 * 思考一下：root.val > root.left.val && root.val < root.right.val, 是否就满足条件？
 * 答案当然 不！ 因为根节点不但比左子树根节点大，而且比每一个左子树元素大。右边亦然。
 *
 * 正确解法是使用辅助函数，增加函数参数列表，在参数中携带额外信息，将这种约束传递给子树的所有节点。
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    //限定以root为根的子树节点必须满足 max.val > root.val > min.val
    private boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
        //base case
        if(root == null)
            return true;

        //若 root.val 不符合 min, max的限制，说明不是合法BST。
        if(min!=null && root.val <= min.val)
            return false;
        if(max!=null && root.val >= max.val)
            return false;

        //限定左子树的最大值是root.val, 右子树的最小值是root.val
        return isValidBST(root.left, min, root)
                && isValidBST(root.right, root, max);
    }



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
