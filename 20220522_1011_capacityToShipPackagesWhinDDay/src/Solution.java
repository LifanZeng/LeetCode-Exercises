public class Solution {
        public int shipWithinDays(int[] weights, int days) {
            int left = 0;
            int right = 1;
            for (int w: weights){
                left = Math.max(left, w);
                right += w;
            }

            while (left < right){
                int mid = left + (right - left )/2;
                if (f(weights, mid) <= days){
                    right = mid;
                }
                else{
                    left = mid + 1;
                }
            }
            return left;
        }


        int f(int[] weights, int x){ //when carrying capacity is x, need f(x) days to carry off all goods.
            int days = 0;
            for (int i = 0; i<weights.length; ){
                int cap = x;
                while (i < weights.length){
                    if(cap<weights[i])
                        break;
                    else
                        cap -= weights[i];  //the left capacity space
                    i++;
                }
                days++;
            }
            return days;
        }
}
