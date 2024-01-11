class Student {

    private String name;

    Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*
     * private final String name;
     * public void setName(String name) {
     * this.name = name;
     * }
     */
    public static void main(String[] args) {
        Student student_obj = new Student("Suresh");
        student_obj.getName();

    }

}