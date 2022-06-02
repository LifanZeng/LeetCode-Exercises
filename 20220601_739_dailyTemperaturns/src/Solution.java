import java.util.Stack;

class Solution {
//this solution is also okay. and much faster.
//     public int[] dailyTemperatures(int[] t) {
//         int[] ans = new int[t.length];

//         Deque<Integer> stack = new ArrayDeque<>();

//         for (int i = t.length-1; i >= 0; i--) {
//             while (!stack.isEmpty() && t[stack.peek()] <= t[i]) {
//                 int last = stack.pop();
//             }

//             ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
//             stack.push(i);
//         }

//         return ans;
//     }


    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> stack = new Stack<>();
        int n = t.length;
        int[] ret = new int[n];
        for(int i = n-1; i>=0; i--){
            while(!stack.isEmpty() && t[stack.peek()] <= t[i] ){
                stack.pop();
            }
            ret[i] = stack.isEmpty()? 0: stack.peek() - i;
            stack.push(i);
        }
        return ret;
    }
}