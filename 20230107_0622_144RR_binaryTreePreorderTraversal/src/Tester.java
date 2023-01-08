public class Tester {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3));
        Solution solution = new Solution();
        System.out.println(solution.preorderTraversal(root));
        solution.levelOrder(root);
        System.out.println();
        solution.preOrder(root);
        System.out.println();
        solution.inOrder(root);
    }
}
