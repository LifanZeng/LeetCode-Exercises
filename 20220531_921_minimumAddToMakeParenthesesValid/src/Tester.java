public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        String s = "())";
        System.out.println(solution.minAddToMakeValid(s));
        String s2 = "(((";
        System.out.println(solution.minAddToMakeValid(s2));
    }
}
