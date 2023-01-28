import java.util.HashMap;

/**
 * Given an array of integers nums and an integer k, return the total number of
 * subarrays whose sum equals to k.
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * Example 1:
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 *
 * Example 2:
 * Input: nums = [1,2,3], k = 3
 * Output: 2
 *
 * P38.
 */
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        // map: 前缀和 --> 出现次数
        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1); // base case(前缀和(0) --> 出现次数(1))

        int res = 0;
        int sum0_i = 0;
        for(int i=0; i<n; i++){
            sum0_i += nums[i]; //sum0_i是目录为i时的累积和
            int sum0_j = sum0_i - k; //sum0_j是我们想找的累积和, nums[0...j]
            if(preSum.containsKey(sum0_j))
                res += preSum.get(sum0_j); //如果前面有这个前缀和，则直接更新答案
            //把前缀和 nums[0...i] 加入并记录出现的次数
            preSum.put(sum0_i, preSum.getOrDefault(sum0_i, 0)+1);
        }
        return res;
    }
}
