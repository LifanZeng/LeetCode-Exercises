public class Tester {
    public static void main(String[] args){
        TreeNode root = new TreeNode(7, new TreeNode(5, new TreeNode(3, new TreeNode(2), new TreeNode(4)), new TreeNode(6)),
                new TreeNode(9, new TreeNode(8), new TreeNode(10)));

        Solution solution = new Solution();
        solution.levelOrder(root);
        System.out.println();
        solution.preOrder(root);
        System.out.println();

        solution.levelOrder(solution.searchBST(root, 5));
        System.out.println();
        solution.preOrder(solution.searchBST(root, 5));
    }
}
