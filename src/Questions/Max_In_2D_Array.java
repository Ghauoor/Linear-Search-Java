package Questions;

public class Max_In_2D_Array {
    public static void main(String[] args) {
        int[][] arr= {
                {1, 23, 45},
                {2, 34, 55, 99},
                {49, 33, 12, 57},
                {14,18}
        };
        System.out.println(maxInTwoDArray(arr));

    }
    static int maxInTwoDArray(int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
