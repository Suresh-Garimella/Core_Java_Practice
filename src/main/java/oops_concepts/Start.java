package oops_concepts;

class Main {

    /*
     * private final String name;
     * public void setName(String name) {
     * this.name = name;
     * }
     */
    public static void main(String[] args) {

        System.out.println("Calling the Child class of department");
        SubDepartment cse = new SubDepartment();
        System.out.println("CSE Department Size is :");
        System.out.println(cse.getDepartmentSize());

        Product biscuit = new Product();
        System.out.println("Product class object is created");
        biscuit.setPrice(14.1);
        System.out.println("Setting the value 14.1 to the price variable using the setter");
        System.out.println(biscuit.getPrice());
        System.out.println("get the value of the biscuits using getter");
        System.out.println(biscuit.getPrice(2));
        System.out.println("get the value of 2 biscuits using the overloaded getter");

        OverrideClass obj = new Child();
        obj.printFunction();

    }

}
