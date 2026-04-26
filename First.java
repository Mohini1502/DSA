import java.util.Scanner;

class First{
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter number 1:");
        int num1=in.nextInt();
         System.out.println("Enter number 2:");
        int num2=in.nextInt();
         System.out.println("Enter number 3:");
        int num3=in.nextInt();
         System.out.println("Enter number 4:");
        int num4=in.nextInt();
         int sum=num1+num2+num3+num4;
        System.out.println(sum);


    }

}