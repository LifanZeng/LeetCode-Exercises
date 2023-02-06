public class Tester {
    public static void main(String[] args){
        String s1 = "ab";
        String s2 = "eidbaooo";
        Solution solution = new Solution();
        System.out.println(solution.checkInclusion(s1, s2));

        String s3 = "ab";
        String s4 = "eidboaoo";
        Solution solution2 = new Solution();
        System.out.println(solution2.checkInclusion(s3, s4));
    }
}
