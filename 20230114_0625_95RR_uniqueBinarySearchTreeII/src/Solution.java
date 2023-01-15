import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<TreeNode> generateTrees(int n){
        if(n == 0)
            return new LinkedList<>();
        return build(1, n);
    }

    private List<TreeNode> build(int lo, int hi){
        List<TreeNode> res = new LinkedList<>();

        if(lo > hi){
            res.add(null);
            return res;
        }

        for(int mid=lo; mid<=hi; mid++){
            List<TreeNode> leftTree = build(lo, mid-1);
            List<TreeNode> rightTree = build(mid+1, hi);
            for(TreeNode left: leftTree){
                for(TreeNode right: rightTree){
                    TreeNode root = new TreeNode(mid);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
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
