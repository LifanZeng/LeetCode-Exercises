import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {     //动态规划思路
        LinkedList<Integer> res = new LinkedList<>();
        if(root==null){
            return res;
        }
        res.add(root.val);
        res.addAll(preorderTraversal(root.left));
        res.addAll(preorderTraversal(root.right));
        return res;
    }
}