/**
 * 这段代码可以降序打印BST节点的值，如果维护一个外部累加变量sum，然后
 * 赋值给BST中的每一个节点， 不就将BST转化成累加树了吗？
 */
class Solution {
    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }

    int sum = 0;
    void traverse(TreeNode root){
        if(root == null){
            return;
        }
        traverse(root.right);
        sum += root.val;
        root.val = sum;
        traverse(root.left);
    }
}