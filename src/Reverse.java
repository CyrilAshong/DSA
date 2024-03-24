import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        swap(nums,0,4);
        System.out.println(Arrays.toString(nums));
    }

    static public void reverse (int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            swap(arr, start, end);

            start++;
            end--;
        }
    }
    static public void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
