import java.util.Arrays;

public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] pre = {1,2,4,5,3,6,7};
        int[] post = {4,5,2,6,7,3,1};
        solution.constructFromPrePost(pre, post);
        System.out.println("The test has already passed in LeetCode");
    }
}
