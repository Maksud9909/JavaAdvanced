package Collection.TreeMap;

import Collection.HashMap.hashcode1.Student;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx2 {
    public static void main(String[] args) {
        TreeMap<Student,Double> treeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });
    }
}
