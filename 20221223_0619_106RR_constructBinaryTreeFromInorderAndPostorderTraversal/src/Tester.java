public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] in = {9,3,15,20,7};
        int[] post = {9, 15, 7, 20, 3};
        TreeNode root = solution.buildTree(in, post);
        solution.levelOrder(root);
        System.out.println();
        solution.preOrder(root);
        System.out.println();
        solution.inOrder(root);
    }
}
