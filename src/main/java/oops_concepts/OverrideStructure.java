package oops_concepts;

class OverrideStructure1 {
    void printFunction() {
        System.out.println("Print Function inside Parent Class");
    }

}

class Child1 extends OverrideStructure1 {
    // when we create an object to child class the printfuntion will call
    // the child class function even though parent class is inherited contains the
    // same fucntion name.
    @Override
    public void printFunction() {
        System.out.println("Print Function inside Child Class");
    }

}