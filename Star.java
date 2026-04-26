public class Star {
    public static void main(String[]args){
        for(int gsc=1,osc=5;gsc<=5&& osc>=1;gsc++,osc--)
        {
            for(int i=1;i<=gsc;i++)
            {
                 System.out.print("*");

            }
            System.out.println();
            for(int i=1;i<=osc;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
