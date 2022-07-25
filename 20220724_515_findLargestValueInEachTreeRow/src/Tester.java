public class Tester {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1, new TreeNode(3, new TreeNode(5), new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(9)));
        Solution solution = new Solution();
        System.out.println(solution.largestValues(root));
    }
}
