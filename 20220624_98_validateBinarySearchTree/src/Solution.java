class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    //限定以 root 为根的子树节点必须满足 max.val > root.val > min.val
    public boolean isValidBST(TreeNode root, TreeNode min, TreeNode max){
        if(root == null){   //base case
            return true;
        }
        //若 root.val 不满足 max和min 的限制，说明不是合法的BST
        if(min != null && root.val <= min.val){
            return false;
        }
        if(max != null && root.val >= max.val){
            return false;
        }

        //限定左子树的最大值是 root.val, 右子树的最小值是 root.val
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
}