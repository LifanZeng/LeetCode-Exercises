/**
 * Given an array of integers nums sorted in non-decreasing order, find the starting and
 * ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 *
 * Example 2:
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 *
 * Example 3:
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 */

public class Solution {

    private int left_bound(int[] nums, int target){
        int left = 0;
        int right = nums.length; //左闭右开
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }
            else if(nums[mid] > target){
                right = mid;
            }
            else if(nums[mid] == target){
                right = mid;
            }
        }
        return left; //左边界的思想就是找出比 target 小的数有多少个。
    }


    private int right_bound(int[] nums, int target){
        int left = 0;
        int right = nums.length; //左闭右开
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }
            else if(nums[mid] > target){
                right = mid;
            }
            else if(nums[mid] == target){
                left = mid+1;
            }
        }
        return right;//右边界的思想就是找出比 target 大的数有多少个。
    }


    public int[] searchRange(int[] nums, int target) {
        int left = left_bound(nums, target);
        int right = right_bound(nums, target);
        int[] res = {left, right-1};
        int[] nullArray = {-1, -1};
        return (left<=right-1 && nums.length>0)? res: nullArray;
    }
}
