import java.util.Arrays;

public class Tester {
    public static void main(String[] args){
        String s = "cbaebabacd";
        String p = "abc";
        Solution solution = new Solution();
        System.out.println(solution.findAnagrams(s, p));

        String s2 = "abab";
        String p2 = "ab";
        Solution solution2 = new Solution();
        System.out.println(solution2.findAnagrams(s2, p2));
    }
}
