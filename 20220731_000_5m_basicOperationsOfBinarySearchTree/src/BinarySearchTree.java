import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    //PreOrder Traversal. Time: O(N)
    public void preOrder(TreeNode root){
        if(root==null)
            return;

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //InOrder Traversal. Time: O(N)
    public void inOrder(TreeNode root){
        if(root==null)
            return;

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    //PostOrder Traversal. Time: O(N)
    public void postOrder(TreeNode root){
        if(root==null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    //LevelOrder Traversal. Time: O(N)
    public void levelOrder(TreeNode root){
        if(root==null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode presentNode = queue.remove();
            System.out.print(presentNode.val + " ");

            if(presentNode.left!=null)
                queue.add(presentNode.left);
            if(presentNode.right!=null)
                queue.add(presentNode.right);
        }
    }

    //REAL BST Search method. Time: O(Log N)
    public TreeNode search(TreeNode root, int value){
        if(root == null){
            System.out.println(value + " is Not found.");
            return null;
        }else if(root.val == value){
            System.out.println(value + " is found.");
            return root;
        }else if (value < root.val){
            return search(root.left, value);
        }else{
            return search(root.right, value);
        }
    }

    //Insert Method, Time: O(Log N)
    public TreeNode insert(TreeNode root, int value){
        if(root == null){
            TreeNode newNode = new TreeNode();
            newNode.val = value;
            //System.out.println("The value successfully inserted.");
            return newNode;
        }else if(value <= root.val){
            root.left = insert(root.left, value);
            return  root;
        }else{
            root.right = insert(root.right, value);
            return root;
        }
    }

    //Minimum node
    public static TreeNode minimumNode(TreeNode root){
        if(root.left == null){
            return root;
        }else{
            return minimumNode(root.left);
        }
    }

    //Delete a node.  Time: O(Log N)
    public TreeNode deleteNode(TreeNode root, int value){
        if(root == null){
            System.out.println("Value not found in BST");
            return null;
        }

        if(value < root.val){
            root.left = deleteNode(root.left, value);
        }else if(value > root.val){   //
            root.right = deleteNode(root.right, value);
        }else{
            if(root.left != null && root.right != null){
                TreeNode temp = root;
                TreeNode minNodeForRight = minimumNode(temp.right);
                root.val = minNodeForRight.val;
                root.right = deleteNode(root.right, minNodeForRight.val);
            }else if(root.left != null){
                root = root.left;
            }else if(root.right != null){
                root = root.right;
            }else{
                root = null;
            }
        }
        return root;
    }

    //Delete the BST. Time: O(1)
    public void deleteBST(TreeNode root){
        root.left = null;
        root.right = null;
        root = null;

        System.out.println("BST has been deleted successfully.");
    }
}
