public class Multiple {
    public static void main(String[]args)
    {
        int[] arr={5,10,15,15,30,35};
        int target=15;
        boolean ans=binarySearch(arr,target);
        System.out.println(ans);

    }
    static boolean binarySearch(int[]arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]<target)
            {
                start=mid+1;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else{
                if((mid>0 && arr[mid-1]==target)||(mid<arr.length-1 &&arr[mid+1]==target))
                return true;
                
                return false;
            }
        }
        return false;
    }
}
