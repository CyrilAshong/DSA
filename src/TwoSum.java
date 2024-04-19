import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;

        twoSum(arr, target);
    }

    static void twoSum(int[] arr, int target){
        for (int k : arr) {
            for (int j = 1; j < arr.length; j++) {
                if (k + arr[j] == target) {
                    int[] result = {k, arr[j]};
                    System.out.println(Arrays.toString(result));
                }
            }
        }
    }
}
