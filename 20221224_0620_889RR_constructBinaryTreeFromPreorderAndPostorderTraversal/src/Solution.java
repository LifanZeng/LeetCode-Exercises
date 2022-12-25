import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public TreeNode buildTree(int[] preOrder, int[] postOrder){
        return build(preOrder, 0, preOrder.length-1,
                postOrder, 0, postOrder.length-1);
    }

    public TreeNode build(int[] preOrder, int preStart, int preEnd,
                          int[] postOrder, int postStart, int postEnd){
        if(preStart > preEnd){
            return null;
        }
        if(preStart == preEnd){
            return new TreeNode(preOrder[preStart]);
        }

        int rootVal = preOrder[preStart];
        int leftRootVal = preOrder[preStart+1];
        int index = 0;
        for(int i=postStart; i<postEnd; i++){
            if(postOrder[i]==leftRootVal){
                index=i;
                break;
            }
        }
        int leftSize = index - postStart +1;

        TreeNode root = new TreeNode(rootVal);
        root.left = build(preOrder, preStart+1,  preStart+leftSize, postOrder, postStart, postStart+leftSize-1);
        root.right = build(preOrder,  preStart+leftSize+1, preEnd, postOrder, postStart+leftSize, postEnd);
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
