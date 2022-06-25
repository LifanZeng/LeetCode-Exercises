class Solution {
    public TreeNode searchBST(TreeNode root, int target) {
        if(root == null){
            return null;
        }

        if(root.val > target){
            return searchBST(root.left, target);
        }

        if(root.val < target){
            return searchBST(root.right, target);
        }

        return root;
    }
}