public class Difference {
    private int[] diff;

    public Difference(int[] nums){
        if(nums.length <= 0)
            return;

        diff = new int[nums.length];
        diff[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            diff[i] = nums[i] - nums[i-1]; //
        }
    }

    //给区间 [i, j] 增加　val。
    public void increment(int i, int j, int val){
        diff[i] = diff[i] + val;

        if(j+1 < diff.length){
            diff[j+1] = diff[j+1] - val;
        }
    }

    public int[] result(){
        int[] res = new int[diff.length];
        res[0] = diff[0];
        for(int i=1; i<diff.length; i++){
            res[i] = res[i-1] + diff[i]; //
        }
        return res;
    }
}
