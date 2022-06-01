public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        String s = "(()))";
        System.out.println(solution.minInsertions(s));
        String s2 = "())";
        System.out.println(solution.minInsertions(s2));
        String s3 = "))())(";
        System.out.println(solution.minInsertions(s3));
    }
}
