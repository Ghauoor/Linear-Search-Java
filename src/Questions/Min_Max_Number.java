package Questions;

public class Min_Max_Number {
    public static void main(String[] args) {
        int[] arr = {1,23,4,5,45,54,5};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}

