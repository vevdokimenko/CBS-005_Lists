package homework.task4;

/*
* Используя Intelij IDEA создать проект, пакет.
* Создать класс Main, создать список целых чисел
* и используя ListIterator пройтись по списку и увеличить значения на 1;
* */

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 100));
        }

        ListIterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            Integer el = iterator.next() + 1;
            System.out.println(el);
        }
    }
}
