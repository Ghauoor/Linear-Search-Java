package Questions;

public class Search_In_Array {
    public static void main(String[] args) {
        int[] arr = {1,23,4,5,5,64,43};
        int start = 1;
        int end = 5;
        int target = 5;

        System.out.println(searchInRange(arr,target,start,end));

    }
    static int searchInRange(int[] arr, int target, int start, int end){
        if (arr.length == 0)
            return -1;

        for (int i = start; i < end; i++) {
            int element = arr[i];

            if (target == element)
                return i;


        }
        return -1;
    }
}
