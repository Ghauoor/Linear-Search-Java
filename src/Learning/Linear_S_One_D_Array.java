package Learning;

public class Linear_S_One_D_Array {
    public static void main(String[] args) {
        int[] arr = {1,23,4,5,6,54,5,6,5};
        int target = 5;

        System.out.print("Index of Element is : "+linearSearch(arr,target));
        System.out.println();
        System.out.print("Element is : "+linearSearchEle(arr,target));



    }
    //Return the index of element-->
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0)
            return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
    // Return the Element -->
    static int linearSearchEle(int[] arr, int target){
        if (arr.length == 0)
            return -1;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (arr[i] == target)
                return element;
        }
        return Integer.MIN_VALUE;
    }
}
