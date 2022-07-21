public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeNode root = solution.constructMaximumBinaryTree(new int[]{3,2,1,6,0,5});
        solution.levelOrder(root);
        System.out.println();
        solution.preOrder(root);
        System.out.println();
        solution.inOrder(root);
    }
}
