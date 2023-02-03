public class Solution {

    public boolean carPooling(int[][] trips, int capacity){
        Difference diff = new Difference(new int[capacity]);

        for(int i=0; i<trips.length; i++){
            diff.increment(trips[i][1], trips[i][2], trips[i][0]);
        }
        int[] res = diff.result();
        for(int i=0; i<res.length; i++){
            if(res[i] > capacity)
                return false;
        }
        return true;
    }
}
