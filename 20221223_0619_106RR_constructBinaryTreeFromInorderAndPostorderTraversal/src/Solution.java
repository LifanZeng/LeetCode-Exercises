import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public TreeNode buildTree(int[] inOrder,int[] postOrder){
        return build(inOrder, 0, inOrder.length-1,
                postOrder, 0, postOrder.length-1);
    }

    public TreeNode build(int[] inOrder, int inStart, int inEnd,
                          int[] postOrder, int postStart, int postEnd){
        if(inStart > inEnd){
            return null;
        }

        int rootVal=postOrder[postEnd];
        int rootPosition=0;
        for(int i=inStart; i<=inEnd; i++){
            if(inOrder[i] == rootVal){
                rootPosition = i;
                break;
            }
        }
        int leftSize = rootPosition - inStart;

        TreeNode root = new TreeNode(rootVal);
        root.left = build(inOrder, inStart, rootPosition-1,
                postOrder, postStart, postStart+leftSize-1);
        root.right = build(inOrder, rootPosition+1, inEnd,
                postOrder, postStart+leftSize, postEnd-1);
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
