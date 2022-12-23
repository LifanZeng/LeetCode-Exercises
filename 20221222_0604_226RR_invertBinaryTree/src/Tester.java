public class Tester {
    public static void main(String[] args){
        TreeNode treeNode = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        Solution solution = new Solution();
        solution.levelOrder(treeNode);
        System.out.println();

        solution.invertTree(treeNode);
        solution.levelOrder(treeNode);

    }
}
