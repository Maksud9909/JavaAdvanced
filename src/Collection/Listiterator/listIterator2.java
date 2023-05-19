package Collection.Listiterator;

import org.w3c.dom.ls.LSInput;

import javax.swing.text.AttributeSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class listIterator2 {
    public static void main(String[] args) {
        String rotator = "ror";
        List<Character> list = new ArrayList<>();

        for (char ch:
             rotator.toCharArray()) {
            list.add(ch);
        }


        ListIterator<Character> listIterator = list.listIterator();
        ListIterator<Character> listIteratorPrev = list.listIterator(list.size());

        boolean isPalindrome = true;
        while (listIterator.hasNext() && listIteratorPrev.hasPrevious()){
            if (listIterator.next()!=listIteratorPrev.previous()){
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not polindrome");
        }
    }




}







class Worker {
    String name;
    String surname;
    int salary;

    public Worker(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}