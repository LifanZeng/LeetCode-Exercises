public class Tester {
    public static void main(String[] args){
        TreeNode root = new TreeNode(70, new TreeNode(50, new TreeNode(30, new TreeNode(20), new TreeNode(40)), new TreeNode(60)),
                new TreeNode(90, new TreeNode(80), new TreeNode(100)));
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.preOrder(root);
        System.out.println();
        binarySearchTree.inOrder(root);
        System.out.println();
        binarySearchTree.preOrder(root);
        System.out.println();
        binarySearchTree.levelOrder(root);
        System.out.println();

        binarySearchTree.insert(root, 85);
        binarySearchTree.levelOrder(root);
        System.out.println();
        binarySearchTree.preOrder(root);
        System.out.println();

        binarySearchTree.search(root, 80);
        binarySearchTree.search(root, 83);

        binarySearchTree.deleteNode(root, 85);  //Delete a node without children.
        binarySearchTree.levelOrder(root);
        System.out.println();
        binarySearchTree.preOrder(root);
        System.out.println();
        System.out.println();

        binarySearchTree.insert(root, 85);
        binarySearchTree.deleteNode(root, 80);  //Delete a node with one child.
        binarySearchTree.levelOrder(root);
        System.out.println();
        binarySearchTree.preOrder(root);
        System.out.println();

        binarySearchTree.deleteNode(root, 70);  //Delete a node with two children
        binarySearchTree.levelOrder(root);
        System.out.println();
        binarySearchTree.preOrder(root);
        System.out.println();

        binarySearchTree.deleteBST(root);   //删不干净， 剩root。 ？？
        binarySearchTree.levelOrder(root);
        System.out.println();
        binarySearchTree.preOrder(root);
        System.out.println();
    }
}
