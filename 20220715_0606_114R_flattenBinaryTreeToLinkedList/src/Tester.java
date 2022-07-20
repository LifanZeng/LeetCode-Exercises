import java.util.ArrayList;

/**
 * 114. Flatten Binary Tree to Linked List (Medium)
 * Given the root of a binary tree, flatten the tree into a "linked list":
 * The "linked list" should use the same TreeNode class where the right child pointer points to the next
 * node in the list and the left child pointer is always null.
 * The "linked list" should be in the same order as a pre-order traversal of the binary tree.
 * Example 1:   Input: root = [1,2,5,3,4,null,6]
 *              Output: [1,null,2,null,3,null,4,null,5,null,6]
 */
public class Tester {
    public static void main(String[] args){
        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5, null, new TreeNode(6)));
        TreeNode treeNode2 = new TreeNode(1,
                new TreeNode(2, new TreeNode(4, new TreeNode(8), new TreeNode(9)), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), new TreeNode(7)));

        Solution solution = new Solution();

        solution.levelOrder(treeNode);
        System.out.println();

        solution.preOrder(treeNode);
        System.out.println("-----------------------");

        solution.flatten(treeNode);
        solution.preOrder(treeNode);
        System.out.println();
        solution.levelOrder(treeNode);
        System.out.println();
    }
}
