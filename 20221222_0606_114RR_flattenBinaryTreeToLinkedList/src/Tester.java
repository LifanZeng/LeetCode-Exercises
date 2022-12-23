public class Tester {
    public static void main(String[] args){
        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5, null, new TreeNode(6)));
        Solution solution = new Solution();
        solution.levelOrder(treeNode);
        System.out.println();

        solution.flatten(treeNode);
        solution.levelOrder(treeNode);
    }
}
