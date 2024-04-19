public class EvenDigits {
//    public static void main(String[] args) {
//        int[] nums = {12, 34, 45, 56, 67, 78, 89, 90};
//
//        System.out.println(findNumbers(nums));
//
//    }
//
//    static  int findNumbers(int[] arr) {
//        int count = 0;
//
//        for(int element : arr){
//            if (even(element)) {
//                count ++;
//            }
//        }
//
//        return count;
//    }
//
//    static boolean even(int num) {
//        int numOfDIgits = digits(num);
//
//        if(numOfDIgits % 2 == 0){
//            return true;
//        }
//        return false;
//    }
//
//    static int digits(int num) {
//        int count = 0;
//
//        while (num > 0){
//            count++;
//
//            num /= 10;
//        }
//        return count;
//    }
//


    public static void main(String[] args) {
        int[] nums = {123, 3, 34, 452, 56, 67, 7843, 8, 906};

        System.out.println(findEvenNumberDigits(nums));
    }

    static int findEvenNumberDigits(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numOfDigits = digits(num);
        if (numOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits(int num) {
        int count = 0;

        while(num > 0){
            count++;

            num /= 10;
        }
        return count;
    }
}









