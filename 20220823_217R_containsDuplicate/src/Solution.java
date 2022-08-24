import java.util.HashMap;

class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=1; i<nums.length; i++){
//             if(nums[i-1] == nums[i])
//                 return true;
//         }
//         return false;

//     }




    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }
            else
                return true;
        }

        return false;
    }
}


