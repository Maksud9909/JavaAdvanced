package Collection.BinarySearch;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add (-3);
        arrayList.add (8);
        arrayList.add (12);
        arrayList.add (-8);
        arrayList.add (0);
        arrayList.add (5);
        arrayList.add (10);
        arrayList.add (1);
        arrayList.add (150);
        arrayList.add (-30);
        arrayList.add (19);
//        Collections.(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);



//        Employee emp1 = new Employee(100,"Maksud",1224);
//        Employee emp2 = new Employee(35,"Anton",3094);
//        Employee emp3 = new Employee(345,"Andrei",84603);
//        Employee emp4 = new Employee(849,"Anderson",356);
//        Employee emp5 = new Employee(34,"Gas",4567);
//        Employee emp6 = new Employee(56,"Zaur",567);
//        Employee emp7 = new Employee(100,"Rahmon",345);
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(emp1);
//        employeeList.add(emp2);
//        employeeList.add(emp3);
//        employeeList.add(emp4);
//        employeeList.add(emp5);
//        employeeList.add(emp6);
//        employeeList.add(emp7);
//        System.out.println(employeeList);
//        Collections.sort(employeeList);
//        System.out.println(employeeList);
//
//
//
//        int index2 = Collections.binarySearch(employeeList,new Employee(849,"Anderson",356));
//        System.out.println(index2);


//        int [] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int index3 = Arrays.binarySearch(array,150);
//        System.out.println(index3);
//
//        System.out.println(array);
    }
}


class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int resultId =  this.id - anotherEmp.id;
        if (resultId == 0){
             resultId =  this.name.compareTo(anotherEmp.name);
        }
        return resultId;
    }
}