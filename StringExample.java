import java.util.Scanner;

public class StringExample {
    public static void main(String[]args)
    {
  //      String message = greet();
   //     System.out.println(message);
          Scanner in=new Scanner(System.in);
          System.out.print("Enter your Name");
          String name=in.nextjav();
          String personal=myGreet(name);
          System.out.println(personal);
    }
        
//    static String greet()
    //{
      //  String greeting="Hello It's Mohini Here";
      //  return greeting;
   // }
   static String myGreet(String name)
   {
    String message="Hello "  + name;
    return message;
   }
}


