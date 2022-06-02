import java.util.Arrays;

public class Tester {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] t = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(solution.dailyTemperatures(t)));

        int[] t2 = {30,40,50,60};
        System.out.println(Arrays.toString(solution.dailyTemperatures(t2)));

        int[] t3 = {30,60,90};
        System.out.println(Arrays.toString(solution.dailyTemperatures(t3)));


    }
}
