import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class Solution {
    HashMap<String, Integer> memo = new HashMap<>();    //记录所有子树以及出现的次数
    LinkedList<TreeNode> res = new LinkedList<>();      //记录重复的子树根节点

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        return res;
    }

    String traverse(TreeNode root){
        if(root == null){
            return "#";
        }

        String left = traverse(root.left);
        String right = traverse(root.right);

        String subTree = left + "," + right + "," + root.val;
        int freq = memo.getOrDefault(subTree, 0);
        if(freq == 1){                                  //多次重复也只会被加入结果集一次
            res.add(root);
        }
        memo.put(subTree, freq + 1);                    //给子树对应的出现次数加一
        return subTree;
    }
}