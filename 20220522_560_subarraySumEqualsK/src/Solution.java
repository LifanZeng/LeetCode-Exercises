import java.util.HashMap;

class Solution {
    //It is ok, but not very good.
    public int subarraySum0(int[] nums, int k) {
        int n = nums.length;
        int[] preSum = new int[n+1];
        preSum[0] = 0;
        for(int i=1; i<=n; i++){
            preSum[i] = preSum[i-1] + nums[i-1];
        }
        int res=0;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                if(preSum[i] - preSum[j] == k)
                    res++;
            }
        }
        return res;
    }

    //this one is good.
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> preSum = new HashMap<>();     // 前缀和 --> 出现次数
        preSum.put(0, 1);   // base case
        int sum0_i = 0, res = 0;
        for(int i=0; i<n; i++){
            sum0_i = sum0_i + nums[i]; //前缀和
            int sum0_j = sum0_i - k;
            if (preSum.containsKey(sum0_j)) //如果前面有这个前缀和，则直接更新答案
                res = res + preSum.get(sum0_j);
            preSum.put(sum0_i, preSum.getOrDefault(sum0_i, 0)+1);
        }
        return res;
    }
}