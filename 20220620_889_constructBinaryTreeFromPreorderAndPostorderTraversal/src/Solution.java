class Solution {
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return build (preorder, 0, preorder.length-1, postorder, 0, postorder.length-1);
    }

    TreeNode build(int[] preorder, int preStart, int preEnd, int[] postorder, int postStart, int postEnd){
        if(preStart > preEnd){
            return null;
        }
        if(preStart == preEnd){
            return new TreeNode(preorder[preStart]);
        }
        int rootVal = preorder[preStart];       //root节点对应的就是前序遍历数组的第一个元素
        int leftRootVal = preorder[preStart+1]; //root.left的值是序遍历数组的第二个元素。 不唯一的关键是这一句！！
        int index = 0;
        for(int i=postStart; i<postEnd; i++){
            if(postorder[i] == leftRootVal){
                index = i;
                break;
            }
        }
        int leftSize = index - postStart + 1;   //左子树的元素个数
        TreeNode root = new TreeNode(rootVal);  //先构造当前的根节点

        //递归构造左右子树。根据左子树的根节点索引和元素个数推导左右子树的索引边界
        root.left = build(preorder, preStart+1, preStart+leftSize, postorder, postStart, index);
        root.right = build(preorder, preStart+leftSize+1, preEnd, postorder, index+1, postEnd-1);
        return root;
    }
}