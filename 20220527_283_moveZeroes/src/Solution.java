import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int p=removeElement(nums, 0);
        for(; p<nums.length; p++){  //把slow停下来以后的位置赋零。
            nums[p] = 0;
        }
    }

    int removeElement(int[] nums, int val) {
        int fast = 0;
        int slow = 0;
        while(fast < nums.length){
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++; //等于 val 的位置被 nums[slow] 取消。
        }
        //System.out.println(Arrays.toString(nums));
        return slow;
    }
}