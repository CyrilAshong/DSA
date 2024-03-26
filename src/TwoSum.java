import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.print("Enter target number: ");
        int target = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    int[] num = {arr[i],arr[j]};
                    System.out.println(Arrays.toString(num));
                }
            }
        }
    }
}
