public class StarPattern 
{
    public static void main(String[]args)
    {

    int Star=1;
    boolean increasing=true;

    for( int i=1;i<=9;i++)
    {
        for(int j=1;j<=Star;j++)
        {
        System.out.print("*");
        }
       System.out.println();
       if(Star==5)
       {
        increasing=false;
       }

       if(increasing)
       {
         Star++;
       }
       else
       {
        Star--;
       }
    }
  }
}
