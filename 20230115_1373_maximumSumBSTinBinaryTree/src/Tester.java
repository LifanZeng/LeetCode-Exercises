import java.util.LinkedList;
import java.util.Queue;

public class Tester {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1,
                new TreeNode(4, new TreeNode(2), new TreeNode(4)),
                new TreeNode(3, new TreeNode(2), new TreeNode(5, new TreeNode(4), new TreeNode(6))));
        Solution solution = new Solution();
        preOrder(root);
        System.out.println();
        levelOrder(root);
        System.out.println();
        System.out.println(solution.maxSumBST(root));
    }


    //preOrder Traversal
    public static void preOrder(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    //inOrder Traversal
    public static void inOrder(TreeNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }
    //levelOrder Traversal
    public static void levelOrder(TreeNode node){
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
