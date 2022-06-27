import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<TreeNode> generateTrees(int n) {
        if(n==0)
            return new LinkedList<>();

        return build(1, n);         //构造闭区间 [1, n] 组成的BST
    }

    public List<TreeNode> build(int lo, int hi){ //构造闭区间 [1, n] 组成的BST
        List<TreeNode> res = new LinkedList<>();

        if(lo > hi){
            res.add(null);
            return res;
        }

        for(int i=lo; i<=hi; i++){  //1,穷举 root 节点的所有可能
            List<TreeNode> leftTree = build(lo, i-1);   //
            List<TreeNode> rightTree = build(i+1, hi);  //2,递归构造出左右子树的所有合法 BST。
            for(TreeNode left: leftTree){
                for(TreeNode right: rightTree){ //3，给 root 节点穷举所有左右子树的组合。
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
    }
}