public class Difference {
    private int[] diff;

    public Difference(int[] nums){
        diff = new int[nums.length];
        diff[0] = nums[0];
        for(int i=1; i<diff.length; i++){
            diff[i] = nums[i] - nums[i-1];
        }
    }

    public void increment(int i, int j , int val){
        diff[i] = diff[i] + val;
        if(j+1 < diff.length){
            diff[j+1] = diff[j+1] - val;
        }
    }

    public int[] result(){
        int[] res = new int[diff.length];
        res[0] = diff[0];
        for(int i=1; i<diff.length; i++){
            res[i] = diff[i] + res[i-1];
        }
        return res;
    }
}
