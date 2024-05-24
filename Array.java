public class Array {

    public static int staticSum(int [] num)
    {
        int sum = 0;
        for (int j : num) {
            sum += j;
        }
        return sum;
    }

    public static void main(String[] args) {
//        This is static array creation
        int [] num = {1,2,3,4,5};

        System.out.println("sum is : " + staticSum(num));
    }
}
