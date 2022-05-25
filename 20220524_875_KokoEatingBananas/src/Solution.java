class Solution {
    //x: 速度; f(x) 所需小时数; target: h小时; 求 left。
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1000000000+1;

        while (left < right){
            int mid = left + (right - left)/2;
            if (f(piles, mid) <= h ){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

    int f(int[] piles, int x){  //when the speed is x, need f(x) hours to eat off all bananas.
        int hours = 0;
        for (int i=0; i<piles.length; i++){
            hours += piles[i] / x;
            if(piles[i] % x > 0){
                hours++;
            }   //the time to eat off all bananas。 进一法求出小时数。
        }
        return hours;
    }
}