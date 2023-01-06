public class Solution {
    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root){
        maxDepth(root);
        return maxDiameter;
    }

    public int maxDepth(TreeNode root){
        if(root == null)
            return 0;

        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        maxDiameter = Math.max(maxDiameter, leftMax+rightMax);

        return Math.max(leftMax, rightMax)+1;
    }
}
