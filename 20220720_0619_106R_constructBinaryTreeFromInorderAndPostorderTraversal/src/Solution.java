import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder){
        return build(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }

    public TreeNode build(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd){
        if(inStart > inEnd){
            return null;
        }

        int rootVal = postorder[postEnd];
        int index = 0;
        for(int i=inStart; i<=inEnd; i++){
            if(inorder[i] == rootVal){
                index = i;
                break;
            }
        }
        int leftSize = index - inStart;

        TreeNode root = new TreeNode(rootVal);
        root.left = build(inorder, inStart, index-1, postorder, postStart, postStart+leftSize-1);
        root.right = build(inorder, index+1, inEnd, postorder, postStart+leftSize, postEnd-1);
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
