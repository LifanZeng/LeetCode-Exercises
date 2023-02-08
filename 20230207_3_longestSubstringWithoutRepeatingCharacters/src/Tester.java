public class Tester {
    public static void main(String[] args){
        String s = "abcabcbb";
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(s));

        String s2 = "bbbbb";
        Solution solution2 = new Solution();
        System.out.println(solution2.lengthOfLongestSubstring(s2));

        String s3 = "pwwkew";
        Solution solution3 = new Solution();
        System.out.println(solution3.lengthOfLongestSubstring(s3));
    }
}
