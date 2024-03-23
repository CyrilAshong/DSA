public class LinearSearch2 {
    public static void main(String[] args) {
        int[] nums = {35,29,50,18,19,23,27,-12,-79,88,-56,98,91,66};
        int target = 27;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }
    static public int linearSearch (int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
