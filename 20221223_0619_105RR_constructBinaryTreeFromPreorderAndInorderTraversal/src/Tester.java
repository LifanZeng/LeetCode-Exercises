public class Tester {
    public static void main(String[] args){
        int[] pre = {3,9,20,15,7};
        int[] in = {9,3,15,20,7};
        Solution solution = new Solution();
        TreeNode root = solution.buildTree(pre, in);
        solution.levelOrder(root);
        System.out.println();
        solution.preOrder(root);
        System.out.println();
        solution.inOrder(root);
    }
}
