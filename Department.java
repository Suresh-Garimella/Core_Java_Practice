public abstract class Department {
    abstract int getDepartmentSize();
}

class ComputerScience extends Department {
    @Override
    public int getDepartmentSize() {
        return 50;
    }

}