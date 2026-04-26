public class firstOccurence {
    public static void main(String[]args)
    {
        int[] arr={5,10,15,15,30,35};
        int target=15;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int[]arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        int ans=-1;

        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]<target)
                start=mid+1;

            else if(arr[mid]>target)
            {
               end=mid-1;
            }
            else{
                ans=mid;
                end=mid-1;
            }
        }
         return ans;
    }
}

