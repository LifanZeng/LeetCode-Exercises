import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high){
        if(root == null)
            return root;

        if(low <= root.val && root.val <= high){ //root.val 在 [low, high] 之间。
            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);
        }
        else{
            if(root.val > high){ //root.val 比 high 大，则 root 和右边全部会被剪掉，剩左边。
                root = trimBST(root.left, low, high);
            }
            else if(root.val < low){ //root.val 比 low 小，则 root 和左边全部会被剪掉，剩右边。
                root = trimBST(root.right, low, high);
            }
        }
        return root;
    }
}
