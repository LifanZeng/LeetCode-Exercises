class Solution {
    // public int maxProfit(int[] prices) {
    //     int lowest = prices[0];
    //     int profit = 0;
    //     int max = 0;
    //     for(int i = 1; i<prices.length; i++){
    //         int curr = prices[i];
    //         lowest = Math.min(curr, lowest);
    //         profit = curr - lowest;
    //         max = Math.max(max, profit);
    //     }
    //     return max;
    // }


    /*1,状态（天数i，最大交易次数的上限限制k，当前持有状态 0或1）、2,选择（买入，卖出，无操作）、3,dp数组定义（状态转换方程），4,Base case*/
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];   //dp数组后面中括号代表的是状态。【天数i】【最大交易次数的上限限制k】【当前持有状态 0或1】。k都是为1，故化简去掉
        for(int i=0; i<n; i++){         //第i天
            if(i-1 == -1){              //Base case. i=0 时是 i-1 是不合法的索引。 特化处理
                dp[i][0] = 0;           //中间的k（交易数）省略了。 0 表示不持有股票。
                //dp[i][0] = Math.max(dp[-1][0], dp[-1][1] + prices[i]) = Math.max(0, -infinity + prices[i]) = 0
                dp[i][1] = -prices[i];  //中间的k省略了。 1 表示持有股票。
                //dp[i][1] = Math.max(dp[-1][1], dp[-1][0]-prices[i]) = Math.max(-infinity, 0-prices[i]) = -prices[i]
                continue;
            }
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]); //没持有股票只有两种可能：1，昨天就没持有，今天rest。2，昨天持有，今天卖出了。
            dp[i][1] = Math.max(dp[i-1][1], -prices[i]);             //持有股票只有两种可能：1，昨天就持有，今天rest。2，昨天没有持有，今天买进。
        }
        return dp[n-1][0];              //n-1表示最后一天。0表示不持有股票。
    }
}
