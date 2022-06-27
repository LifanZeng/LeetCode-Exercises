class Solution {
    int[][] memo;                       //备忘录

    public int numTrees(int n) {
        memo = new int[n+1][n+1];   //备忘录的初始值为0
        return count(1, n);
    }


    public int count(int lo, int hi){
        if(lo > hi)
            return 1;

        if(memo[lo][hi] != 0){      //查备忘录
            return memo[lo][hi];
        }

        int res = 0;
        for(int mid=lo; mid<=hi; mid++){
            int left = count(lo, mid-1);
            int right = count(mid+1, hi);
            res += left * right;
        }

        memo[lo][hi] = res;         //将结果存入备忘录

        return res;
    }
}