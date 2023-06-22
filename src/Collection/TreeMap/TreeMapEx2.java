package Collection.TreeMap;

import Collection.HashMap.hashcode1.Student;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx2 {
    public static void main(String[] args) {
        TreeMap<Student1,Double> treeMap = new TreeMap<>(new Comparator<Student1>() {
            @Override
            public int compare(Student1 st1, Student1 st2) {
                int result = st1.name.compareTo(st2.name);
                if (result == 0){
                    result = st1.age - st2.age;
                    if (result == 0){
                        result = st1.course - st2.age;
                    }
                }
                return result;
            }
        });
        Student1 student1 = new Student1("Maksud",18,1);
        Student1 student2 = new Student1("Anton",43,4);


        treeMap.put(student1,7.5);
        treeMap.put(student2,6.5);
        System.out.println(treeMap);

    }
}
