public class Tester {
    public static void main(String[] args){
        TreeNode root = new TreeNode(70, new TreeNode(50, new TreeNode(30, new TreeNode(20), new TreeNode(40)), new TreeNode(60)),
                new TreeNode(90, new TreeNode(80), new TreeNode(100)));

        Solution solution = new Solution();
        solution.levelOrder(root);
        System.out.println();
        solution.inOrder(root);
        System.out.println();

        solution.insertIntoBST(root, 70);
        solution.levelOrder(root);
        System.out.println();
        solution.inOrder(root);
        System.out.println();
    }
}
