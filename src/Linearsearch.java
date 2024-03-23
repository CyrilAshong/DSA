import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        int[] nums = {2, 23, 24, 32, 42, 54, 45, 46, 89, 79, 50, 91, 69};
        int target;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Search: ");
        target = input.nextInt();
        String results = search1(target, nums);
        System.out.println(results);
    }
        static public String search1(int target, int [] arr) {
            if (arr.length == 0) {
                return "Not eligible";
            }
            for (int i = 0; i < arr.length; i++) {
                int element = arr[i];
                if (element == target) {
                    return "Present at index " + i ;
                }
            }return "Not present";

        }


}

