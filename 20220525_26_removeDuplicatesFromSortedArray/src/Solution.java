import java.util.Arrays;

public class Solution { //快慢双指针
    public int removeDuplicates(int[] nums) {
        System.out.println(Arrays.toString(nums));
        if(nums.length == 0){
            return 0;
        }
        int slow = 0, fast = 0;
        while (fast < nums.length){
            if(nums[fast] != nums[slow]){   //Because it is a sorted array!!
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        System.out.println(Arrays.toString(nums));
        return slow+1;  // The length equal index+1.
    }
}
