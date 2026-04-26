public class NumberPattern {
    public static void main(String[]args)
    {
        for(int s=1,e=1;s<=5;s+=1,e+=3)
        {
            for(int i=s;i<=e;i+=2)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        
    }
}
