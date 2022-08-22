import java.util.HashMap;

public class Solution {
     /*这个解法简单粗暴，但时间复杂度为 O(N^2)
     public int[] twoSum(int[] nums, int target) {
         int[] result = new int[2];
         for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
         return result;
     }
     */


    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(target - nums[i])){
                map.put(nums[i], i);
            }
            else{
                res[1] = i;
                res[0] = map.get(target - nums[i]);
                break;
            }
        }

        return res;
    }
}
