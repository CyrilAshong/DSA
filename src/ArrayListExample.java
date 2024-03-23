import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(53);
//        list.add(39);

        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
