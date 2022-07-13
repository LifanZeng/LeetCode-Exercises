import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private TreeNode root;

    //preOrder Traversal
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //inOrder Traversal
    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    //postOrder Traversal
    public void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    //levelOrder Traversal
    public void levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
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

    //Search a value
    public void search(TreeNode root, String value){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode presentNode = queue.remove();
            if(presentNode.val == value){
                System.out.println(presentNode.val + " is found in the Tree.");
                return; //return 直接回到主程序。 break只是跳出循环。
            }
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
        System.out.println(value + " is NOT found in the Tree.");
    }

    //Find the deepest node.
    public TreeNode findDeepestNode(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        TreeNode presentNode = null;
        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    //Delete the deepest node.
    public void deleteDeepestNode(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        TreeNode previousNode, presentNode = null;
        while(!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.left == null){
                previousNode.right = null;
                System.out.println("Deleted deepest node successfully.");
                return;
            }
            else if(presentNode.right == null){
                presentNode.left = null;
                System.out.println("Deleted deepest node successfully.");
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    //Insert a value in level order.
    public void Insert(TreeNode root, String value){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode presentNode = queue.remove();
            if(presentNode.left == null){
                presentNode.left = new TreeNode(value);
                return;
            }
            else if(presentNode.right == null){
                presentNode.right = new TreeNode(value);
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    //Delete a given node.
    public void deleteGivenNode(TreeNode root, String value){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode deepestNode = findDeepestNode(root);
        while(!queue.isEmpty()){
            TreeNode presentNode = queue.remove();
            if(presentNode.val == value){
                presentNode.val = deepestNode.val;
                deleteDeepestNode(root);
                System.out.println("The node " + value + " deleted successfully.");
                return; //return 直接回到主程序。 break只是跳出循环。
            }
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
        System.out.println(value + " is NOT found in the Tree.");
    }

    //Delete binary tree
    public void deleteBT(TreeNode root){
        root.val = null;
        root.left = null;
        root.right = null;
        System.out.println("Binary tree has been successfully deleted!");
    }
}
