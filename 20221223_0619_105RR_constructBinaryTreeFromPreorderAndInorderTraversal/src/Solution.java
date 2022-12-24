import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
//        if(preOrder==null || inOrder==null)
//            return  null;
        return build(preOrder, 0, preOrder.length-1, inOrder, 0, inOrder.length-1);
    }

    public TreeNode build(int[] preOrder, int preStart, int preEnd,
                          int[] inOrder, int inStart, int inEnd){
//        if(preOrder==null || inOrder==null){
//            return  null;
//        }
        if(preStart > preEnd){
            return null;
        }
        int rootVal = preOrder[preStart];
        int rootPosition = 0;
        for(int i=inStart; i<=inEnd; i++){
            if(inOrder[i]==rootVal){
                rootPosition = i;
                break;
            }
        }
        int leftSize = rootPosition - inStart;
        TreeNode root = new TreeNode(rootVal);
        root.left = build(preOrder, preStart+1, preStart+leftSize,
                inOrder,inStart, rootPosition-1);
        root.right = build(preOrder, preStart+leftSize+1, preEnd,
                inOrder,rootPosition+1, inEnd);
        return root;
    }

    //preOrder Traversal
    public void preOrder(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    //inOrder Traversal
    public void inOrder(TreeNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }
    //levelOrder Traversal
    public void levelOrder(TreeNode node){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            TreeNode presentNode = queue.remove();
            System.out.print(presentNode.val + " ");
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
    }
}
