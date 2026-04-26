public class Four {
    public static void main(String[]args){

    for(int tablenum=1;tablenum<=10;tablenum++)
    {
        if(tablenum%2==1)
        {
            for(int mul=2;mul<=10;mul+=2)
            {
                System.out.println(tablenum*mul);
            }
        }
        else
        {
            for(int mul=1;mul<=10;mul++)
            {
                System.out.println(tablenum*mul);
            }
        }
        
    }
}
}
