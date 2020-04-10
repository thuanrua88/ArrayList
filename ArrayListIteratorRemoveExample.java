package ArrayListEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorRemoveExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(18);
        numbers.add(25);
        numbers.add(40);

        Iterator<Integer> numbersItertor = numbers.iterator();
        while (numbersItertor.hasNext()){
            Integer num = numbersItertor.next();
            if (num % 2 != 0) {
                numbersItertor.remove();
            }
        }
        System.out.println(numbers);
    }
}
