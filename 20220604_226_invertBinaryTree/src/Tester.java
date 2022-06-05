public class Tester {
    public static void main(String[] args){
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));

        Solution solution = new Solution();
        solution.invertTree(root);

        System.out.println(root.val+ " "+ root.left.val + " "+ root.right.val);
        System.out.println(root.left.val + " "+ root.left.left.val + " " +root.left.right.val);
        System.out.println(root.right.val + " "+ root.right.left.val + " " +root.right.right.val);
    }
}
