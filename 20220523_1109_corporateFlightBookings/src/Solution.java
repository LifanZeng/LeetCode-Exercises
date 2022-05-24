class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] nums = new int[n];
        Difference df = new Difference(nums);
        for(int[] booking: bookings){
            int i = booking[0] -1;
            int j = booking[1] - 1;
            int val = booking[2];
            df.increment(i, j, val);
            //nums = df.result();
        }
        return df.result();
    }
}