import java.util.Arrays;

public class Tester {
    public static void main(String[] args){
        int numCourses = 4;
        int[][] prerequisites = {{1,0}, {2,0}, {3,1},{3,2}};
        Solution solution = new Solution();
        int[] res = solution.findOrder(numCourses, prerequisites);
        System.out.println(Arrays.toString(res));

        int numCourses2 = 2;
        int[][] prerequisites2 = {{1,0}};
        Solution solution2 = new Solution();
        int[] res2 = solution.findOrder(numCourses2, prerequisites2);
        System.out.println(Arrays.toString(res2));
    }
}
