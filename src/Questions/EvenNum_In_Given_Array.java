package Questions;

public class EvenNum_In_Given_Array {
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};

        System.out.println(findNumbers(nums));

        System.out.println(digits(-3455545));

        System.out.println(digit(345535));

        System.out.println(findNumber(nums));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int i :
                nums) {
            if (even(i))
                count++;
        }

        return count;
    }

    private static boolean even(int num) {
        int numOfDigit = digits(num);

        return numOfDigit % 2 == 0;

    }
    static int digits(int nums){

        if (nums < 0)
            nums *= -1;

        if (nums == 0)
            return 1;

        int count = 0;

        while (nums > 0){
            count ++;
            nums = nums / 10;

        }

        return count;
    }
    static int digit(int num){
        return (int)(Math.log10(num)) + 1;
    }
    //Another Solution

    public static int findNumber(int[] nums){
        int count =  0;
        for (int i :
                nums) {
            int len = String.valueOf(i).length();

            if (len % 2 == 0)
                count++;
        }
        return count;
    }
}
