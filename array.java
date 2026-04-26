public class array{
    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 2, 10};
        int target = 8;

        int indexOf[] = new int[11];

        // manually fill with -1
        for (int i = 0; i < indexOf.length; i++) {
            indexOf[i] = -1;
        }

        // store index
        for (int index = 0; index < arr.length; index++)
            indexOf[arr[index]] = index;

        // find pair
        for (int FI = 0; FI < arr.length; FI++) {

            int secVal = target - arr[FI];

            if (indexOf[secVal] == -1)
                continue;

            if (indexOf[secVal] != FI) {
                System.out.println(FI + " , " + indexOf[secVal]);
                return;
            }
        }
    }
}

