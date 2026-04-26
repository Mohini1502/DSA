public class Two {
    public static void main(String []args)
    {
       for(int i=1;i<=10;i++)
       {
             for(int j=1;j<=10;j++)
             {
                System.out.println(i*j);
                for(int num=1;num<=10;num++)
                {
                    System.out.println(i*j*num);
                }
             }
       }
    }
}
