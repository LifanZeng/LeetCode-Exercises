public class Tester {
    public static void main(String[] args){
        TreeNode root = new TreeNode(70, new TreeNode(50, new TreeNode(30, new TreeNode(20), new TreeNode(40)), new TreeNode(60)),
                new TreeNode(66, new TreeNode(80), new TreeNode(100)));//70, 50 66, 30 60 80 100, (30)20 40

        Solution solution = new Solution();
        solution.levelOrder(root);
        System.out.println();
        solution.inOrder(root);
        System.out.println();

        System.out.println(solution.isValidBST(root));
        System.out.println("------------------");
        //--------------------------------------------

        TreeNode root2 = new TreeNode(62, new TreeNode(50, new TreeNode(30, new TreeNode(20), new TreeNode(40)), new TreeNode(60)),
                new TreeNode(66, new TreeNode(65), new TreeNode(100)));//62, 50 66, 30 60 65 100, (30)20 40

        Solution solution2 = new Solution();
        solution.levelOrder(root2);
        System.out.println();
        solution.inOrder(root2);
        System.out.println();

        System.out.println(solution.isValidBST(root2));
    }
}
