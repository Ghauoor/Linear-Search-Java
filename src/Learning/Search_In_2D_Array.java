package Learning;

import java.util.Arrays;

public class Search_In_2D_Array {

    public static void main(String[] args) {

        int[][] arr= {
            {1, 23, 45},
            {2, 34, 55, 99},
            {49, 33, 12, 57},
                {14,18}
        };
        int target = 18;
            int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        if (arr.length == 0)
            System.out.print("This array is Empty");

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target)
                    return new int []{row, col};
            }
        }
        return new int[]{-1, -1};
    }


}
