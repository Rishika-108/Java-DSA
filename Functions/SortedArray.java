package Functions;

public class SortedArray {

    public static boolean IsSorted (int arr[], int index) {
         if (index == arr.length-1) {
            return true;
         }

        if (arr[index] < arr[index+1]) {
            //Array is sorted
            return IsSorted (arr, index+1);
        } else  {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] =  {1,8,5};
        System.out.println(IsSorted(arr, 0));
    }
}
