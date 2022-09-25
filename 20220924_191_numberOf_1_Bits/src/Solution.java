public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int marsk = 1;
        int bits = 0;
        for(int i=0; i<32; i++){
            if((marsk & n) != 0){
                bits++;
            }
            marsk = marsk << 1;
        }
        return bits;
    }
}