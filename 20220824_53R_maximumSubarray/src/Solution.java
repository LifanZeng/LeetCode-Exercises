class Solution {
    /* 解法一：
     public int maxSubArray(int[] nums) {
         int curr = nums[0];
         int max = nums[0];

         for(int i=1; i<nums.length; i++){
             int temp = nums[i];
             curr = Math.max(curr+temp, temp);
             max = Math.max(max, curr);
         }
         return max;

     }*/

    /* 解法二：
     public int maxSubArray(int[] nums) {
         int n = nums.length;
         int res = nums[0];
         int[] dp = new int[n];
         dp[0] = nums[0];

         for(int i=1; i<n; i++){
             dp[i] = nums[i] + (dp[i-1]>0 ? dp[i-1] : 0); //dp[i-1]为正数则用，为负数则不要
             //dp 问题最重要的是找出目前状态跟上一步状态的关系（复杂问题或许是上几步）。
             //dp[i] 的意思：以 nums[i] 结尾的最大子数组。
             res = Math.max(res, dp[i]);
         }
         return res;
     }*/

    /* 解法三： */
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int[] dp = new int[n];
        //base case, 第一个元素前面没有子数组。
        dp[0] = nums[0];
        //状态转换方程
        for(int i=1; i<n; i++){
            dp[i] = Math.max(nums[i], nums[i] + dp[i-1]);//dp[i-1]为正数则用，为负数则不要
        }

        //得到 nums 的最大子数组
        int res = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            res = Math.max(res, dp[i]);
        }

        return res;
    }

}