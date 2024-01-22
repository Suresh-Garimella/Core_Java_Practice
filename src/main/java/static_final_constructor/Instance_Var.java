package static_final_constructor;

public class Instance_Var {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println("Initialized using default Constructor");
        System.out.println(
                "instance variable val in Child Class  :" + obj.j + "\ninstance variable val in Parent Class  :"
                        + obj.i);

        Child obj1 = new Child(16);
        System.out.println("Initialized using parameterized Constructor");
        System.out.println(
                "instance variable val in Child Class  :" + obj1.j + "\ninstance variable val in Parent Class  :"
                        + obj1.i);
    }
}

class Parent {
    int i;

    Parent() {
        this.i = 5;
    }
}

class Child extends Parent {
    int j;

    Child() {

        super.i = 20;
        this.j = 10;
    }

    Child(int j) {
        super.i = 15;
        this.j = j;
    }
}
