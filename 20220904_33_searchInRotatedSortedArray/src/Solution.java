public class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0)
            return -1;

        int left = 0;
        int right = nums.length - 1;

        while(left + 1 < right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;         //找到
            }

            if(nums[left] <= nums[mid]){    //mid在上半区
                if(nums[left] <= target && target <= nums[mid]){
                    right = mid;    //mid在前半段，target 落在 left-mid 之间。
                }else{
                    left = mid;     //mid在前半段，target 落在 mid 的右边。
                }
            }
            else{                   //mid在下半区
                if(nums[mid] <= target && target <= nums[right]){
                    left = mid;     //mid在后半段，target 落在 mid-right 之间。
                }else{
                    right = mid;    //mid在后半段，target 落在 mid 的左边。
                }
            }
        }

        if(nums[left] == target){   //检查是否在两端
            return left;
        }
        else if(nums[right] == target){
            return right;
        }
        else{
            return -1;
        }
    }
}