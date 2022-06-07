public class Tester {
    public static void main(String[] args){

        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(5, null, new TreeNode(6)));
        Solution solution = new Solution();
        solution.flatten(root);
        TreeNode tmp = root;
        System.out.println(tmp.val);
        while(tmp.right != null){
            System.out.println(tmp.left+" "+ tmp.right.val);
            tmp = tmp.right;
        }
    }
}
