package Collection.Listiterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class listIterator {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();

        for (char ch:
             s.toCharArray()) { // он здесь их превращает в буквы то есть в char
            list.add(ch);
        }
        ListIterator<Character> listIterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size()); // здесь мы говорим с какой позиции нужно начать читать(с конца)
        boolean  isPalindrome = true;
        while (listIterator.hasNext() && reverseIterator.hasPrevious()){
            if (listIterator.next() != reverseIterator.previous()){
               isPalindrome = false;
               break;
            }
        }


        if (isPalindrome){
                System.out.println("Polindrome");
        }else {
            System.out.println("Not Polindrome");
        }
    }
}
