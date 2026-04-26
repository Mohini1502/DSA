public class Index { 
   public static void main(String[] args)
   {
     int arr[] = {5,2,3,4,3};
     int target = 6;

     // Step 1: Find maximum value in array
     int max = arr[0];
     for(int i = 1; i < arr.length; i++) {
         if(arr[i] > max) {
             max = arr[i];
         }
     }

     // Step 2: Declare helping array
     int[] indexOfVisited = new int[max + 1];

     for(int index = 0; index < arr.length; index++)
     {
        int complement = target - arr[index];

        if(complement >= 0 && complement <= max 
           && indexOfVisited[complement] != 0)
        {
            System.out.println(index);
            System.out.println(indexOfVisited[complement] - 1);
            return;
        }

        indexOfVisited[arr[index]] = index + 1;
     }
   } 
}
