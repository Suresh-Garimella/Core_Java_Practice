package operators_loops;

public class Pattern {
    public static void main(String[] args) {
        /*
         * 
         * ++++--
         * +++---
         * ++----
         * +-----
         * ------
         * 
         */
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print("+");
            }
            for (int k = i; k < 7; k++) {
                System.out.print("-");
            }
            System.out.println("");
        }
    }

}
