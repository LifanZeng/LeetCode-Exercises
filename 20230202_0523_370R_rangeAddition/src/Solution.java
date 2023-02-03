class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] res = new int[length];
        Difference diff = new Difference(res);
        for(int i=0; i< updates.length; i++){
            diff.increment(updates[i][0], updates[i][1], updates[i][2]);
        }
        return diff.result();
    }
}