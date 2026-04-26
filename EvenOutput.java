public class EvenOutput {
    public static void main(String[]args)
    {
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                for(int mul=1;mul<=10;mul++)
                {
                    System.out.println(i*mul);
                }
            }
        }
    }
}
