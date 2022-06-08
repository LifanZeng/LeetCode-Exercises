class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {    //主函数
        return build(nums, 0, nums.length-1);
    }

    TreeNode build(int[] nums, int lo, int hi){ //将 nums[lo...hi] 构造成符合条件的树，返回根节点。
        if(lo > hi){    //base case.
            return null;
        }

        int index = -1, maxVal = Integer.MIN_VALUE;
        for(int i = lo; i<=hi; i++){    //Find the max and its index.
            if(maxVal < nums[i]){
                index = i;
                maxVal = nums[i];
            }
        }

        TreeNode root = new TreeNode(maxVal);
        root.left = build(nums, lo, index-1);   //递归调用构造左右子树（顺序不变，定左中右）。
        root.right = build(nums, index+1, hi);

        return root;
    }
}