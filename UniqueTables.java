public class UniqueTables {
    public static void main(String[] args) {

        for (int n = 1; n <= 100; n++) {   // unique numbers
            System.out.println("Table of " + n);

            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }

            System.out.println();
        }
    }
}

