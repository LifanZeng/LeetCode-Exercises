class Solution {
    public boolean carPooling(int[][] trips, int capacity){
        int[] nums = new int[1001];
        Difference df = new Difference(nums);
        for(int[] trip: trips){
            int val = trip[0];
            int i = trip[1];
            int j = trip[2]-1;  //-1
            df.increase(i, j, val);
        }
        int[] res = df.result();
        for(int i=0; i<res.length; i++){
            if (res[i] > capacity)
                return false;
        }
        return true;
    }
}