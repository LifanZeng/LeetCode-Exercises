// X
// class Solution {
//     public int maxProduct(int[] nums) {
//         int n = nums.length;
//         int[] dp = new int[n];
//         dp[0] = nums[0];
//         int res = Integer.MIN_VALUE;

//         for(int i=1; i<n; i++){
//             dp[i] = Math.max(nums[i], nums[i]*dp[i-1]);
//         }

//         for(int i=0; i<n; i++){
//             res = Math.max(res, dp[i]);
//         }

//         return res;
//     }
// }


//X
// class Solution {
//     public int maxProduct(int[] nums) {
//         int n = nums.length;
//         int[] dp = new int[n];
//         int[] dp_min = new int[n];
//         dp[0] = nums[0];
//         dp_min[0] = nums[0];
//         int res = Integer.MIN_VALUE;

//         for(int i=1; i<n; i++){
//             dp_min[i] = Math.min(nums[i], nums[i]*dp[i-1]);
//             dp[i] = Math.max(Math.max(nums[i], nums[i]*dp[i-1]), nums[i] * dp_min[i-1]);
//         }

//         for(int i=0; i<n; i++){
//             res = Math.max(res, dp[i]);
//         }

//         return res;
//     }
// }



/* ok
class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null)
            return 0;

        int max=nums[0];
        int min=nums[0];
        int result = max;

        for(int i=1; i<nums.length; i++){
            int curr = nums[i];
            int tempMax = Math.max(curr, Math.max(max*curr, min*curr));
            min = Math.min(curr, Math.min(max*curr, min*curr));
            max = tempMax;
            result = Math.max(result, max);
        }
        return result;
    }
}
*/

class Solution {
        //三种情况： 1，之前最大（如10）乘以当前值（如5），得最大值50.
        //          2，之前最小值（如-10）乘以当前值（如-5），得最大值50.
        //          3，本身。如之前是-10，本身是10000。最大值当然为本身10000.
        public int maxProduct(int[] nums) {
            if(nums == null)
                return 0;

            int max=nums[0];    //保存dp中的最大值，对应情况1
            int min=nums[0];    //保存dp中的最小值，对应情况2
            int res = nums[0];

            for(int i=1; i<nums.length; i++){
                int temp = max; //把 max 先存起来
                max = Math.max(Math.max(max*nums[i], min*nums[i]), nums[i]);  //三种情况对比
                min = Math.min(Math.min(min*nums[i], temp*nums[i]), nums[i]); //

                res = Math.max(max, res);   //不断确认当前结果是否最大
            }
            return res;
        }
}
