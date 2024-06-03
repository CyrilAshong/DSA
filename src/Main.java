
public class Main {
    public static void main(String[] args) {

        int[] numbs = {-12, -6, -2, 0, 3, 4, 7, 9, 13, 15, 19, 21, 49, 63};
        int target = 15;
        int ans = binarySearch(numbs, target);
        System.out.println(ans);
    }



    static public int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;


        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}