/**
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas.
 * The guards have gone and will come back in h hours.
 * Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile.
 * If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
 * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
 * Return the minimum integer k such that she can eat all the bananas within h hours.
 *
 * 可可喜欢吃香蕉。 有 n 堆香蕉，第 i 堆有 piles[i] 根香蕉。 警卫已经离开，将在 h 小时后回来。　Koko 可以决定她每小时吃香蕉的速度Ｋ。
 * 每小时，她选择一些香蕉，并从那堆香蕉中吃掉 k 个香蕉。 如果一堆香蕉少于 k 根，她会吃掉所有香蕉，并且在这一小时内不再吃香蕉。Koko 喜欢
 * 慢慢吃，但还是想在警卫回来之前吃完所有的香蕉。返回使她可以在 h 小时内吃完所有香蕉的最小整数 k。
 *
 * Example 1:
 * Input: piles = [3,6,7,11], h = 8
 * Output: 4　(速度：个/小时)　
 *1+2+2+3 = 8 　　h为吃完所有香蕉的时间
 *
 * Example 2:
 * Input: piles = [30,11,23,4,20], h = 5
 * Output: 30
 *1+1+1+1+1 = 5
 *
 * Example 3:
 * Input: piles = [30,11,23,4,20], h = 6
 * Output: 23
 *2+1+1+1+1 = 6
 */

/* 分析：
 *  * x: 速度
 *  * f(x): 所需时间
 *  * target: H小时
 *  * 求左边界 left.
 */


/**
 * 二分搜索算法三部曲：
 * １.　确定 ｘ，f(x)，target 分别是什么，并写出函数ｆ的代码。
 * ２.　找到 ｘ 的取值范围作为二分搜索的搜索区间，初始化 left 和 right 变量。
 * ３.　根据题目的要求，确定应该使用搜索左侧还是搜索右侧的二分搜索算法，写出解法代码。
 */
public class Solution {
    //在 f(x) == target 的约束下求ｘ的最值。
    public int minEatingSpeed(int[] piles, int h) {
        // 问自己：自变量 x 的最小值是多少？
        int left = 1; //?
        // 问自己：自变量 x 的最大值是多少？
        int right = 1000000000+1; //? 由此而来　Constraints:1 <= piles.length <= 10^4; piles.length <= h <= 10^9; 1 <= piles[i] <= 10^9.

        while(left < right){
            int mid = left + (right - left) / 2;
            if(f(piles, mid) == h){
                right = mid;
            }
            else if(f(piles, mid) < h){
                    right = mid;
                }
            else if(f(piles, mid) > h){
                left = mid + 1;
            }
        }
        return left;
    }

//函数 f 是关于自变量 x 的单调函数。
// *  * x: 速度
// *  * f(x): 所需时间
// *  * target: H小时
// *  * 求左边界 left.
    private int f(int[] piles, int x){ //当速度是ｘ，需要 f(x)小时吃完所有香蕉。
        int hours = 0;
        for(int i=0; i<piles.length; i++){
            hours = hours + piles[i] / x;
            if(piles[i] % x > 0){ //有剩，进一。If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
                hours++;
            }
        }
        return hours;
    }
}
