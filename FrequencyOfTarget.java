public class FrequencyOfTarget {

    public static void main(String[] args) {

        int[] arr = {2,5,5,5,6,7};
        int target = 5;

        System.out.println(freqOfTarget(arr, target));
    }

    static int freqOfTarget(int arr[], int target) {

        int first = binarySearch(arr, target, true);

        if (first == -1)
            return 0;

        int last = binarySearch(arr, target, false);

        return last - first + 1;
    }

    static int binarySearch(int arr[], int target, boolean findFirst) {

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
                ans = mid;

                if (findFirst)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }

        return ans;
    }
}
