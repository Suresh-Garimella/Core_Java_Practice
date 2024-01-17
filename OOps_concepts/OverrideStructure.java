class OverrideStructure {
    void printFunction() {
        System.out.println("Print Function inside Parent Class");
    }
}

class Child extends OverrideStructure {
    // when we create an object to child class the printfuntion will call
    // the child class function even though parent class is inherited contains the
    // same fucntion name.
    @Override
    public void printFunction() {
        System.out.println("Print Function inside Child Class");
    }

    public static void main(String[] args) {

        OverrideStucture obj = new Child();
        obj.printFunction();
    }
}