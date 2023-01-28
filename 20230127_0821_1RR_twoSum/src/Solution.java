import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 */
public class Solution {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>(); //key是值；value是目录
        int[] res = new int[2];     //result
        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(target - nums[i])){ //如果map中不含有其配子，则将其(nums[i], i)放进 map 中.
                map.put(nums[i], i);
            }
            else{   ////如果map中含有其配子，则表示已经成功找到。
                res[0] = map.get(target - nums[i]); //按key找value，用值找目录
                res[1] = i;                         //另一个配子的目录
                break;
            }
        }
        return res;
    }
}
