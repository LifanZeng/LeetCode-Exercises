public class Solution {
    public int maxDepth(TreeNode root) {    //解法二： 动态规划思路
        if (root == null){
            return 0;
        }
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        return 1+Math.max(leftMax, rightMax);
    }
}
