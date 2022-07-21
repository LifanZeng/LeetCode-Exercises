public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        TreeNode root = solution.buildTree(new int[]{1,2,4,5,3,6,7}, new int[]{4,5,2,6,7,3,1});
        solution.levelOrder(root);
        System.out.println();
        solution.preOrder(root);
        System.out.println();
        solution.inOrder(root);
    }
}
