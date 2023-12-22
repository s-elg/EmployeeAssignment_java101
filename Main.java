package EmployeeAssingment;

public class Main {
    public static void main(String[] args) {
        Employee ali = new Employee("ali", 11900, 50, 2002);
        ali.printEmployee();

        Employee sedat = new Employee("sedat", 857, 42, 2020);
        sedat.printEmployee();

        Employee kadir = new Employee("kadir", 15421, 39, 1999);
        kadir.printEmployee();
    }
}
