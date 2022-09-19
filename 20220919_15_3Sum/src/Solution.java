import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// nSum 系列问题的核心思路就是 排序+双指针
// 先给数组从小到大排序，然后双指针lo和hi分别在数组开头和结尾，这样就可以控制nums[lo] 和 nums[hi] 这两数之和的大小。
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        Arrays.sort(nums);                                  //排序，为了跳过重复值

        for(int i=0; i<nums.length-2; i++){                           //最大是　n-3, 因为后面还有两个数　b,c
            if(i==0 || (i>0 && nums[i] != nums[i-1])){
                int low = i+1;
                int high = nums.length - 1;
                int sum = 0 -nums[i];

                while(low < high){
                    if(nums[low] + nums[high] == sum){
                        res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(low<high && nums[low]==nums[low+1]) low++;    // lo跳过相同值
                        while(low<high && nums[high]==nums[high-1]) high--; // hi跳过相同值
                        low++;
                        high--;
                    }
                    else if(nums[low] + nums[high] > sum){
                        high--;                                     // Case 2: nums[lo] + nums[hi] > target --> hi--
                    }
                    else{
                        low++;                                      // Case 1: nums[lo] + nums[hi] < target --> lo++
                    }
                }
            }
        }
        return res;
    }
}




// nSum 系列问题的核心思路就是 排序+双指针
// 先给数组从小到大排序，然后双指针lo和hi分别在数组开头和结尾，这样就可以控制nums[lo] 和 nums[hi] 这两数之和的大小。
//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> res = new ArrayList<>();
//        Arrays.sort(nums);
//        int n = nums.length;
//        for(int i=0; i<n-2; i++){
//            if(nums[i] > 0)
//                break;
//            if(i>0 && nums[i]==nums[i-1])
//                continue;                                   //避免重复值
//            int target = 0 - nums[i];
//            int lo = i + 1, hi = n-1;
//            while(lo<hi){
//                int tmpSum = nums[lo] + nums[hi];
//                if(tmpSum == target){
//                    res.add(Arrays.asList(new Integer[]{nums[i], nums[lo], nums[hi]}));
//                    lo++;
//                    while(lo<hi && nums[lo]==nums[lo-1]){   // lo跳过相同值
//                        lo++;
//                    }
//                    hi--;
//                    while(lo<hi && nums[hi]==nums[hi+1]){   // hi跳过相同值
//                        hi--;
//                    }
//                }
//                else if(tmpSum < target){                   // Case 1: nums[lo] + nums[hi] < target --> lo++
//                    lo++;
//                }
//                else{
//                    hi--;                                   // Case 2: nums[lo] + nums[hi] > target --> hi--
//                }
//            }
//        }
//        return res;
//    }
//}