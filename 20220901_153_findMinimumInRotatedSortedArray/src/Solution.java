//class Solution {
//     public int findMin2(int[] nums) {
//         if(nums.length == 1){
//             return nums[0];
//         }

//         int left = 0;
//         int right = nums.length - 1;
//         if(nums[right] > nums[0]){
//             return nums[0];
//         }

//         while (right >= left){
//             int mid = left + (right - left)/2;
//             if (nums[mid] > nums[mid + 1]) {         //
//                 return nums[mid + 1];
//             }
//             if (nums[mid - 1] > nums[mid]) {
//                 return nums[mid];
//             }
//             if (nums[mid] > nums[0]) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }
//         return -1;
//     }


// public int findMin(int[] nums) {
// 	int low = 0;
// 	int high = nums.length-1;
// 	while(low<high){
// 		int mid = low +(high-low)/2;
// 		if(nums[mid]>nums[high]){
// 			low = mid+1;
// 		}else{
// 			high = mid;
// 		}
// 	}
// 	return nums[low];
// }



public class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(nums[0] < nums[n-1])
            return nums[0];

        int lo = 0, hi = n-1;
        while(lo<hi){
            int mid = lo + (hi - lo)/2;
            if(mid > 0 && nums[mid] < nums[mid-1]){ //当前数比前面数小，则当前数就是最小值
                return nums[mid];
            }

            if(nums[mid] > nums[mid+1]){    //当前数比后面数大，则后面数就是最小值
                return nums[mid+1];
            }

            if(nums[lo] < nums[mid]){   //最左边的lo小于mid就表示最小值肯定在右边，因为必须是包含rotate这个点的值才是最小，
                lo = mid+1;
            }else{                      //反之rotate在左边
                hi = mid - 1 ;
            }                                                                                                                                                                                                                                                                                                                   }
        return nums[lo];
    }
}