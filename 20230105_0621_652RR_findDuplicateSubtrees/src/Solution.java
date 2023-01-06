import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//对每一个节点： 1,以我为根的这棵二叉树长啥样？ 2，以其它节点为根的节点长啥样？
public class Solution {
    private HashMap<String, Integer> memo = new HashMap<>(); //记录所有子树以及出现的次数
    private LinkedList<TreeNode> res = new LinkedList<>();   //记录重复的子树根节点

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        return res;
    }

    public String traverse(TreeNode root){
        if(root == null){
            return "#";
        }

        String left = traverse(root.left);
        String right = traverse(root.right);
        String subTree = left + "," + right + "," + root.val; //以我为根的这棵二叉树长啥样？ postOrder traversal.

        int freq = memo.getOrDefault(subTree, 0); //当subTree第一次刚生成的时候，它还不是key，这个时候对应不到value
        if(freq == 1){  //多次重复也只会被加入结果集一次
            res.add(root);
        }
        memo.put(subTree, freq +1 ); //给子树对应的出现次数加一
        return subTree;
    }
    //----------------------------------

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
