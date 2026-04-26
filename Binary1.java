public class Binary1 {
    public static void main(String[]args)
    {   
        int arr[]={1,5,10,11,12,19,25,35,43,48,59,70};
        int starting=0;
        int target=40;
        int ending=arr.length-1;

        while (starting<=ending)
        {
            int centre=(starting+ending)/2;
             if(arr[centre]==target)
            {
                System.out.println(centre);
            }
            else if(arr[centre]>target)
            {
                ending=centre-1;

            }
            else
            {
                starting=centre+1;
            }
           
            }
            System.out.println(-1);
        }

    }

