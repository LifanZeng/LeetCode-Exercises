public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        for(TreeNode l: solution.generateTrees(4)){
            solution.levelOrder(l);
            System.out.println();
            solution.preOrder(l);
            System.out.println();
            solution.inOrder(l);
            System.out.println();
            System.out.println();
        }
    }
}
