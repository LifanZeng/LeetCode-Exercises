public class Tester {
    public static void main(String[] args){
        String s = "ADOBECODEBANC";
        String t = "ABC";
        Solution solution = new Solution();
        System.out.println(solution.minWindow(s, t));

        String s2 = "a";
        String t2 = "a";
        Solution solution2 = new Solution();
        System.out.println(solution2.minWindow(s2, t2));

        String s3 = "a";
        String t3 = "aa";
        Solution solution3 = new Solution();
        System.out.println(solution3.minWindow(s3, t3));
    }
}
