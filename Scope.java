public class Scope {
    public static void main(String[]args){
    int a=10;
    int b=20;
    String name="Mohini";
    {
        int a=78;//already initialised outside the block in the same method,hence you cannot initialise it again
        a=100; //you cannot initialise but you can change the value of the original reference variable
        System.out.println(a);
        int c=99;
        name="Moksha";
        System.out.println(name);//values initialised in this block,will remain in block   
     }
     int c=900;
     System.out.println(a);
     System.out.println(name);//values insidenin this block will remain in block
     //System.out.println(c);//cannot use out the block
     for(int i=0;i<4;i++)
     {
        System.out.println(i);
        int num=90;
        a=10000;
     }
     System.out.println(a);
    }
    static void random(int marks)
    {
        int num=67;
        System.out.println(num);
        System.out.println(marks);

    }
}
    