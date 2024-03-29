import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if(root == null)
            return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            int levelMax = Integer.MIN_VALUE;

            for(int i=0; i<size; i++){
                TreeNode presentNode = queue.remove();
                levelMax = Math.max(levelMax, presentNode.val);

                if(presentNode.left != null)
                    queue.add(presentNode.left);
                if(presentNode.right != null)
                    queue.add(presentNode.right);
            }
            res.add(levelMax);
        }
        return res;
    }
}
