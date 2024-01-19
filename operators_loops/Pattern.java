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

        int row = 5;
        int col = 2;
        int flag = 1;
        int plus = row;
        int minus = col;
        for (;;) {
            if (flag == 1) {
                if (plus > 1) {
                    System.out.print("+");
                    plus -= 1;
                } else {
                    row -= 1;
                    plus = row;
                    flag = 0;
                    continue;
                }
            } else {
                if (minus > 0) {
                    System.out.print("-");
                    minus -= 1;
                    if (minus == 0)
                        System.out.println();
                } else {
                    col += 1;
                    minus = col;
                    if (col == 7) {
                        break;
                    }
                    flag = 1;
                    continue;
                }

            }

            if (row <= 1 && col == 7) {
                break;
            }
        }

        System.out.println("\n\n&&&&&&&&&&&&&&&&&\n\n");

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
