public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeNode root = solution.buildTree(new int[]{9,3,15,20,7}, new int[]{9, 15, 7, 20, 3});
        solution.levelOrder(root);
        System.out.println();
        solution.preOrder(root);
        System.out.println();
        solution.inOrder(root);
    }
}
