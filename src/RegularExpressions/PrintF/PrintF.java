package RegularExpressions.PrintF;

public class PrintF {
    static void employeeInfo(Employee employee){
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n",
                employee.id,employee.name,employee.surname,
                employee.salary*(1+employee.bonusPoint));
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(1334,"Maksud","Rustamov",500,0.4);
        Employee employee2 = new Employee(3456,"Javohir","Muydinov",1000,0.2);
        Employee employee3 = new Employee(5674,"Umar","Kayumov",890,0.5);

        employeeInfo(employee1);
        employeeInfo(employee2);
        employeeInfo(employee3);

        System.out.println("-----");

        String newString = String.format("%03d \t %-12s \t %-12s \t %,.1f \n",1234,"Maksud","Rustamov",
        456*(456+0.2));
        System.out.println(newString);

    }
}


class Employee {
    int id;
    String name;
    String surname;

    public Employee(int id, String name, String surname, int salary, double bonusPoint) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPoint = bonusPoint;
    }

    int salary;
    double bonusPoint;

}