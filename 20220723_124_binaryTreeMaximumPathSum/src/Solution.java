public class Solution {
    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxOnesideSum(root);
        return max;
    }

    public int maxOnesideSum(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftMax = Math.max(0, maxOnesideSum(root.left));
        int rightMax = Math.max(0, maxOnesideSum(root.right));
        max = Math.max(max, leftMax + rightMax + root.val);

        return root.val + Math.max(leftMax, rightMax);
    }
}
