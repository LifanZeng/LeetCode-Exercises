public class Solution {
    private int[][] memo;   //备忘录

    public int numTrees(int n){
        memo = new int[n+1][n+1];   //备忘录的初始值为0
        return count(1, n);
    }

    private int count(int lo, int hi){ //中序遍历的思维
        if(lo > hi)    //乘法型的 base case, 返回 1.
            return 1;

        if(memo[lo][hi] != 0){      //查备忘录
            return memo[lo][hi];
        }

        int res = 0;
        for(int mid=lo; mid<=hi; mid++){ //中点(root)供选择的可能性
            int left = count(lo, mid-1); //左子树的组合可能性
            int right = count(mid+1, hi); //右子树的组合可能性
            res = res + left * right;  //将左右组合 累加
        }

        memo[lo][hi] = res;  //将结果存入备忘录
        return res;
    }
}
