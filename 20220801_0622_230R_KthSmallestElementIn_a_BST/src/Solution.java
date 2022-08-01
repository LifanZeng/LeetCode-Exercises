public class Solution {
    private int res = 0;
    private int rank = 0;

    public int kthSmallest(TreeNode root, int k) {      // BST中序遍历，其结果必然是升序排列。
        traverse(root, k);
        return res;
    }

    private void traverse(TreeNode root, int k){
        if(root == null){
            return;
        }

        traverse(root.left, k);
        rank++;
        if(rank == k){
            res = root.val;
            return;
        }
        traverse(root.right, k);
    }


    //InOrder Traversal. Time: O(N)
    public void inOrder(TreeNode root){
        if(root==null)
            return;

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
}
