public class lastOccurence {

    public static void main(String[] args) {

        int[] arr = {2,5,5,5,6,7};
        int target = 5;

        int ans = lastOccurence(arr, target);
        System.out.println(ans);
    }

    static int lastOccurence(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] < target)
                start = mid + 1;

            else if (arr[mid] > target)
                end = mid - 1;

            else {
                ans = mid;       // store index
                start = mid + 1; // move right for last occurrence
            }
        }

        return ans;
    }
}
