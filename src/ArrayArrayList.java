import java.util.Arrays;
import java.util.Scanner;

public class ArrayArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int element : arr){
            System.out.print(element + " ");
        }

        int[][] arr2D = new int[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = input.nextInt();
            }

        }

//        for (int row = 0; row < 3; row++) {
//            for (int col = 0; col < arr2D[row].length; col++) {
//                System.out.print(arr2D[row][col] + " ");
//            }
//            System.out.println();
//        }

        for (int[] a : arr2D) {
            System.out.println(Arrays.toString(a));
        }
    }
}
