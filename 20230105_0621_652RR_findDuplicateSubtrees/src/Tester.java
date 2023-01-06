import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tester {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3, new TreeNode(2, new TreeNode(4), null), new TreeNode(4)));
        Solution solution = new Solution();
        List<TreeNode> output = solution.findDuplicateSubtrees(root);  //Debug can see the detail.
        for(int i=0; i< output.size(); i++){
            preOrder(output.get(i));
            System.out.println();
        }
        System.out.println("--preOrder finished--------------");
        for(int i=0; i< output.size(); i++){
            inOrder(output.get(i));
            System.out.println();
        }
        System.out.println("--inOrder finished--------------");
        for(int i=0; i< output.size(); i++){
            levelOrder(output.get(i));
            System.out.println();
        }
        System.out.println("--levelOrder finished--------------");
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
