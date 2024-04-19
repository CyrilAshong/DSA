import java.util.Arrays;

public class Array2DSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 45, 67},
                {32, 17, 81, 92},
                {88, 10, 27, 99, 20},
                {57, 44}
        };
        int target = 27;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

        int result = max(arr);
        System.out.println(result);


    }

    static public int[] search (int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    static public int max (int[][] arr){
        int element = Integer.MIN_VALUE; // or int element = arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > element) {
                    element = anInt;
                }
            }
        }
        return element;
    }
}
