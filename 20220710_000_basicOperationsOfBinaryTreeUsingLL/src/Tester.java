public class Tester {
    public static void main(String[] args){
        TreeNode treeNode = new TreeNode("N1",
                new TreeNode("N2", new TreeNode("N4", new TreeNode("N8"), new TreeNode("N9")), new TreeNode("N5")),
                new TreeNode("N3", new TreeNode("N6"), new TreeNode("N7")));

        Solution solution = new Solution();
        solution.preOrder(treeNode);
        System.out.println();

        solution.inOrder(treeNode);
        System.out.println();

        solution.postOrder(treeNode);
        System.out.println();

        solution.levelOrder(treeNode);
        System.out.println();

        solution.setRoot(treeNode);
        solution.search("N5");

        solution.insert("N10");
        solution.preOrder(treeNode);
        System.out.println();
        solution.levelOrder(treeNode);
        System.out.println();
//        System.out.println("The deepest node is: "+solution.getDeepestNode().val);
//
//        solution.deleteDeepestNode();
//        solution.levelOrder(treeNode);
//        System.out.println();
        solution.deleteNode("N3");
        solution.preOrder(treeNode);
        System.out.println();
        solution.levelOrder(treeNode);
        System.out.println();

        solution.deleteBT();    //传参删了，外部BT还在。直接 treeNode=null 可删外部BT。
    }
}

