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
            System.out.println(list.get(i));
        }
//        System.out.println(list);

        list.add(43);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        list.set(1, 27);
        System.out.println(list);


    }
}
