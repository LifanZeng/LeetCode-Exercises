public class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] seats = new int[n];
        Difference diff = new Difference(seats);

        for(int i=0; i< bookings.length; i++){
            diff.increment(bookings[i][0]-1, bookings[i][1]-1, bookings[i][2]);
        }
        return diff.result();
    }
}
