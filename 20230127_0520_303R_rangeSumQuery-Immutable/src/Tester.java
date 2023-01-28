public class Tester {
    public static void main(String[] args){
        int[] numArry = {-2, 0, 3, -5, 2, -1};
        NumArry numArry1= new NumArry(numArry);
        System.out.println(numArry1.sumRange(0, 2));
        System.out.println(numArry1.sumRange(2, 5));
        System.out.println(numArry1.sumRange(0, 5));
    }
}
