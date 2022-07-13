public class Tester {
    public static void main(String[] args){
        TreeNode treeNode = new TreeNode("N1",
                new TreeNode("N2", new TreeNode("N4", new TreeNode("N8"), new TreeNode("N9")), new TreeNode("N5")),
                new TreeNode("N3", new TreeNode("N6"), new TreeNode("N7")));

        Solution solution = new Solution();
        solution.preOrder(treeNode);
        System.out.println();
        solution.inOrder(treeNode);
        System.out.println();
        solution.postOrder(treeNode);
        System.out.println();
        solution.levelOrder(treeNode);
        System.out.println();

        solution.search(treeNode, "N8");

        System.out.println(solution.findDeepestNode(treeNode).val);

        solution.deleteDeepestNode(treeNode);
        solution.levelOrder(treeNode);
        System.out.println();

        solution.Insert(treeNode, "N9");
        solution.levelOrder(treeNode);
        System.out.println();

        solution.deleteGivenNode(treeNode, "N4");
        solution.levelOrder(treeNode);
        System.out.println();
        solution.preOrder(treeNode);
        System.out.println();

        solution.deleteBT(treeNode);
        solution.levelOrder(treeNode);
        System.out.println();
    }
}
