public class OderAgnosticBS {
    public static void main(String[] args) {
        int[] numbs = {43, 36, 24, 19, 15, 13, 9, 7, 4, 3, 0, -2, -6, -12};
        int target = 15;

        int ans = orderAgnosticBS(numbs, target);
        System.out.println(ans);
    }

    static public int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            boolean isAsc = arr[start] < arr[end];

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
