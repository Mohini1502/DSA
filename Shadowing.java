public class Shadowing {
    static int x=90;//This will be shadowed at line 7
    public static void main(String[]args)
    {
        System.out.println(x);
      //  int x;
      //  system.out.println(x);//scope will begin when value is initialized
        int x=40;// The class variable at line 4 is shadowed by this
        System.out.println(x);//40
        fun();
    }
    static void fun()
    {
        System.out.println(x);
    }
    
}
