public class maximum {
     public static void main(String[] args) {
        int N = 10;  // example input
        
        int level = 0;
        int required = 1;

        while (N >= required) {
            N -= required;
            level++;
            required++;
        }

        System.out.println("Maximum level: " + level);
    }
    
}
