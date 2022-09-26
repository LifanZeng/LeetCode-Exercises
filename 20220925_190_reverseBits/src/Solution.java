public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int outPut = 0;
        int marsk = 1;
        for(int i=0; i<32; i++){
            if((marsk & n) != 0){ // this bit is 1;
                outPut = (outPut<<1) + 1;
            }
            else{
                outPut = (outPut<<1) + 0;
            }
            n = n >> 1;
        }
        return outPut;
    }
}