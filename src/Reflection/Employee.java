package Reflection;

public class Employee {
    public int id;
    public String name;
    public String department;
    private int salary = 2000;

    public Employee() {
    }



    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

//    public Employee(int id, String name, String department, int salary) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.salary = salary;
//    }

    public void changeDepartment(String newDepartment) {
        department = newDepartment;
        System.out.println("New department is " + department);
    }

    public void increaseSalary() {
        salary *= 2;
    }
}
