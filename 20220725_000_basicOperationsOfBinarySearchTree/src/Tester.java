public class Tester {
    public static void main(String[] args){
        BinarySearchTree newBST = new BinarySearchTree();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(20);
        newBST.insert(40);
        newBST.preOrder(newBST.root);
        System.out.println();
        newBST.inOrder(newBST.root);
        System.out.println();
        newBST.postOrder(newBST.root);
        System.out.println();
        newBST.levelOrder(newBST.root);
        System.out.println();
        //newBST.search(newBST.root, 78);
        newBST.deleteNode(newBST.root, 30);
        newBST.levelOrder(newBST.root);
        System.out.println();
        newBST.deleteBST();
        newBST.levelOrder(newBST.root);
        System.out.println();
    }
}
