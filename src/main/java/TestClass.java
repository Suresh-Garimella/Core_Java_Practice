import Test.Class1;
import Test.Interface1;

public class TestClass {
    public static void main(String[] args) {

        Class1.subFunction(new Interface1() {
            @Override
            public void function1(int a) {

            }

            @Override
            public void function2(float b) {

            }
        });
    }
}
