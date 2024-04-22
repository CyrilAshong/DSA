import java.util.Arrays;
import java.util.Scanner;

public class Function {
    static public void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end );

            start ++;
            end --;
        }
        System.out.println(Arrays.toString(arr));
    }
    static public void swap(int[] arr, int num1, int num2){
        int item = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = item;
    }

    static public void enter(int[] arr){
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
         System.out.println(Arrays.toString(arr));
    }

    static public void linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            System.out.println("Invalid!!!!");
        }

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == target) {
                System.out.println(arr[i] + " is at index " + i);
            }
        }
    }

    static public void enter2D (int[][] arr) {
        System.out.println("Enter Nine numbers: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static public void linearSearch2D (int[][] arr, int aim ) {
        if (arr.length == 0) {
            System.out.println("Invalid!!!!");
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == aim) {
                    System.out.println("arr");
                }
            }
        }
    }
}
