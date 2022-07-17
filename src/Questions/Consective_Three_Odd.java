package Questions;

public class Consective_Three_Odd {
    public static void main(String[] args) {

        int[] arr = {1,2,34,3,4,5,7,23,12};

        System.out.println(threeConsecutiveOdds(arr));

    }
    public static boolean threeConsecutiveOdds(int[] arr){
        int count = 0;

        for (int j : arr) {
            if (j % 2 == 1) {
                count++;

                if (count == 3) {
                    return true;
                }

            } else {
                count = 0;
            }
        }

        return false;
    }
}
