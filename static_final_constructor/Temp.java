package static_final_constructor;

class Temp {
    static int val = 10;

    static int func() {
        return 20;
    }

    public static void main(String[] args) {
        System.out.println("Calling the static value in the class: " + val);
        System.out.println("Calling the static function in the class: " + func());
        FinalClass obj = new FinalClass();
        System.out.println("Calling the final value in the same package: " + obj.var1);
        System.out.println("Calling the final function in the same package: " + obj.func1());

    }
}
