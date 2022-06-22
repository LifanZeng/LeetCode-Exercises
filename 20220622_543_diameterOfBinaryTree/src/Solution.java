class Solution {
    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return maxDiameter;
    }

    int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        maxDiameter = Math.max(maxDiameter, leftMax+rightMax);//后序遍历位置顺便计算最大直径。所谓二叉树直径，就是左右子树的最大深度之和。
        return 1+Math.max(leftMax, rightMax);
    }
}