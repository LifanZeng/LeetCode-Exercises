public class Solution {
    public Node connect(Node root){
        if(root == null)
            return null;
        connectTwoNode(root.left, root.right);
        return root;
    }

    public void connectTwoNode(Node n1, Node n2){
        if(n1==null || n2==null){
            return;
        }
        n1.next = n2;
        connectTwoNode(n1.left, n1.right);
        connectTwoNode(n1.right, n2.left);
        connectTwoNode(n2.left, n2.right);
    }
}
