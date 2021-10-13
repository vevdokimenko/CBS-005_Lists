package homework.task3;

/*
* Используя класс Zoo Задания 2, удалить 3, 5, 7 животные,
* узнать размер списка и вывести в консоль.
* */

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add(0,"Bull");
        animals.add(1,"Bear");
        animals.add(2,"Crocodile");
        animals.add(3,"Wolf");
        animals.add(4,"Lion");
        animals.add(5,"Elephant");
        animals.add(6,"Horse");
        animals.add(7,"Leopard");

        animals.remove(7);
        animals.remove(5);
        animals.remove(3);

        System.out.println(animals.size());
    }
}
