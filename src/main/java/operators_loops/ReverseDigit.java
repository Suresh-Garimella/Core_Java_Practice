package operators_loops;

public class ReverseDigit {
    int revDigi(int num) {
        String var = String.valueOf(num);
        // String var = num+"";
        String output = "";
        for (int i = var.length() - 1; i >= 0; i--) {
            output += var.charAt(i);
        }
        return Integer.parseInt(output);
    }

    int usingLoop(int num) {
        int output = 0;
        // 54321
        while (num != 0) {
            int temp = num % 10;
            num = num / 10;
            // System.out.println(num);

            output += temp;
            output *= 10;
        }

        return output / 10;
    }

    public static void main(String[] args) {
        int val = 12345;
        ReverseDigit obj = new ReverseDigit();
        System.out.println(obj.revDigi(val));
        System.out.println(obj.usingLoop(val));
    }

}
