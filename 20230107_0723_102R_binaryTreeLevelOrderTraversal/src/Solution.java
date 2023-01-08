import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root == null)
            return res;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size(); // size: 该级的元素数量。
            List<Integer> level = new LinkedList<>();

            for(int i=0; i<size; i++){
                TreeNode presentNode = queue.remove();
                level.add(presentNode.val);

                if(presentNode.left != null)
                    queue.add(presentNode.left);
                if(presentNode.right != null)
                    queue.add(presentNode.right);
            }  //该级的左右子元素成为下一级的元素。
            res.add(level);
        }
        return res;
    }
}
