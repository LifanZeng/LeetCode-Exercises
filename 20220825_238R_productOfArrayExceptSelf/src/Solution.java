class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] L = new int[len];
        int[] R = new int[len];
        int[] result = new int[len];
        L[0] = 1;
        R[len-1] = 1;
        for(int i=1; i<len; i++){
            L[i] = L[i-1] * nums[i-1]; //左数组每个元素 = 其前一个元素 * nums[i-1]
        }

        for(int i=1; i<len; i++ ){
            R[len-1-i] = R[len-i] * nums[len-i];//右数组每个元素 = 其后一个元素 * nums[len-i]
        }

        for(int i=0; i<len; i++ ){
            result[i] = L[i] * R[i];    //
        }

        return result;
    }
}