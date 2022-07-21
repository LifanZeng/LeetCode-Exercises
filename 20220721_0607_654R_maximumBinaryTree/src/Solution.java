import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums){
        return build(nums, 0, nums.length-1);
    }

    public TreeNode build(int[] nums, int lo, int hi){
        if(lo > hi){
            return null;
        }


        int maxValue = Integer.MIN_VALUE;
        int index = -1;
        for(int i=lo; i<=hi; i++){
            if(nums[i] > maxValue){
                maxValue = nums[i];
                index = i;
            }
        }


        TreeNode root = new TreeNode(maxValue);
        root.left = build(nums, lo, index-1);
        root.right = build(nums,  index+1, hi);
        return root;
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
