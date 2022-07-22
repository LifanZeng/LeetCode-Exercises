import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Tester {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3, new TreeNode(2, new TreeNode(4), null), new TreeNode(4)));
        Solution solution = new Solution();
        List<TreeNode> output = solution.findDuplicateSubtrees(root);  //Debug can see the detail.
    }
}
