public class SignPattern {
    public static void main(String[] args) {

        int minus = 0;
        int pair = 1;

        for (int row = 1; row <= 6; row++) {

            if (row == 1) {
                System.out.println("+");
            } 
            else {
                
                for (int i = 1; i <= minus; i++) {
                    System.out.print("-");
                }

                for (int j = 1; j <= pair; j++) {
                    System.out.print("-+");
                }

                System.out.println();
            }

            minus++;
            pair++;
        }
    }
} 
