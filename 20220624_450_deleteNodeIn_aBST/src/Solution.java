class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }

        if(root.val == key){
            if(root.left == null){
                return root.right;
            }   //
            if(root.right == null){
                return root.left;
            }   //这两个if把情况一，情况二都处理了

            //以下处理情况三 ：
            TreeNode minNode = getMin(root.right);  //获取右子树的最小节点。
            root.right = deleteNode(root.right, minNode.val);//删除右子树的最小节点。
            minNode.left = root.left;   //
            minNode.right = root.right; //
            root = minNode;             //用右子树最小的节点替换root节点。
        }
        else if(root.val > key){
            root.left = deleteNode(root.left, key);
        }
        else if(root.val < key){
            root.right = deleteNode(root.right, key);
        }
        return root;
    }


    public TreeNode getMin(TreeNode node){  //BST 最左边就是最小的。
        while(node.left != null){
            node = node.left;
        }
        return node;
    }
}