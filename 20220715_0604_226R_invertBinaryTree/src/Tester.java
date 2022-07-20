/**
 * 226. Invert Binary Tree (Easy)
 * Given the root of a binary tree, invert the tree, and return its root.
 * Example 1:   Input: root = [4,2,7,1,3,6,9]
 *              Output: [4,7,2,9,6,3,1]
 * Example 2:   Input: root = [2,1,3]
 *              Output: [2,3,1]
 * Example 3:   Input: root = []
 *              Output: []
 */
public class Tester {
    public static void main(String[] args){
        TreeNode treeNode = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        Solution solution = new Solution();
        solution.levelOrder(treeNode);
        System.out.println();

        solution.invertTree(treeNode);
        System.out.println();

        solution.invertTree2(treeNode); //invert two times.
        solution.levelOrder(treeNode);
        System.out.println();
    }
}
